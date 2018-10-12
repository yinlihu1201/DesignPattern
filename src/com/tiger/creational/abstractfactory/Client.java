package com.tiger.creational.abstractfactory;

import com.tiger.creational.abstractfactory.normal.IDepartment;
import com.tiger.creational.abstractfactory.normal.IFactory;
import com.tiger.creational.abstractfactory.normal.IUser;
import com.tiger.creational.abstractfactory.normal.MysqlFactory;
import com.tiger.creational.abstractfactory.normal.User;

/**
 * 抽象工厂模式：
 * 	   	提供一个创建一系列相关或互相依赖对象的接口，而无需指定他们具体的类。
 * 		相对于工厂模式，是把产品也抽象出来，形成不同产品的接口，进行调用。
 * 
 * 优点与缺点：
    	优点：便于交换产品的系列，由具体的工厂类进行变化
    	缺点：如果需要增加功能，那么就需要改工厂类接口及实现，这样大量改动会非常繁琐。
    	
 * 如何简化抽象工厂模式的这种缺点？
    	使用简单工厂模式，替换抽象工厂IFactory，SqlServerFactory，AccessFactory这些，使用switch进行筛选，代码如下。
    	使用以下代码，即可替代之前那么多繁琐的内容，所以不是说代码抽象一定就好，选择最适合的模式，模式之间的组合也是十分重要的。
    	
 * 二次简化，使用反射：
    	把switch部分的代码使用反射进行代替，那么不管产品怎么改，只要命名按照一定的格式命名，那么就不用改任何代码即可调用。
    	新增功能的时候，只需在DataAccess中增加新功能的代码即可。  	
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		// 正常抽象工厂模式
		IFactory factory = new MysqlFactory();
		IUser user = factory.createUser();
		User u = new User();
		u.setName("aaa");
		user.insert(u);
		IDepartment dep = factory.createDepartment();
		dep.insert();
		
		// 使用简单工厂简化抽象工厂模式
		IUser createUser = SimpleFactory.createUser();
		System.out.println(createUser.getUser("aaa").getName());
		
		// 简单工厂加反射
		IUser createUser2 = ReflectSimpleFactory.createUser();
		System.out.println(createUser2.getUser("bbb").getName());
	}
}
