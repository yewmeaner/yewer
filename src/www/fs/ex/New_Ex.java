package www.fs.ex;

import java.util.Scanner;

public class New_Ex {
	public void m1() {// 冒泡排序
		System.out.print("请输入需要排序的数字，用空格隔开:");
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		String[] a = st.split(" ");
		int[] num = new int[a.length];
		int r = num.length;
		for (int p = 0; p < r; p++) {
			num[p] = Integer.parseInt(a[p]);

		}
		for (int j = 0; j < r; j++) {

			for (int i = 0; i < r - j; i++) {

				try {

					// 把最大的交换到最后面去

					if (num[i] > num[i + 1]) {

						int temp = num[i];

						num[i] = num[i + 1];

						num[i + 1] = temp;

					}

				} catch (Exception e) {

				}
			}
		}

		for (int i = 0; i < r; i++) {

			System.out.print(num[i] + " ");

		}
		s.close();
	}
	public void m2() {//选择排序
		System.out.print("请输入需要排序的数字，用空格隔开:");
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		String [] a = st.split(" ");
		int [] b = new int [a.length];
		int c = b.length;
		int t = 0;
		for (int i = 0; i < b.length; i++) {
			b [i] = Integer.parseInt(a[i]);
		}
		for (int j = 0; j < c; j++) {
			for (int k = j + 1; k < c; k++) {
				
				if(b [j] > b [k]){
					t = b [k];
					b [k] = b [j];
					b [j] = t;
					}	
			}	
		}
		for(int k = 0;k < c;k ++){
		System.out.print(b [k] + " ");
		}	
		s.close();
	}
	public static void main(String[] args) {
		new New_Ex().m1();
	}
}
