package by.epam.com.read.write.file.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formula {

	private double firstNum;
	private double secondNum;
	private char sign;
	private double result;
	private String resultToFile;

	public void calc() {

		switch (this.sign) {
		case '+':
			this.result = this.firstNum + this.secondNum;
			this.resultToFile=this.firstNum +"+"+ this.secondNum+"="+this.result;
			break;
		case '-':
			this.result = this.firstNum - this.secondNum;
			this.resultToFile=this.firstNum +"-"+ this.secondNum+"="+this.result;
			break;
		case '*':
			this.result = this.firstNum * this.secondNum;
			this.resultToFile=this.firstNum +"*"+ this.secondNum+"="+this.result;
			break;
		case '/':
			try {
				this.result = this.firstNum / this.secondNum;
				this.resultToFile=this.firstNum +"/"+ this.secondNum+"="+this.result;
			} catch (ArithmeticException e) {
				System.out.println("divide by zero");
			}
			break;
		}

	}

	public double getResult() {
		return result;
	}

	public void setFirstNum(String formula) {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(formula);
		if (matcher.find())
			this.firstNum = Double.parseDouble(matcher.group());

	}

	public void setSecondNum(String formula) {
		Pattern pattern = Pattern.compile(" \\d+ ");
		Matcher matcher = pattern.matcher(formula);
		if (matcher.find())
			this.secondNum = Double.parseDouble(matcher.group());
	}

	public void setSign(String formula) {
		Pattern pattern = Pattern.compile("[+|\\-|/|*]");
		Matcher matcher = pattern.matcher(formula);
		if (matcher.find())
			this.sign = (matcher.group()).charAt(0);

	}

	public double getFirstNum() {
		return firstNum;
	}

	public double getSecondNum() {
		return secondNum;
	}

	public char getSign() {
		return sign;
	}

	@Override
	public String toString() {
		return resultToFile;
	}

}
