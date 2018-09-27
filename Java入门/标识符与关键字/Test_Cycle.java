package 标识符与关键字;

public class Test_Cycle {
	// 死循环
	public static void m1() {
		for (int i = 0; i < 10; i++) {

			// 每隔1秒执行一次
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(i);
		}
	}

	public static void m2() {
		// 死循环
		for (;;) {
			System.out.println("这是一个死循环");
		}

	}
	// 使用for循环实现1~10的累加

	public static void m3() {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;// sum = sum+i
		}

		System.out.println("sum = " + sum);

		// 得到1~10之间所有偶数的和
		int sum2 = 0;
		for (int i = 2; i <= 10; i += 2) {
			sum2 += i;
		}
		System.out.println("sum2 = " + sum2);

	}

	// 使用for循环输出99乘法表
	public static void m4() {
		int sum = 0;

		System.out.println("九九乘法表：");
		for (int a = 1; a < 10; a++) {// 表行
			for (int b = 1; b <= a; b++) {// 表列
				sum = a * b;
				System.out.print(b + " * " + a + " = " + sum + "\t");
			}
			System.out.println();

		}

	}

	// 冒泡排序
	public static void m5() {
		int a[] = { 12, 23, 435, 6, 2, 4, 543, 226, 595 };

		int i, j, n, temp;

		// 数组的长度

		n = a.length;
		System.out.println("从小到大顺序为：");

		for (j = 0; j < n; j++) {

			for (i = 0; i < n - j; i++) {

				try {

					// 把最大的交换到最后面去

					if (a[i] > a[i + 1]) {

						temp = a[i];

						a[i] = a[i + 1];

						a[i + 1] = temp;

					}

				} catch (Exception e) {

				}
			}
		}

		for (i = 0; i < n; i++) {

			System.out.print(a[i] + " ");

		}

	}

	// 死循环
	public static void n1() {
		while (true) {// 条件永远满足时：如1 > 0
			System.out.println("死循环");
		}

	}

	// 使用while循环实现2~200之间所有偶数的和
	public static void n2() {
		int sum = 0;
		int i = 2;

		while (i <= 200) {
			sum += i;
			i += 2;
		}

		while (true) {
			if (i > 200) {
				break;// 结束循环
			}

			sum += i;
			i += 2;
		}
		System.out.println("sum = " + sum);
	}

	public static void n3() {
		int i = 0;
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("i = " + i++);
		}
	}

	// 如果条件不满足，至少执行了一次循环体
	public static void n4() {
		do {
			System.out.println("执行了do");
		} while (false);
	}

	public static void main(String[] args) {
		m4();
	}

}
