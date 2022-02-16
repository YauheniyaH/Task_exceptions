package by.epam.com.read.write.file.calc.updated;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NumberWriter {

	private String path;
	private List<Data> data;

	public NumberWriter(String path, List<Data> data) {
		this.path = path;
		this.data = data;
	}

	public boolean save() throws NumberParserException {
		FileWriter writer =null;
		try  {
			writer=new FileWriter(this.path, false);
			// запись всей строки
			for (int i = 0; i < this.data.size(); i++) {
				writer.write(format(this.data.get(i)) + "\n");
			}

			writer.flush();
		} catch (IOException e) {

			throw new NumberParserException(e);
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				throw new NumberParserException(e);
			}
		}

		return true;
	}

	private String format(Data d) {
		return d.getNumber1() + " " + d.getSign().getSign() + " " + d.getNumber2() + "=" + d.getResult();
	}

}
