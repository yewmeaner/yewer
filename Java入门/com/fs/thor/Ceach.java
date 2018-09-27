package com.fs.thor;

import java.io.IOException;

public class Ceach {//运行可执行文件
	
	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		
		try {
			r.exec("D:/mysql_5_7_17/bin/mysql.exe");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
