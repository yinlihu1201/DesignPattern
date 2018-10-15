package com.tiger.structural.flyweight;

/**
 * 
 * 享元模式：
    	运用共享技术有效的支持大量细粒度的对象。注意：这里有不共享的对象，因为即使功能相同的页面，使用人群可能不同，那么就会有不共享的部分。
    	
 * 应用场景：
    	现在你做一个网站，就是简单的展示功能，或者做一个简单的博客。如果做一个，很快能做完，并且部署也很简单，现在有另一个项目也需要此功能，而且东西基本相同，那么该如何做呢？是复制一份代码重新部署吗？
    	
 * 享元模式的作用：
    	享元模式可以避免大量非常相类似的开销。在程序设计中，有时需要生成大量细粒度的类实例来表示数据。如果能发现这些类的实例除了几个参数外基本相同
    	，有时就能够大幅度地减少需要实例化类的数量。如果能把那些参数移到类实例的外面，在方法调用时将它们传递进来，就可以通过共享大幅度减少单个实例的数目。
 * 
 * @author yinlihu
 *
 */
public class Client {
	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();
		
		// 共享的网站分类
		f.getWebSiteCategory("产品展示").use(new User("tiger"));
		f.getWebSiteCategory("产品展示").use(new User("隔壁老王"));
		
		f.getWebSiteCategory("博客").use(new User("隔壁小王"));
		
		System.out.println(f.getWebSiteCount());
		
		// 不进行共享的网站分类
		f.getUnshareWebSiteCategory("管理平台").use(new User("小米"));;
	}
}
