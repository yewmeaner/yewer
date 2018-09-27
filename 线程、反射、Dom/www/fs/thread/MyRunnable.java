package www.fs.thread;

public class MyRunnable implements Runnable{
	
	boolean b = true;

	@Override
	public void run() {
		while (b) {
			
			System.out.println("渣渣辉");
			
			try {
				Thread.sleep(1000);//线程睡眠
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
