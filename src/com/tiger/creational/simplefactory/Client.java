package com.tiger.creational.simplefactory;
/**
 * 简单工厂模式
 * 
 * 业务场景：
    1. 现在有一个计算器，里面只有+，-，*，/四个运算，但是以后可能会扩展，需要设计此计算器；
    
    
 * 解决方式：
    1. 高可扩展性：就是已最小改动可以实现新功能
    2. 封装：把计算的功能都封装成一个父类（Operatorion），类里面有以下功能
            传值/取值：set/get
            获得计算结果：getResult()
    3. 继承：所有运算的类(AddOperation、DiffOperation)的继承上面封装的类，不同的计算规则，在getResult()中使用不同的运算规则进行处理。
    4. 多态：在另一个工厂类（Factory）中，使用switch创建Operation的子类（不同的运算符创建不同的子类），使用Operation进行引用（使用多态），调用getResult()方法即可。

 * 使用：
	    1. 如果新增一个运算，那么就只需新增一个Operation的子类，在getResult()方法中实现对应的规则，在工厂类中的switch加一个运算即可。
    
    
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		Operation ope = OperationFactory.createOperation("-");
		ope.setNumA(10);
		ope.setNumB(20);
		double result = ope.getResult();
		System.out.println(result);
	}
}
