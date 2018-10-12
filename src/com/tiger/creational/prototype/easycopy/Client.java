package com.tiger.creational.prototype.easycopy;


/**
 * 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。其实就是从一个对象创建另一个可定制对象，而且不需要任何创建的细节
 * 
 * 浅复制和深复制：浅复制只复制值，而不管对象的引用；深复制是将对象内部引用也进行值的赋值，这样变更的时候，引用的对线也会修改。
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype cp1 = new Prototype("1","小明");
		Work work = new Work();
		work.setContent("你好");
		work.setId("1");
		cp1.setWork(work);
		
		Prototype clone = cp1.clone();
		clone.setId("2");
		clone.setName("小王");
		clone.getWork().setContent("不好");
		
		System.out.println(cp1.getId()+"  "+cp1.getName() + "   " + cp1.getWork().getContent());
		System.out.println(clone.getId()+"  "+clone.getName() + "   " + clone.getWork().getContent());
	}
}
