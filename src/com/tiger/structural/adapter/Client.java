package com.tiger.structural.adapter;
/**
 * 适配器模式:将一个类的接口转换成客户希望的另一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * 
 * 应用场景：
 * 		想用一个已经存在的类，但如果它的接口，也就是它的方法和你要求不相同时，就应该考虑适配器模式。
 * 		比如投影仪，有多种接口，如果电脑不支持某种接口的话，只需要一个“转接头”，即可进行适配使用
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		USABasketballPlayer huo = new USACenter("霍华德");
		USABasketballPlayer yao = new TranslatorAdaptor("姚明");
		
		huo.attack();
		huo.defense();
		
		yao.attack();
		yao.defense();
	}
}
