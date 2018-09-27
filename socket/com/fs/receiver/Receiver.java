package com.fs.receiver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//接收端（服务器）
public class Receiver {

	public static void main(String[] args) {
		DatagramSocket socket = null;

		try {
			// 1、创建一个UDP Socket对象
			socket = new DatagramSocket(9999);

			// 2、创建数据包对象：用来装读取到的数据包
			byte[] buf = new byte[128];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);

			while (true) {
				// 3、通过Socket对象接收数据包
				socket.receive(packet);

				// 4、通过数据包取出数据
				byte[] b = packet.getData();
				String s = new String(b);
				System.out.println("接收到的数据时：" + s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5、关闭socket
			socket.close();
		}
	}

}