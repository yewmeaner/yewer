package com.fs.thor;
//用于大型开发追踪代码
public class Test_Number extends Exception { 
	public Test_Number () {
		System.out.println("这是自定义异常");
	}

}
class Test_China extends Exception {//更为规范
	public Test_China(String s) {
		super(s);
	}
}