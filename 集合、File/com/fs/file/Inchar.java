package com.fs.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Inchar {
	public void fun() throws Exception {
		Reader re = new FileReader("e:/x.txt");
		char [] c = new char [12];//字符数组
		String s = "";
		while (re.read(c) != -1) {//循环读取
			s += new String(c);			
		}
		
		System.out.println(s);
		re.close();
	}
	public void sun() throws IOException {
		Writer wr = new FileWriter("e:/x.txt",true);
		String s = "想要飞得高，就该把地平线忘掉！";
		
		wr.write(s);
		wr.flush();//刷出文件
		System.out.println("输入成功！");
		wr.close();
		
	}
	public static void main(String[] args) throws Exception {
		new Inchar().sun();
	}

}
