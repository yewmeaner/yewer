package com.fs.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Inbyte {
	public void fun() throws Exception {
		// 创建输入流对象
		InputStream in = new FileInputStream("e:/x.txt");// 路径
		byte[] b = new byte[128];// 输出数组
		in.read(b);

		String s = new String(b);// 转换为字符
		System.out.println(s);
		in.close();// 关闭流
	}

	public void sun() throws Exception {
		
		InputStream in = new FileInputStream("e:/x.txt");//创建及路径
		BufferedInputStream bin = new BufferedInputStream(in);//封装（缓存）
		
		byte[] b = new byte[12];//输出数组
		String s = "";//转换为字符
		while (bin.read(b) != -1) {//判断是否到末尾
			s += new String(b);

		}
		System.out.println(s);
		//关闭
		bin.close();
		in.close();
	}

	public static void main(String[] args) throws Exception {
		new Inbyte().sun();
	}

}
