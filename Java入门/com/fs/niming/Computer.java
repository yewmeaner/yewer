package com.fs.niming;

public abstract class Computer {//抽象类
	public abstract void play ();

}
class Game extends Computer {
	@Override
	public void play() {
		System.out.println("play game ...");
	}
}