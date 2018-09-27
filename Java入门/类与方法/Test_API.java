package 类与方法;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_API {
	// 创建字符串
	public static void m1() {
		String s = "至高之拳";
		System.out.println(s);
		String s2 = "至死不渝" + 12 + 3;
		System.out.println(s2);
		String s3 = 12 + 3 + "守序者的尊严";
		System.out.println(s3);
		String s4 = new String("守序者的善良");
		System.out.println(s4);
	}

	// 字符串常用方法
	public static void m2() {
		String s = "自在飞花轻似梦，无边丝雨细如愁。";
		String v = "不恨此花飞尽，恨西园，落红难缀。";
		System.out.println(s.length());// 得到长度
		System.out.println(s.charAt(6));// 根据下标得到字符
		System.out.println(s.trim());// 去掉前后空格
		System.out.println(s.compareTo(v));// 比较字符串大小
		System.out.println(s.endsWith("梦"));// 字符串字段由这个值结尾
		System.out.println(s.indexOf(0));// 查找字符或者子串第一次出现的地方
		System.out.println(s.substring(0, 7));// 截取字符串中的子串
		// 还有很多，用法如上

	}

	// StringBuffer与StringBuilder
	public static void m3() {
		// 线程安全
		StringBuffer s = new StringBuffer("自在飞花轻似梦，无边丝雨细如愁。");
		System.out.println(s);
		// 线程不安全，性能高于是StringBuffer.
		StringBuilder v = new StringBuilder("不恨此花飞尽，恨西园，落红难缀。");
		System.out.println(v);
	}

	// ==与equals()
	public static void m4() {
		String x = "like";
		String y = "like";
		System.out.println(x == y);// ==比较引用值
		System.out.println(x.equals(y));// 比较字符串内容

		String[] a = { "张珊", "李斯", "王武" };
		String[] b = { "张珊", "李斯", "王武" };
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}

	// Math返回0～1之间的随机数
	public static void m5() {
		double s = Math.random();
		System.out.println(s);

	}

	// System
	public static void n1() {
		String s = "不恨此花飞尽，恨西园，落红难缀。";
		System.out.print(s.length());// 输出及重载
		System.exit(0);// 推出程序
		long a = System.currentTimeMillis();
		// 返回从1970年1月1号0点0分0秒0毫秒到现在为止的毫秒数
		System.out.println(a);

	}

	// Data用于封装时间
	public static void n2() {
		Date date = new Date();
		System.out.println(date.toString());// 获取当前时间

		Date date1 = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		// 获取当前时间并格式化输出
		System.out.println(df.format(date1));

		// System.currentTimeMillis()作用相同
		System.out.println(date.getTime());

	}

	// Calendar
	public static void n3() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println(date);// Calendar得到Date

		calendar.add(Calendar.HOUR_OF_DAY, 3);// 3小时后
		calendar.add(Calendar.MINUTE, 15);// 15分钟后
		calendar.add(Calendar.MINUTE, -20);// 20分钟前
		calendar.setTime(new Date());// 重置时间
		
		//重置时间示例
		Calendar c=Calendar.getInstance();
		System.out.println(c.get(Calendar.SECOND));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(c.get(Calendar.SECOND));
		c.setTime(new Date());
		System.out.println(c.get(Calendar.SECOND));

	}
	//正则表达式
	public static void n4() {
		Pattern p = Pattern.compile("\\+|\\-|\\*|\\%");
		Matcher m = p.matcher("23+234-123*234/1000");//查找字符串
		boolean b = m.find();
		System.out.println(b);
	}

	public static void main(String[] args) {
		n2();
	}

}
