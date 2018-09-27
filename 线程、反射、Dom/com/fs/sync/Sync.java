package com.fs.sync;

public class Sync extends Thread {

	private Entry entry;
	private String name;

	// 构造器：初始化成员变量
	public Sync(Entry entry, String name) {
		this.entry = entry;
		this.name = name;
	}

	@Override
	public void run() {// 线程执行的方法
		super.run();

		// 通过对象调用方法
		entry.fun(name);

	}
}

class Entry {
	// 线程同步实例方法:只对多个线程中使用同一个对象调用此方法时生效，如果使用的是不同对象，那么同步失效
	// 实例方法
	public synchronized void fun(String name) {// 变量表示线程名称
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);

				System.out.println(name + "---" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// 线程同步类方法：在多个线程中无论使用同一个对象还是不同对象来调用此方法，同步都生效
	// 类方法
	public synchronized static void sun(String name) {// 变量表示线程名称
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);

				System.out.println(name + "---" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void yun(String name) {// 变量表示线程名称
		// 线程同步代码块：在多个线程中使用同一个对象调用此方法的代码块时，同步才生效，使用不同对象时，同步失效
		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);

					System.out.println(name + "---" + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}