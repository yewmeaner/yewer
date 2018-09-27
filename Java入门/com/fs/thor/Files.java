package com.fs.thor;

import java.io.File;	
import java.io.IOException;

public class Files {
	public void fun() throws IOException {
		File f = new File("e:/x.txt");
		
		System.out.println(f.canRead());//文件是否可读
		if (f.exists()) {
			System.out.println("文件存在！");
			System.out.println("文件大小是：" + f.length());
			System.out.println(f.getPath());//相对路径
			System.out.println(f.getAbsolutePath());//绝对路径
			System.out.println(f.getParent());//父路径
		} else {
			System.out.println("文件不存在！");
			f.createNewFile();//创建文件，路径+文件名
			System.out.println("文件创建成功！");
		}
	}
	public void sun() {
		File f = new File("e:/x.txt");
		System.out.println(f.isFile());//是否是文件
		System.out.println(f.isDirectory());//是否是目录
		f.delete();//删除文件
	}
	public void yun() {//遍历文件夹下文件
		//不带文件夹名
		File f = new File("e:/");
		String [] s = f.list();
		for (String string : s) {
			System.out.println(string);
		}
		//带文件夹名
		System.out.println("============================");
		File [] array = f.listFiles();
		for (File file : array) {
			System.out.println(file);
		}
	}
	public static void main(String[] args) throws IOException {
		new Files().yun();
	}

}
