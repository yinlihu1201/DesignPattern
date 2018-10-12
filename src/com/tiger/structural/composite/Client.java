package com.tiger.structural.composite;

/**
 * 
 * 组合模式： 将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * 
 * 
 * 何时使用组合模式？
	    需求中是体现部分与整体层次的结构时，以及希望用户忽略组合对线与单个对象的不同，统一的使用组合结构中的所有对象时。
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("总公司");
		root.add(new FinanceDepartmentLeaf("总公司财务部"));
		root.add(new HrDepartmentLeaf("总公司人力资源部"));
		
		ConcreteCompany beijing = new ConcreteCompany("北京分公司");
		beijing.add(new FinanceDepartmentLeaf("北京分公司财务部"));
		beijing.add(new HrDepartmentLeaf("北京分公司人力资源部"));
		root.add(beijing);
		
		ConcreteCompany beijingzhongzhi = new ConcreteCompany("北京分公司中支公司");
		beijingzhongzhi.add(new JavaDepartmentLeaf("北京分公司中支公司Java研发部 "));
		beijing.add(beijingzhongzhi);
		
		ConcreteCompany shanghai = new ConcreteCompany("上海分公司");
		shanghai.add(new FinanceDepartmentLeaf("上海分公司财务部"));
		shanghai.add(new HrDepartmentLeaf("上海分公司人力资源部"));
		shanghai.add(new JavaDepartmentLeaf("上海分公司Java研发部"));
		root.add(shanghai);
		
		System.out.println("===========公司结构图==============");
		root.display(0);
		
		System.out.println("===========公司职责图==============");
		root.lineDuty();
		
	}
}
