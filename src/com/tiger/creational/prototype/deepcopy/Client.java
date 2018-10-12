package com.tiger.creational.prototype.deepcopy;


/**
 * 深复制：对象中的所有引用对象也进行赋值
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
