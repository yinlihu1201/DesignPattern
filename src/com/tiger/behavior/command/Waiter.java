package com.tiger.behavior.command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {
	private List<Command> orders = new ArrayList<Command>();

	public void createOrder(Command c) {
		if(c.toString() == "没有东西了"){
			System.out.println("服务员：没有东西了");
		}else{
			orders.add(c);
			System.out.println("增加订单：" + c.toString() + " 时间：" + new Date());
		}
	}
	
	public void cancelOrder(Command c){
		orders.remove(c);
		System.out.println("取消订单：" + c.toString() + " 时间：" + new Date());
	}
	
	public void start(){
		
		for (Command command : orders) {
			command.excuteCommand();
		}
	}
}
