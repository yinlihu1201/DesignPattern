package com.tiger.behavior.observer.base;

/**
 * 
 * 观察者模式：发布-订阅模式，定义了一种一对多的依赖关系，让多个观察者对象监听同一个主题对象，这个主题对象在状态发生变化时，会通知所有观察者对象。
 * 
 * 观察者模式什么时候使用？
	当一个对象的改变需要同时改变其他对象，并且不知道有多少对象需要改变。
	这样观察者模式就解除了通知者和观察者之间的耦合，让耦合的双方都依赖于抽象，而不是依赖具体。
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
		Subject subject = new Secretary();
		subject.setAction("秘书通知");
		Subject boss = new Boss();
		boss.setAction("老板通知");
		
		Observer o1 = new StockObserver("小王", subject); // 这边要设置观察哪个主题
		Observer o2 = new NBAObserver("小李", subject);
		
		boss.attach(o1);
		boss.notifyObserve();
		
		subject.attach(o1);
		subject.attach(o2);
		
		subject.notifyObserve();
	}
}
