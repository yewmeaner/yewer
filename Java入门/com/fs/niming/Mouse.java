package com.fs.niming;

public interface Mouse {//接口
	void click();

}
class Len implements Mouse {

	@Override
	public void click() {
	System.out.println("hello ...");
		
	}
	
}