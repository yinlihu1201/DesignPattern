package com.tiger.behavior.templateMethod;

/**
 * 
 * 模板方法模式：定义一个操作算法的骨架，而将一些不同步骤延迟到子类实现，模板方法可以不改变一个算法的结构即可重定义改算法的某些特定步骤。
 * 
 * 作用：
  		模板方法模式通过把不变的行为搬移到父类中，去除子类的重复代码。
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("================学生A的试卷================");
		TestPaper a = new TestPaperA();
		a.question1();
		a.question2();
		a.question3();
		
		System.out.println("================学B的试卷================");
		TestPaper b = new TestPaperB();
		b.question1();
		b.question2();
		b.question3();
	}
}
