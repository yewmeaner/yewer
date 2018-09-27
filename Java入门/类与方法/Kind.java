package 类与方法;

public class Kind {
	static class a {// 静态内部类
		public void m1() {
			System.out.println("只恐双溪舴艋舟，载不动许多愁！");
		}

		public void m2() {
			System.out.println("问君能有几多愁，恰似一江春水向东流！");
		}

	}

	class b {// 内部类
		public void n1() {
			System.out.println("只恐双溪舴艋舟，载不动许多愁！");
		}

		public void n2() {
			System.out.println("问君能有几多愁，恰似一江春水向东流！");
		}

	}

}

class c {// 外部类
	public void n1() {
		System.out.println("只恐双溪舴艋舟，载不动许多愁！");
	}

	public void n2() {
		System.out.println("问君能有几多愁，恰似一江春水向东流！");
	}

}