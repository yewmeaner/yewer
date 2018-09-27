package www.fs.ex;

/**
 *
 * @author 测试类
 *   
 */
public class Prosumer {
	public static void main(String[] args) {
		//创建产品
		Product m_Product = new Product();
		//创建生产者
		Creater m_Creater = new Creater(m_Product);
		m_Creater.start();
		//创建消费者
		Customer m_Customer = new Customer(m_Product);
		Thread customerThread = new Thread(m_Customer);
		customerThread.start();
		
	}

}

class Product {
	/**
	 * @since 是否有产品
	 */
	boolean flag = false;
	int number = 0;

	/**
	 * @category 生产产品
	 */
	public synchronized void create(int number) {
		//有产品的时候，生产者休息
		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("生产者生产产品！");
		flag = true;
		//把线程队列里面的线程随机选择一个进行唤醒，因为当前休眠的是消费者，所以消费者被唤醒
		notify();
		this.number = number;

	}
	/**
	 * 
	 * @return 消费产品
	 */

	public synchronized int getProduct() {
		if (!flag) {
			//停止当前的线程
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//消费当前的产品
		System.out.println("消费了当前的产品！");
		flag = false;
		//把线程队列里面的线程随机选择一个进行唤醒，因为当前休眠的是生产者，所以生产者被唤醒
		notify();
		return number;
	}
}

class Creater extends Thread {
	Product m_Product;
	boolean isRun = true;
	final int TIME = 500;

	public Creater(Product m_Product) {
		this.m_Product = m_Product;

	}

	int time = 0;

	@Override
	public void run() {
		while (isRun) {
			try {
				Thread.sleep(TIME);
			} catch (Exception e) {
				e.printStackTrace();
			}
			time++;
			//让生产者生产产品
			m_Product.create(time);
			if (time == 10) {
				isRun = false;

			}
			
		}
		System.out.println("生产者结束生产！");
		super.run();
	}

}
class Customer implements Runnable {
	Product m_product;
	final int TIME = 1000;
	boolean isRun = true;
	public  Customer(Product m_product) {
		this.m_product = m_product;
	}
	

	@Override
	public void run() {
		while (isRun) {
			try {
				Thread.sleep(TIME);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//获取产品的数量，如果产品大于10，就停止
			int number = m_product.getProduct();
			if (number >= 10) {
				isRun = false;
			}
		}
		System.out.println("消费者结束消费！");
	}
	
}



