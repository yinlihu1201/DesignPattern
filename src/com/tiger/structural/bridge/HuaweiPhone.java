package com.tiger.structural.bridge;

public class HuaweiPhone extends Phone {

	@Override
	public void run() {
		System.out.println("huawei手机运行：");
		soft.run();
	}

}
