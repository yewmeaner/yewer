package com.fs.polym;

public class Test_Animal {
	public static void main(String[] args) {
		Animal a = null;
		FlyAnimal f = null;
		Bird b = null;
		//instanceof用于类或接口中的判断
		boolean ao = a instanceof Animal;
		System.out.println("ao---" + ao);
		
		boolean fo = f instanceof Animal;
		System.out.println("fo---" + fo);
		
		boolean bo = b instanceof Animal;
		System.out.println("bo---" + bo);
		
		Animal an = new Animal();
		
		boolean ano = an instanceof Animal;
		System.out.println("ano---" + ano);
	}

}
