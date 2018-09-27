package 类与方法;

import java.util.Arrays;

public class Test_Beta {
	/**
	 * @desc 使用+、concat()、append()方法循环10W次
	 * @author chenssy
	 * @data 2013-11-16
	 * @param args
	 * @return void
	 */

	public static void m1() {

		// +
		long start_01 = System.currentTimeMillis();
		String a = "a";
		for (int i = 0; i < 100000; i++) {
			a += "b";
		}
		long end_01 = System.currentTimeMillis();
		System.out.println("  +   所消耗的时间：" + (end_01 - start_01) + "毫米");

		// concat()
		long start_02 = System.currentTimeMillis();
		String c = "c";
		for (int i = 0; i < 100000; i++) {
			c = c.concat("d");
		}
		long end_02 = System.currentTimeMillis();
		System.out.println("concat所消耗的时间：" + (end_02 - start_02) + "毫米");

		// append
		long start_03 = System.currentTimeMillis();
		StringBuffer e = new StringBuffer("e");
		for (int i = 0; i < 100000; i++) {
			e.append("d");
		}
		long end_03 = System.currentTimeMillis();
		System.out.println("append所消耗的时间：" + (end_03 - start_03) + "毫米");
	}

	public static void m2(String s, String... name) {// String...形参可变长度
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

	}

	public static void m3(int[] a, int b) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		int res = Arrays.binarySearch(a, b);
		System.out.println("该元素的位置是：" + res);

	}
	public static void m4() {
		
	}

	public static void main(String[] args) {

		// m2("aa","唐僧","孙悟空","猪八戒","沙僧");

		/*
		 * int[] array = {12,9,45,29,87,4,10};
		 * 
		 * m3(array,10);
		 */
	}

}
