package com.fs.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//服务器
public class Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			// 1、创建服务器套接字ServerSocket，并且绑定服务器的端口号 prot取值1~65536 >1024
			serverSocket = new ServerSocket(12345);

			while (true) {// 可以响应多个客户端
				System.out.println("等待客户端链接....");

				// 2、阻塞等待客户端链接
				socket = serverSocket.accept();

				// 3、开启子线程响应客户端，并且将通信套接字Socket传入子线程
				new MyThread(socket).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {// 无论try执行还是catch执行，此代码块都将执行
			try {
				// 关闭套接字
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
