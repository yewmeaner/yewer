package 类与方法;
//静态类或方法被类的每一个对象公用（全局使用）
//不能用this和super 他们依赖对象，避免冲突

public class Static {
	private  int n;
	private static int con;
	
	static {
		System.out.println("加载时执行！");
		con = 1;
	}
	public static int getCon() {
		return con;
	}
	
	public Static() {
		System.out.println("构造器被使用！");
		con ++;
		n = con;	
	}
	
	int a;
	char b;
	public void m1() {
		System.out.println("一般方法!");
	}
	
	static int i;//依赖于类存在，而不依赖方法
	static char j;
	public static void m2() {
		System.out.println("静态方法!");
	}
	public static void main(String[] args) {
		/*System.out.println(Static.i);//标准是 类名.变量或方法来访问
		System.out.println(Static.j);
		Static.m2();*/
		
		Static s = new Static();//new Static类中静态代码块和构造器
		new Static();//new 构造器
		//构造器new几次，打印几次，但static代码块只执行一次
		System.out.println("构造器被使用了" + s.n + "次!");
	}

}
