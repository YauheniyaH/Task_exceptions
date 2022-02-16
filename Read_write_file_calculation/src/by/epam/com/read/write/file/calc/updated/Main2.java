package by.epam.com.read.write.file.calc.updated;

import java.util.List;






public class Main2 {
	public static void main(String[] args) {

		String file1 = "resources/file1.txt";

		NumberReader nReader = null;
		List<Data> fileData = null;
		NumberParser parser= new NumberParser();
		NumberCalculator calculator = null;
		NumberWriter writer=null;

		
		try {
			nReader = new NumberReader(file1, parser);
			fileData = nReader.take();
			
			calculator = new NumberCalculator(fileData);
			fileData = calculator.calc();
			writer= new NumberWriter("resources/file2.txt",fileData);
			writer.save();
		} catch (NumberParserException e) {
			System.out.println("Yps");
		}
	}
}
