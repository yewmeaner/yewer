package com.fs.thor;

public class Number {
	public void div(int a,int b) throws Test_China, Test_Number {
		if (b == 0) {
			throw new Test_China("除数不为0");
		} 
		if (b < 0) {
			throw new Test_Number();
		}
	}
	public static void main(String[] args) {
		Number n = new Number();
		try {
			n.div(12,-1);
		} catch (Test_China e) {
			e.printStackTrace();
		} catch (Test_Number e) {
			e.printStackTrace();
		}
	}

}
