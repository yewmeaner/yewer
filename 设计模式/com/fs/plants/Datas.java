package com.fs.plants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {
	public static void main(String[] args) {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		System.out.println(df.format(d));
	}

}
