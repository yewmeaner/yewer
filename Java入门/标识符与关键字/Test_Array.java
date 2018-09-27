package 标识符与关键字;


public class Test_Array {
	//一维数组
	public static void m1() {
		int [] a = {1,2,3,4,5};//数组的静态初始化
		System.out.println(a[2]);
		//for遍历
		for (int i = 0; i < a.length; i++) {
			System.out.println("值是："+a[i]);
		}
		//foreach遍历
		for(int s : a) {
			System.out.println("值是："+s);
		}
		
		int [] b;//数组的动态初始化
		b = new int [5];
		b[0] = 1;
		b[1] = 2;
		b[2] = 0;
		b[3] = 3;
		b[4] = 9;
		System.out.println("长度是："+b.length);
	}
	//二维数组（数组的数组）
	public static void m2() {
		//二维数组的静态初始化（所有操作一步完成）
		//不规则的二维数组
			int[][] s = {{1,2,3}, //第一行，有3列
						 {10,20}, //第二行，2列
						 {100,200,300,400}, //第三行，4列
						 {1000}};//第四行，1列
			System.out.println("行数是："+s.length);
			System.out.println("第三行的列数是："+s[2].length);
			//2行3列的规则
			int b[][] = new int[][]{{1,2,3}, 
									{4,5,6}};
		
			System.out.println("值是："+b[1][1]);
		//二维数组的动态初始化
			//1、声明二维数组的引用变量
			int[][] a;
			
			//2、为二维数组开辟大小空间（行、列），第一维的长度一定要指定
			//2.1 指定行
			a = new int[3][];
			//2.2指定列
			a[0] = new int[2];//第一行有2列
			a[1] = new int[3];//第二行有3列
			a[2] = new int[4];//第三行有1列
			
			//3、为数组中每一个元素赋值
			//(1)为第一行每一个元素赋值
			a[0][0] = 1;
			a[0][1] = 2;
			
			//(2)为第二行每一个元素赋值
			a[1][0] = 10;
			a[1][1] = 20;
			a[1][2] = 30;
			
			//(3)为第三行每一个元素赋值
			a[2][0] = 100;
			a[2][1] = 200;
			a[2][2] = 300;
			a[2][3] = 400;
		
		System.out.println("长度是："+a.length);
		//二维数组的遍历
		System.out.println("数组为：");
		for(int i = 0; i < a.length; i++) {//遍历行
			for(int j = 0; j < a[i].length; j++) {//遍历列
				System.out.print(a[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		

		
	}
	public static void main(String[] args) {
		m2();
	}

}
