package 标识符与关键字;

import java.util.Scanner;

public class Test_Example {
	//数字反转打印。如：键盘输入的是12345，就要打印出54321。
	public static void m1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int num=sc.nextInt();
		int result=0;//存反转的数字
		while(true)
		{
			int n=num%10;//取出最低位上的数字
          //也可以直接打印出来System.out.println(n);但不好，也可以用一个数组存起来，
			//也不好，都因为翻转后的前后的那个0的问题
			result=result*10+n;
			//依次的反转存储得到反转的数字
			num=num/10;
			//降位
			if(num==0)
			{
				break;
			}
		}
		System.out.println("打印后的数字为:" + result);
	}
		//非波拉契数列。
	public static void m2() {
		System.out.println("裴波那契数列的前100位数是:");
		//输出前两个数
		//  \t:横向制表(HT),跳到下一个TAB位置,1个tab等于8个空格的距离.
		System.out.print("1\t1\t");
		int a = 1;
		int b = 1;
		int c = 0;
		for (int i = 3; i < 101; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + "\t");
			//每输出5个数后换行
			if(i % 5== 0){
				System.out.println("");//默认加一个换行符
			}
		}
		
	}
	//矩阵相乘
	public static void m3() {
		//2 * 5  矩阵
				int [][] a = {
						{3, 4, 5, 6},
						{2, 4, 6, 8}
				};
				
				//5 * 3  矩阵
				int [][] b = {
						{3,  4, 5},
						{4,  1, 7},
						{6,  4, 5},
						{12, 4, 16}
				};
				
				//相乘结果是 2 * 3  矩阵
				

				System.out.println(a.length);
				System.out.println(a[1].length);
				
				int s = a[0].length;
				
				
				int [][]c = new int[a.length][b[0].length];//结果数组
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<b[0].length;j++) {
						for(int k = 0;k<s;k++)
						c[i][j] = c[i][j] +  a[i][k] * b[k][j];
					}
				}
					
				//打印结果
				for(int m=0;m<c.length;m++) {
					for(int n=0;n<c[0].length;n++) 
						
						{
							System.out.print(c[m][n]);
							System.out.print(",");
						}
					System.out.println();
				}
			}
	//最大公约数
	public static void m4() {
Scanner input =new Scanner(System.in);
		
		System.out.print("请输入第一个数：");
		int a=input.nextInt();
		System.out.print("请输入第二个数：");
		int b=input.nextInt();
		
		int i;
		if(a>b){i=b;}
		else{i=a;}

		
		while(a%i!=0 || b%i!=0){
			i--;
		}
		System.out.println(i);
	}
	//最小公倍数
	public static void m5() {
Scanner input =new Scanner(System.in);
		
		System.out.print("请输入第一个数：");
		int a=input.nextInt();
		System.out.print("请输入第二个数：");
		int b=input.nextInt();
		
		int x;
		int i;
		if(a>b){//起始尝试从a,b最大的那个数开始
			x=a;
			i=a;
		}
		else {
			x=b;
			i=b;
		}

		while(i%a!=0 || i%b!=0){
			i=i+x;//每次递增的量以最大的那个数为准
		}
		System.out.println(i);
		
	}

//求是否是闰年
public static void m6() {

/**
 * 最简单的办法
*/

        Scanner input = new Scanner(System.in);
        System.out.println("请输入整数年份：");
        int  a = input.nextInt() ; //年份
        if( (a % 4 ==  0  && a % 100 != 0)  || a%400==0){
			System.out.println(a + "闰年");//闰年
		}
		else{
			System.out.println(a + "平年");//平年
		}
      
		
	}
//求年月日是一年中第几天
public static void n1() {
int num=0;
	
    Scanner input = new Scanner(System.in);
	
    System.out.println("请输入整数年份：");
    int year = input.nextInt() ; //年份
	
    System.out.println("请输入整数月份：");
    int month = input.nextInt() ; //月份
	
    System.out.println("请输入整数号数：");
    int day = input.nextInt() ; //号数
	
	switch(month)
	{
		case 12:
			num += 30; 
		case 11:
			num += 31; 
		case 10:
			num += 30; 
		case 9:
			num += 31; 
		case 8:
			num += 31; 
		case 7:
			num += 30; 
		case 6:
			num += 31; 
		case 5:
			num += 30; 
		case 4:
			num += 31; 
		case 3:
			num += 28; 
		case 2:
			num += 31; 
		case 1: 
			num += day; 
	}
	
	if(month > 2)
	{
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			num += 1;
		}
	}

	System.out.println("这天是这年的第"+num+"天");
}



	//判断是否是质数
	public static void n2() {
		Scanner input =new Scanner(System.in);
		int a =input.nextInt();
		
		int i=2;
		
		while(i<a){
			if(a%i == 0) //如果能够整除a，那它就不是质数
			{
				break; //直接跳出，减少了循环次数，很好
			}
			i++;
		}
		
		if(a==i){
			System.out.println("质数");
		}
		else{
			System.out.println("不是质数");
		}
	}
	//摇骰子，结果是1~6，写出随机的代码。
	public static void n3() {
		/*int(Math.radom() *6) + 1 ; //法一：推荐的

		int(Math.radom() *10) %6 + 1; //法二

		int(Math.radom() *10) / 1.8 + 1; //法三
		
*/
		double a = Math.random();
		//随机输出一个0～1的小数
		int b = (int)(a * 10);
		//将b变成0～9的整数（b = 0是因为小数小于0.01）
		 
		System.out.println("整数b的值为:" + b);
		System.out.println("您的骰子点数是:" + (b + 3) / 2);
	}//由于摇出的1和6是临界值，所以概率是其余四数的一半.
	public static void main(String[] args) {
		m1();
	}

}
