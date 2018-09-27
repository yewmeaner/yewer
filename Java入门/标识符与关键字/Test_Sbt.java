package 标识符与关键字;

import java.util.Arrays;

public class Test_Sbt {
	// 简单数据类型
	public static void m1() {
		// 整数型
		byte a = 1; // 字节型 有效位：8 -128～127 默认值：0
		System.out.println("值为:" + a);
		short b = 1; // 短整型 有效位：16 -32768～32767 默认值：0
		System.out.println("值为:" + b);
		int c = 1; // 整型（默认） 有效位：32 -2^15～2^15-1 默认值：0
		System.out.println("值为:" + c);
		long d = 1; // 长整型(定义可加L或l) 有效位：64 -2^63～2^63-1 默认值：0L
		System.out.println("值为:" + d);
		// 小数型
		float e = 1; // 单精度（定义加f或F） 有效位：32 默认值：0.0f
		System.out.println("值为:" + e);
		double f = 1; // 双精度（默认） 有效位：64 默认值：0.0d
		System.out.println("值为:" + f);
		// 逻辑型
		boolean g = true; // 布尔型 默认false
		System.out.println("值为:" + g);
		// 字符型
		char h = 'a'; // 字符型 有效位：16（汉字占两个字节） 默认值：'\u0000'(空格)
		System.out.println("字符在Unicode编码中的位置:" + (int) h);
		// Unicode编码中值对应的字符
		// 1、
		char i = '\u1203';
		System.out.println("在此位置的字符是：" + i);
		// 2、
		int j = 1203;
		System.out.println("在此位置的字符是：" + (char) j);

	}

	/*
	 * 整型的表现形式： 1.十进制 ; 2.八进制：要求以0开头 ; 3.十六进制：要求以0x或0X开头.
	 */
	// 类型转换
	public static void m2() {
		// 整型转小数
		int a = 1;
		float b = a;
		System.out.println("值为:" + b);

		// 小数转整型（损失精度）
		double c = 1;
		int d = (int) c;// 精度不同时要强转
		System.out.println("值为:" + d);

		// *布尔型不能转换
	}

	// 四舍五入法
	public static void m3() {
		// 定义一个已知数
		double a = 19.951203;
		// 四舍五入条件法
		if ((int) (a + 0.5) > (int) a) {
			System.out.println((int) a + 1);
		} else {
			System.out.println((int) a);
		}
		// 四舍五入三元法
		System.out.println("值为:" + ((int) (a + 0.5) > (int) a ? (int) a + 1 : (int) a));
		// 四舍五入一般方法
		System.out.println("值为:" + (int) (a + 0.5));
		// 保留小数点后位数商余法
		System.out.println("值为:" + ((int) (a * 100)) / 100.00);
		// 保留n位小数
		System.out.println("值为:" + ((int) ((a * 100) + 0.5)) / 100.00);
		// 向上保留
		if (a > (int) a) {
			System.out.println("值为:" + (int) a + 1);
		} else {
			System.out.println("值为:" + (int) a);
		}
		// 向下保留
		System.out.println("值为:" + (int) a);
	}

	// 数组排序
	public static void m4() {

		// 对数值型数组进行排序
		int[] a = { 13, 7, 84, 73, 10, 38, 4, 11, 5, 34 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------");

		String[] b = { "sort", "baidu", "hello", "aaa", "world", "abc" };
		Arrays.sort(b);
		for (String string : b) {
			System.out.print(string + "   ");
		}

	}

	public static void main(String[] args) {

		m3();//调用方法
	}

}
