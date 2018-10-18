package com.tiger.behavior.interpreter;

import java.text.DecimalFormat;

/**
 * 音阶类
 * @author yinlihu
 *
 */
public class ScaleExpression extends Expression {

	@Override
	public void excute(String key, double value) {
		String scale = "";
		
		switch (Integer.parseInt(new DecimalFormat("0").format(value))) {
		case 1:
			scale = "低音";
			break;
		case 2:
			scale = "中音";
			break;
		case 3:
			scale = "高音";
			break;
		}
		System.out.println(scale);
	}
}
