package com.tiger.behavior.visitor;
/**
 * 访问者模式:表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * 
 * 引用场景：
 * 	    在数据结构相对稳定的条件下使用此模式，比如人类，分为男人，女人（男人、女人对应的就是数据结构，是固定不变的），而男女对应的状态是不同的，都有成功
 * 
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
