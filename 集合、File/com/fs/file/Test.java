package com.fs.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {
	// 对象序列化
	public void m1() throws Exception {
		// 创建文件字节输出流
		OutputStream out = new FileOutputStream("e:/x.txt", true);
		// 创建对象输出
		ObjectOutputStream obj = new ObjectOutputStream(out);
		// 创建实现了Serializable接口类的对象
		Student stu = new Student("Miss", 22, '女');
		// 将对象输出到指定文件
		obj.writeObject(stu);
		System.out.println("操作成功！");
		// 关闭流
		obj.close();

		out.close();
	}

	// 对象反序列化
	public void m2() throws Exception {
		InputStream in = new FileInputStream("e:/x.txt");

		ObjectInputStream obj = new ObjectInputStream(in);
		Student stu = (Student) obj.readObject();
		System.out.println(stu);
		System.out.println("操作成功！");
		obj.close();
		in.close();

	}

	public static void main(String[] args) throws Exception {
		new Test().m2();
	}

}
