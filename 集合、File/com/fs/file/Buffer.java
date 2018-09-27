package com.fs.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Buffer {
	public void fun() throws Exception {
		//创建字符输入流
		Reader r = new FileReader("e:/x.txt");
		BufferedReader br = new BufferedReader(r);//封装
		String s = "";
		StringBuffer bu = new StringBuffer();
		//循环读取
		while ((s = br.readLine()) != null) {
			bu.append(s);	
			bu.append("\n");//读取一行换行
			
		}
		System.out.println(bu.toString());
		br.close();
		r.close();
	}
	public void sun() throws IOException {
		Writer w = new FileWriter("e:/x.txt",true);
		BufferedWriter bw = new BufferedWriter(w);
		String [] s = {"枯藤","老树","昏鸦"};
		for (int i = 0; i < s.length; i++) {
			bw.newLine();//创建新行
			bw.write(s [i]);
		}
		bw.flush();
		System.out.println("输出成功！");
		bw.close();
		w.close();
		
	}
	public static void main(String[] args) throws Exception {
		new Buffer().sun();
		
	}

}
