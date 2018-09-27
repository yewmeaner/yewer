package com.fs.polym;

public class Plant {
	int a = 100;
	
	public void sprout() {
		System.out.println("Plant sprout....");
	}
	public void grow() {
		System.out.println("Plant geow....");
	}
	
	

}
class Flower extends Plant {
	int a = 200;
	int b = 12;
	
	@Override
	public void grow() {
		System.out.println("Flower geow....");
	}
	public void result() {
		System.out.println("Flower result....");
	}
}