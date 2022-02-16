package by.epam.com.read.write.file.calc.updated;

public enum Sign {
	PLUS ("+"), 
	MINUS ("-"), 
	DIVISION ("/"), 
	MYLTIPLYING ("*");
	
	private String sign;
	
	Sign (String sign){
		this.sign=sign;
	}

	public String getSign() {
		return sign;
	}
	
	
}
