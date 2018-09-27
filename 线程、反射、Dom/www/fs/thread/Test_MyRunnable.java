package www.fs.thread;
//扩展性强，代码稍微复杂
public class Test_MyRunnable {
	public static void main(String[] args) {
		MyRunnable m = new MyRunnable();
		
		Thread h = new Thread(m);
		h.start();
		
	}
}
