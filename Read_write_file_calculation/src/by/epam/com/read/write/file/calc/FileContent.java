package by.epam.com.read.write.file.calc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileContent {

	private String fileName;


	FileContent(String fileName) {
		this.fileName = fileName;

	}

	public String getFileName() {
		return fileName;
	}

	

	public List<String> fileReader() {
		Path file = Path.of(getFileName());

		List<String> list = new ArrayList<String>();

		try {
			list = Files.readAllLines(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

	public List<String> getFormulas(List<String> list) {

		List<String> formulas = new ArrayList<String>();

		Pattern pattern = Pattern.compile("\\d+ \\d+ [+|\\-|/|*]");

		for (int i = 0; i < list.size(); i++) {
			Matcher matcher = pattern.matcher(list.get(i));
			if (matcher.find())
				formulas.add(matcher.group());
		}
		return formulas;

	}

}
