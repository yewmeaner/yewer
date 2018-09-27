package 标识符与关键字;

public class Test_Hello {// java的基本组成单元是类
	public void m1() {
		System.out.println("Hello World!");// 正确输入
		System.err.println("Hello World!");// 错误输入
	}

	public static void main(String[] args) {
		Test_Hello a = new Test_Hello();// 调用方法

		a.m1();// 静态方法可直接调用
	}

}
/*
 * JVM(虚拟机)：加载并运行.class文件的软件。 JRE(运行时的环境):JRE是运行Java程序的最小环境。
 * JDK(java开发工具包):JDK包含JRE，而JRE包含JVM。
 */
/*
 * \b：退格 \n：换行 \r：回车 \t：制表符（8个空格） \"：双引号 \'：单引号 \\：反斜杠
 */