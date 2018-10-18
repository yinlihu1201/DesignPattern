package com.tiger.behavior.interpreter;

/**
 * 
 * 解释器模式：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示，来解释语言中的句子。
 * 
 * 
 * 
 * 
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		
		System.out.println("上海滩：");
		context.setPlayText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
		
		Expression expression = null;
		while (context.getPlayText().length() > 0) {
			String str = context.getPlayText().substring(0,1);
			switch (str) {
			case "O": // 为O的时候代表是音阶，其他为音符
				expression = new ScaleExpression();
				break;
			
			case "T":
				expression = new SpeedExpression();
				break;
			
			case "C":
			case "D":
			case "E":
			case "F":
			case "G":
			case "A":
			case "B":
			case "P":
				expression = new NoteExpression();
				break;
			}
			
			expression.interpreter(context);
		}
	}
}
