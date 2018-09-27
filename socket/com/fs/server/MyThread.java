package com.fs.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyThread extends Thread {
	private Socket socket;
	private InputStream in;
	private OutputStream out;

	public MyThread(Socket socket) {
		this.socket = socket;

		// 获得客户端IP与port
		String ip = socket.getInetAddress().getHostAddress();
		int port = socket.getPort();
		System.out.println("ip:" + ip + ", port:" + port + "的客户端连入");
	}

	// 发送接收数据
	@Override
	public void run() {// 线程执行：响应客户端（数据收发）
		try {
			// 获取输入输出流对象
			in = socket.getInputStream();
			out = socket.getOutputStream();

			while (true) {
				// 通信协议：loginnameabcpass123end

				// 读取数据并解析数据，取出相应的内容进行判断
				byte[] bufin = new byte[32];
				in.read(bufin);// 读取数据并将读取到的数据放到bufin中

				// 解析数据，取出标志、用户名、密码
				String data = new String(bufin);// 将字节数组转为字符串
				String logo = data.substring(0, 5);// login
				String name = data.substring(data.indexOf("name") + 4,
						data.indexOf("pass"));// abc
				String pass = data.substring(data.indexOf("pass") + 4,
						data.indexOf("end"));// 123

				String msg = "";

				// 判断内容是否正确
				if (logo.equals("login")) {// 登录
					if (name.equals("abc")) {// 用户名
						if (pass.equals("123")) {// 密码
							msg = "用户登录成功";
						} else {
							msg = "密码输入错误";
						}
					} else {
						msg = "用户名不存在";
					}
				} else {
					msg = "数据输入错误";
				}

				// 发送数据
				out.write(msg.getBytes());// 将字符串转为字节数组后发送到客户端
				out.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//关闭流以及套接字
				in.close();
				out.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}