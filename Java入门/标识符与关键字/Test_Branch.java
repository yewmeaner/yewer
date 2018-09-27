package 标识符与关键字;

public class Test_Branch {
	// for分支
	public static void m1() {
		int a = 5;
		int b = 5;
		if (a == b) {
			System.out.println("只恐双溪舴艋舟，载不动许多愁！");
		} else {
			System.out.println("问君能有几多愁，恰似一江春水向东流！");
		}

	}
	/*
	 * 编写一个Java程序，判断变量x是奇数还是偶数
	 * x%2-->0, 1
	 */
	public static void a(int x) {
		//互斥关系
		if(x%2 == 0) {
			System.out.println("x是偶数");
		} else {
			System.out.println("x是奇数");
		}
	}
	
	
	/*
	 * 编写一个Java程序，判断变量x是大于0，还是小于0，还是等于0
	 */
	public static void b(int x) {
		if(x > 0) {
			x -= 10;
			System.out.println("x > 0," + x);
		} else if(x < 0){
			x++;
			System.out.println("x < 0, " + x);
		} else {
			System.out.println("x == 0");
		}
	}

	/*
	 * break：结束当前的整个循环。 continue：终止当前的循环过程，但他并不跳出循环,而是继续往下
	 * 判断循环条件执行语句.他只能结束循环中的一次过程,但不能终止循环继续进行.
	 */
	// switch分支
	public static void m2() {// 参考其中break的用法
		int a = 2;
		int b = 2;
		for (int i = 0; i < 3; i++) {

			switch (b) {
			case 1:
				switch (a) {
				case 1:
					System.out.println("只恐双溪舴艋舟，载不动许多愁！");
					break;

				default:
					System.out.println("问君能有几多愁，恰似一江春水向东流！");
					break;
				}
				break;

			default:
				switch (a) {
				case 1:
					System.out.println("只恐双溪舴艋舟，载不动许多愁！");
					break;

				default:
					System.out.println("问君能有几多愁，恰似一江春水向东流！");
					break;
				}

				break;
			}
		}

		switch (a) {
		case 1:
			System.out.println("只恐双溪舴艋舟，载不动许多愁！");
			break;

		default:
			System.out.println("问君能有几多愁，恰似一江春水向东流！");
			break;
		}

	}

	public static void main(String[] args) {
		m2();
	}

}
