package by.epam.com.read.write.file.calc.updated;

import java.util.List;



public class NumberCalculator {
	
	
	private List<Data> list;

	public NumberCalculator() {

	}

	public NumberCalculator(List<Data> list) {
		this.list = list;
	}

	public List<Data> getList() {
		return list;
	}

	public void setList(List<Data> list) {
		this.list = list;
	}

	public List<Data> calc() {
		double a;
		double b;
		for (int i=0; i<list.size();i++) {
			a=(double) list.get(i).getNumber1();
			b=(double) list.get(i).getNumber2();
			switch(list.get(i).getSign()){
			case PLUS:
				list.get(i).setResult(a+b);
				break;
			case MINUS:
				list.get(i).setResult(a-b);
				break;
			case MYLTIPLYING:
				list.get(i).setResult(a*b);
				break;
			case DIVISION:
				list.get(i).setResult(a/b);
				break;
			}
			}
				
		
		return list;
	}

}
