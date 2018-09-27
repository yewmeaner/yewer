package com.fs.sync;

public class Test_Sync {
	public static void main(String[] args) {
		Entry entry = new Entry();

		// 开启子线程1
		Sync s1 = new Sync(entry, "线程一");
		s1.start();

		// 开启子线程2
		Sync s2 = new Sync(entry, "线程二");
		s2.start();

	}

}
