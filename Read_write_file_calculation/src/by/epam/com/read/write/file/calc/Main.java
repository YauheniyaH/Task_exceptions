package by.epam.com.read.write.file.calc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		List<String> formulas = new ArrayList<String>();

		FileContent f = new FileContent("C:\\Users\\Yauheniya_Hladkaya\\my docs\\file 1.txt");

		formulas = f.fileReader();
		formulas = f.getFormulas(formulas);

		for (String s : formulas) {
			System.out.println(s);
		}

		List<Formula> listFormulas = new ArrayList<Formula>();

		for (int i = 0; i < formulas.size(); i++) {
			listFormulas.add(new Formula());
			listFormulas.get(i).setFirstNum(formulas.get(i));
			listFormulas.get(i).setSecondNum(formulas.get(i));
			listFormulas.get(i).setSign(formulas.get(i));
			listFormulas.get(i).calc();
			System.out.println(listFormulas.get(i).toString());
		}

		/*
		 * Formula f1= new Formula(); f1.setFirstNum(formulas.get(0));
		 * f1.setSecondNum(formulas.get(0)); f1.setSign(formulas.get(0));
		 * System.out.println(f1.getFirstNum()); System.out.println(f1.getSecondNum());
		 * System.out.println(f1.getSign()); f1.calc();
		 * System.out.println(f1.getResult()); System.out.println(f1.toString());
		 */

		try (FileWriter writer = new FileWriter("C:\\Users\\Yauheniya_Hladkaya\\my docs\\file2.txt", false)) {
			// запись всей строки
			for (int i = 0; i < listFormulas.size(); i++) {
				writer.write(listFormulas.get(i).toString()+"\n");
			}

			writer.flush();
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}

	}

}
