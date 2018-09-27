package 类与方法;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//判断正确性
public class Regular {
	public boolean m1(String s) {
		Pattern p = Pattern.compile("ax.by");//规则
		Matcher m = p.matcher(s);//字符串
		boolean b = m.matches();
		return b;
	}
	
	 public boolean m2(String s){	

		boolean b = Pattern.matches("ax.by", s);
		return b;
	}
	 public void n1() {
		boolean b= Pattern.matches("136\\d{8}", "13698981398");
		System.out.println("匹配结果为:"+b);
	}
	 public void n2() {
		Pattern p = Pattern.compile("136\\d{8}");
		Matcher m = p.matcher("138093912035");
		boolean b = m.matches();
		System.out.println("匹配结果为:"+b);
	}
	 //查找字符串
	 public void m3() {
		Pattern p = Pattern.compile("\\+|\\-|\\*|\\/|%");
		Matcher m = p.matcher("23+234-123*234/1203");
		boolean b = m.find();
		System.out.println("匹配结果为:"+b);
	}
	 public void m4() {
		Pattern p = Pattern.compile("\\d{2}");
		Matcher m = p.matcher("gstrbr61beb216brve51");
		System.out.println("匹配结果为:"+m.find());
	}
	 public static void main(String[] args) {
		Regular r = new Regular();
		System.out.println("匹配结果为:"+r.m1("axmby"));
		//r.n2();
	}

}
