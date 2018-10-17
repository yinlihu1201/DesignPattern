package com.tiger.behavior.mediator;

/**
 * 
 * 中介者模式：用一个中介对象封装一系列对象交互。中介者使各个对象不需要显式的相互作用，从而使其耦合松散，而且可以独立的改变他们之间的交互。
 * 
 * 以下代码会发现一个问题：
  	ConcreteMediator类的责任很多，如果此类出现问题，那么会影响所有功能的调用。
  	所有在使用任何设计模式前，都需要经过详细的设计，确认业务逻辑是否适合此设计模式，或者是否可以改变设计模式，将多个设计模式进行整合。

 * 应用场景：
  	中介者模式一般应用与一组对象以定义良好、但是用复杂的方式进行通信的场合，比如一个计算器页面。
  	以及想定制一个分布在多个类中的行为，而又不想生成太多子类的场合。
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		
		ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 c2 = new ConcreteColleague2(mediator);
		
		mediator.setCc1(c1);
		mediator.setCc2(c2);
		
		c1.send("吃了没"); // 同事1发给2的
		c2.send("还没有");
	}

}
