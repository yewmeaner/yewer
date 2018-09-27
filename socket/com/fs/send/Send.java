package com.fs.send;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//接收端（客户端）
public class Send {

	public static void main(String[] args) {
		try {
			// 创建UDP Socket对象
			DatagramSocket socket = new DatagramSocket();

			// 定义要发送的数据
			String data = "hello Receiver";// 要发送的字符串
			byte[] buf = data.getBytes();// 将字符串转为字节数组

			// 3、创建一个数据包对象，需要封装发送的数据、接收端的ip、port
			/**
			 * 第一个参数表示要发送的数据 第二个参数表示发送的长度 第三个参数表示接收端的ip地址 第四个参数表示接收端的端口号
			 */
			DatagramPacket packet = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 9999);

			// 4、通过socket对象发送数据包
			socket.send(packet);

			System.out.println("数据发送成功");

			// 5、关闭socket
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}