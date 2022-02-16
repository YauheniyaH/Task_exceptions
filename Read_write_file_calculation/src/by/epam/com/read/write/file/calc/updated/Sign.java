package by.epam.com.read.write.file.calc.updated;

public enum Sign {
	PLUS ('+'), 
	MINUS ('-'), 
	DIVISION ('/'), 
	MYLTIPLYING ('*');
	
	private char sign;
	
	Sign (char sign){
		this.sign=sign;
	}

	public char getSign() {
		return sign;
	}
	
	
}
