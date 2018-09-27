package com.fs.file;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Outbyte {
	public void fun() throws Exception {
		// 创建输出对象,true表示末尾追加，不写或false则覆盖原有内容
		OutputStream os = new FileOutputStream("e:/x.txt",true);
		String s = "飞鸟和鱼！";// 准备输出的数据
		os.write(s.getBytes());// 将字符串转为字节数组
		System.out.println("输出成功！");
		os.flush();// 将数据刷出
		os.close();// 关闭
	}
	public void sun() throws IOException, Exception {
		OutputStream os = new FileOutputStream("e:/x.txt",true);
		BufferedOutputStream bo = new BufferedOutputStream(os);
		byte [] b = {'h','e','l','l','o'};
		for (int i = 0; i < b.length; i++) {
			Thread.sleep(1000);
			bo.write(b [i]);
		}
		bo.flush();
		System.out.println("输出成功！");
		bo.close();
		os.close();
	}

	public static void main(String[] args) throws Exception {
		new Outbyte().sun();
	}

}
