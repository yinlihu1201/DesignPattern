package com.tiger.behavior.observer.reflect;

import java.lang.reflect.Method;

/**
 *  * 事件委托：
    1. 为了解决观察者依赖于通知者的，在中间加一个委托对象（使用反射实现），委托对象中使用固定方法进行调用。
    2. 使用反射，这样就不用关心观察者的对象，只要在客户端调用的时候进行委托，那么就可以直接调用，不会影响其他功能
    
 * @author yinlihu
 *
 */
@SuppressWarnings("rawtypes")
public class Event {
	private String methodName; // 委托的方法名称
	private Object target; // 委托者
	private Class[] paramsType; // 方法参数类型
	private Object[] params; // 方法参数
	
	public Event(String methodName, Object target, Object[] params) {
		super();
		this.methodName = methodName;
		this.target = target;
		this.params = params;
		if(params != null){
			createParamsByClass();
		}
	}
	/**
	 * 执行方法
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public void invoke() throws Exception, SecurityException{
		Method method = target.getClass().getMethod(methodName, paramsType);
		if(method != null){
			method.invoke(target, params);
		}
	}
	
	/**
	 * 获取方法参数的类型
	 */
	private void createParamsByClass(){
		paramsType = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			paramsType[i] = params[i].getClass();
		}
	}
}
