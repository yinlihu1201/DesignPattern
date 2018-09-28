package com.tiger.behavior.visitor;
/**
 * 访问者模式
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		// 数据结构相对要固定，不然在Action中变化会很大
		ObjectStructure os = new ObjectStructure();
		os.attach(new Man());
		os.attach(new Woman());
		
		// 成功
		Action success = new Success();
		os.display(success);
		
		// 失败
		Action failure = new Failure();
		os.display(failure);
	}
}
