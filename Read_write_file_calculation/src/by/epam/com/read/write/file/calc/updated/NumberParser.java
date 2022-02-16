package by.epam.com.read.write.file.calc.updated;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberParser {
	private Pattern delimeter = null;
	
	public Data parse(String str) throws DataParserException {
		if(!validate(str)) {
			throw new DataParserException("validation exception");
		}
		Data result = new Data ();
		//Sign sign = null;
		
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(str);
		if (matcher.find())
			result.setNumber1(Double.parseDouble(matcher.group()));
		
		Pattern pattern2 = Pattern.compile(" \\d+ ");
		Matcher matcher2 = pattern2.matcher(str);
		if (matcher2.find())
			result.setNumber2(Double.parseDouble(matcher2.group()));
		
		Pattern pattern3 = Pattern.compile("[+|\\-|/|*]");
		Matcher matcher3 = pattern3.matcher(str);
		if (matcher3.find()) {
			switch ((matcher3.group()).charAt(0)) {
			case '+':
				result.setSign(Sign.PLUS);
				break;
			case'-':
				result.setSign(Sign.MINUS);
				break;
			case '*':
				result.setSign(Sign.MYLTIPLYING);
				break;
			case '/':
				result.setSign(Sign.DIVISION);
				break;
			}
			
		}
			
		
		return result;
	}
	
	private boolean validate(String data) {
		//if (data.matches("\\d+ \\d+ [+|\\-|/|*]"))
			return true;
		//else {
		//	return false;
	//	}
		
	//}

}}
