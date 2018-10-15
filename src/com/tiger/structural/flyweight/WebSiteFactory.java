package com.tiger.structural.flyweight;

import java.util.Hashtable;

public class WebSiteFactory {
	private Hashtable<String, WebSite> flyweights = new Hashtable<String, WebSite>();
	
	public WebSite getWebSiteCategory(String key){
		if(!flyweights.contains(key)){
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return flyweights.get(key);
	}
	
	public WebSite getUnshareWebSiteCategory(String name){
		return new UnshareConcreteWebSite(name);
	}
	
	public int getWebSiteCount(){
		return flyweights.size();
	}
}
