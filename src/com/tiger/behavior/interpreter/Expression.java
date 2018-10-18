package com.tiger.behavior.interpreter;

/**
 * 解释器
 * @author yinlihu
 *
 */
public abstract class Expression {
	public void interpreter(PlayContext context){
		if(context.getPlayText().length() == 0){
			return;
		}else{
			String playKey = context.getPlayText().substring(0,1);
			context.setPlayText(context.getPlayText().substring(2));
			Double playValue = Double.valueOf(context.getPlayText().substring(0,context.getPlayText().indexOf(" ")));
			context.setPlayText(context.getPlayText().substring(context.getPlayText().indexOf(" ") + 1));
			
			excute(playKey, playValue);
		}
	}
	
	public abstract void excute(String key,double value);
}
