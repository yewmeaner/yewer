package www.fs.thread;
//实现简单，扩展性较差
public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			System.out.println("i = " + i);

			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
