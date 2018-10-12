package com.tiger.structural.decorator;

/**
 * 装饰模式：
    1.动态的给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
    2.把每个需要装饰的功能放在单独的类中，这样当需要执行装饰功能时，客户代码可以在运行时根据需求，有选择性地，按顺序的使用装饰功能包装对象。
    3. 有效的把类的核心职责和装饰功能区分开，去除相关类中重复的装饰逻辑。
    
    
 * 业务场景：
    1. 写一个给人搭配不同的服饰的系统，比如QQ的装饰系统
 * 
 * 解决方案：
    1. 封装：将装饰和人的行为封装成各自的类
    2. 继承：将装饰类作为父类，定义好接口，具体的装饰比如西装，裤子等继承此类即可。
    3. 多态：在装饰类中创建/传入人的对象（给人穿衣服），并装饰类中存在show()方法调用人展示的方法show(),装饰类的子类重写此方法，并调用父类的方法。
    4. 客户端：如果要给人穿不同的衣服，只需创建人的对象，创建需要装饰的类的对象，按照顺序一步一步将对象当做另一个对象的参数传入即可，如下图。
    
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("小明");
		
		System.out.println("============第一种装扮===============");
		// 第一种装扮
		TShirts tShirt = new TShirts();
		Trouser trouser = new Trouser();
		
		trouser.decorator(person);
		tShirt.decorator(trouser);
		
		tShirt.show();
		
		System.out.println("============第二种装扮===============");
		// 第二种装扮
		Tie tie = new Tie();
		Suit suit = new Suit();
		
		tie.decorator(person);
		suit.decorator(tie);
		suit.show();
	}
}
