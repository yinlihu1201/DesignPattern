package com.tiger.structural.adapter;

/**
 * 适配器-翻译
 * @author yinlihu
 *
 */
public class TranslatorAdaptor extends USABasketballPlayer {
	
	private ChineseCenter center = new ChineseCenter(); // 在此处引入需要适配的类

	public TranslatorAdaptor(String name) {
		super(name);
		center.setName(name);
	}

	@Override
	public void attack() {
		System.out.println("翻译人员给中国球员" + name + "解释：");
		center.attack();
	}

	@Override
	public void defense() {
		System.out.println("翻译人员给中国球员" + name + "解释：");
		center.defense();
	}

}
