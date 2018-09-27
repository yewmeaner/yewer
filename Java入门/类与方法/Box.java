package 类与方法;
//装箱与拆箱
public class Box {
	public void n() {
		Integer i = new Integer(10);//装箱操作
		Integer j = new Integer(10);
		System.out.println("比较结果:" + (i == j));
		System.out.println("比较结果:" + i.equals(j));
		
		String s = "12" + "03";
		int d = Integer.parseInt(s);
		System.out.println("打印结果:" + d);
		
	}
	public void m() {
		Integer i = 100;//自动装箱
		Integer p = 100;
		System.out.println(i == p);//true
		
		Integer x = new Integer(100);
		Integer y = new Integer(100);
		System.out.println(x == y);//false
		
		Integer m = 128;
		Integer n = 128;
		System.out.println(m == n);//false,一般只有-128～127，超出会开辟新的存储空间。
	
		int j = new Integer(100);//自动拆箱
		int k = i;//自动拆箱
		
	
		
	}
	public static void main(String[] args) {
		Box b = new Box();
		b.m();
	}

}
