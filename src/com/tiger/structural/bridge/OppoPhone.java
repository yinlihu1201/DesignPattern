package com.tiger.structural.bridge;

public class OppoPhone extends Phone {

	@Override
	public void run() {
		System.out.println("oppo手机运行：");
		soft.run();
	}

}
