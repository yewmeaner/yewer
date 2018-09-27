package com.fs.connector;

//接口：只有公共的静态常量与公共的抽象方法
public interface Mouse {// 鼠标
	// 常量
	public static final int A = 10;

	// 抽象方法
	//public，abstract可省略
	public abstract void move();//移动

	public abstract void click();//点击

}

interface Keyboard {// 键盘
	public static final int B = 20;

	public abstract void input();//输入

}