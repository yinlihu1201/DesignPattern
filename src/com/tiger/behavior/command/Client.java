package com.tiger.behavior.command;


/**
 * 
 * 命令模式（单一职责，迪米特法则）： 将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作
 * 
 * 应用场景；
	     比如你去吃饭，如果让你直接和厨师进行交流，要什么菜，什么口味，如果人少了可以，但是人多了呢，厨师本身就有做饭的职责
	     ，在加上沟通，管理很不方便，那么在中间加上服务员这个角色，然后通过订单的方式将需要做什么菜的命令传递到厨师手上，那么就很好的实现了解耦的操作。
 * 
 * 
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		Barbecuer barbecuer = new Barbecuer();
		
		Command bm1 = new BakeMuttonCommand(barbecuer);
		Command bm2 = new BakeMuttonCommand(barbecuer);
		
		Command bc1 = new BakeChickenWingCommand(barbecuer);
		
		Waiter girl = new Waiter();
		girl.createOrder(bm1);
		girl.createOrder(bm2);
		girl.createOrder(bc1);
		
		girl.start();
	}
}
