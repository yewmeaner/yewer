package com.fs.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		InputStream in = null;
		OutputStream out = null;

		try {
			// 1、创建通信套接字Socket，并且绑定ip以及port
			// "128.0.1.136" "127.0.0.1"(服务器与客户端都在本机上)
			socket = new Socket("127.0.0.1", 12345);

			// 2、获取输入输出流
			in = socket.getInputStream();
			out = socket.getOutputStream();

			// 用于从控制台获取输入
			Scanner sc = new Scanner(System.in);

			while (true) {// 循环发送和接收消息
				// 从控制台获取数据输入后发送到服务器
				String msg = sc.nextLine();

				// 发送数据
				out.write(msg.getBytes());// 将获取到的字符串转为字节数组后发送
				out.flush();

				// 读取服务器返回的数据
				byte[] bufin = new byte[32];
				in.read(bufin);
				String data = new String(bufin);
				System.out.println(data.trim());// trim()用于将字符串末尾的空格去掉
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭流
				in.close();
				out.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}