package com.tiger.behavior.observer.reflect;

/**
 * 
 * 在观察者模式的基础上，使用 反射 为了解决观察者模式的缺点
 * 
 * 观察者模式的缺点：
    1. 抽象观察者依旧依赖于通知者
    2. 具体的观察者，通知方法被固定了，比如看股票和看NBA方法都叫update()，这样本身就有问题
    	，而且还定死了观察者的类型，如果我新加一个观察者，不实现抽象观察者，那么就无法添加到通知者中.
 * 
 * 事件委托：
    1. 为了解决观察者依赖于通知者的，在中间加一个委托对象（使用反射实现），委托对象中使用固定方法进行调用。
    2. 使用反射，这样就不用关心观察者的对象，只要在客户端调用的时候进行委托，那么就可以直接调用，不会影响其他功能
 * 
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		Subject boss = new Boss();
		boss.setAction("老板通知");
		
		StockObserver o1 = new StockObserver("小王", boss); // 这边要设置观察哪个主题
		NBAObserver o2 = new NBAObserver("小李", boss);
		
		Event e1 = new Event("closeStock", o1, null);
		Event e2 = new Event("closeNBA", o2, null);
		
		boss.attach(e1);
		boss.attach(e2);
		boss.notifyObserve();
	}
}
