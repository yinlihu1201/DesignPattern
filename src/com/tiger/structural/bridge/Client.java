package com.tiger.structural.bridge;

/**
 * 桥接模式：将抽象部分与他的实现部分分离，使他们都可以独立地变化。
 * 
 * 应用场景：
	    实现和继承并不是在所有时候都好用，如果一个父类经常变动，那么其子类需要经常改变，这样会导致代码维护或开发更加繁琐。如果使用组合的方式进行开发，那么会灵活很多，类的细粒度会更小，改动也会更小。
	    比如一个手机，里面有游戏、软件等，手机有多个品牌，如果写成继承模式的话，就是每个手机里面有各个软件或者游戏，不同品牌手机需要实现这些接口，这样如果新增一个新功能，那么会发现改动过大，一个品牌的修改会导致所有功能修改。
	    手机实现手机类，软件实现软件类，然后在手机类中引入软件类即可，这样改变是最小的。
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		Phone huawei = new HuaweiPhone();
		huawei.setSoft(new GameSoft());
		huawei.run();
		huawei.setSoft(new PhonebookSoft());
		huawei.run();
		
		Phone oppo = new OppoPhone();
		oppo.setSoft(new GameSoft());
		oppo.run();
		oppo.setSoft(new PhonebookSoft());
		oppo.run();
	}
}
