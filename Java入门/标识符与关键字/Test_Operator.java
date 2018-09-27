package 标识符与关键字;

public class Test_Operator {
	// 赋值运算
	public static void m1() {
		int a = 10;
		int b = 10 - 2;

		// += -= *= /=

		short s = 1;
		s = (short) (s + 1);// short + int-->int + int

		short s1 = 1;
		s += 1;// s = (short)(s1 + 1)

	}

	// 关系运算
	public static void m2() {
		int a = 10;
		int b = 8;
		;
		if (a == b) {
			System.out.println("a == b");
		}

		boolean value = a != b;
		System.out.println(value);// false

	}

	// 三目运算
	public static void m3() {
		/**
		 * x ? y : z x返回一个boolean值得表达式 如果x为true，则执行y 如果x为false，将执行z
		 */
		int a = 20, b = 30;
		boolean x = a - b > 0;// false
		int y = 1;
		int z = -1;

		int value = x ? y : z;
		System.out.println(value);

		String num = a - b > 0 ? ">0" : "<0";
		System.out.println(num);

	}

//求三数中的最大值
	public static void m4() {
		int x=7;
		int y=5;
		int z=9;
		
		//常规if法
		int max_0;
		if(x>=y)
		{
			max_0=x;
		}
		else{
			max_0=y;
		}
		if(max_0>z)
		{
		}else{
			max_0=z;
		}
		System.out.println("max_0="+max_0);
		

		//三元运算符之两句搞定法						//法零
		int m=(x>y)?x:y;						
		int n=(m>z)?m:z; 
		System.out.println("n="+n);
		
		//三元运算符之一句搞定法
		int max_1= ( ((x>y)?x:y)  >z)? ((x>y)?x:y) :z;	//法一 //这是从“法零”通过 “公式代入法” 而形成的

		int max_2 = (x>y && x>z) ? x : (y>z?y:z);	//法二

		int max_3 = (x>y)?(x>z?x:z):(y>z?y:z);		//法三
		
		System.out.println("max_1="+max_1);
		System.out.println("max_2="+max_2);
		System.out.print("max_3="+max_3);


	}

//逻辑运算
	static class Test_Logic {
		public void n1() {
			boolean b1 = true;
			boolean b2 = true;
			boolean b3 = false;
			boolean b4 = false;

			// 非运算：对结果取反
			System.out.println("非运算");
			System.out.println(!b1);// false
			System.out.println(!b3);// true

			// 与运算：只要其中一个为false，那么结果就为false
			System.out.println("与运算");
			System.out.println(b1 & b2);// true
			System.out.println(b1 & b3);// false
			System.out.println(b3 & b4);// false

			// 或运算：只要其中一个为true，那么结果就为true
			System.out.println("或运算");
			System.out.println(b1 | b2);// true
			System.out.println(b1 | b3);// true
			System.out.println(b3 | b4);// false

			// 异或运算：两个相同为false，两个相异则为true
			System.out.println("异或运算");
			System.out.println(b1 ^ b2);// false
			System.out.println(b1 ^ b3);// true
			System.out.println(b3 ^ b4);// false

		}

		public boolean x() {
			System.out.println("x....");
			return true;
		}

		public boolean y() {
			System.out.println("y,....");
			return false;
		}

		public boolean z() {
			System.out.println("z.....");
			return true;
		}

		public void bMethod() {
			// 短路与：只要其中一个表达式或方法的值为false，那么结果就为false，且不执行之后的操作
			boolean b = x() && y() && z();
			System.out.println(b);

			// 短路或：只要其中一个表达式或方法的返回值为true，那么结果就为true，并且不再执行之后的操作
			boolean b2 = x() || y() || z();
			System.out.println(b2);

		}
	}

	public static void main(String[] args) {
		Test_Operator.Test_Logic a = new Test_Operator.Test_Logic();
		a.n1();
	}

}
