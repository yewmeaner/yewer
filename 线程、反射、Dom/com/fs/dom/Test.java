package com.fs.dom;

import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test {
	public void show() throws Exception {
		// 创建DocumentBuilder对象
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		// 使用DocumentBuilder对象解析xml文件输入流，返回一个Document对象，该对象保存xml中所有元素信息。
		Document doc = builder.parse(new FileInputStream("线程、反射、Dom/books.xml"));
		// 得到元素根节点
		Node root = doc.getDocumentElement();
		NodeList nodeList = root.getChildNodes();
		// 使用递归遍历所有子节点
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node bookNode = nodeList.item(i);
			if ("book".equals(bookNode.getNodeName())) {
				String id = bookNode.getAttributes().getNamedItem("id").getNodeValue();
				String name = bookNode.getAttributes().getNamedItem("name").getNodeValue();
				String price = bookNode.getAttributes().getNamedItem("price").getNodeValue();
				System.out.println(id + "," + name + "," + price);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new Test().show();
	}
}