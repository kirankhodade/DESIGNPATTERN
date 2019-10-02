package com.factory.website;

public class ClientApp {

	public static void main(String[] args) {
		
	    Website shopSite = ClientApp.getWebsite(WebsiteType.SHOP);
		Website blogSite = ClientApp.getWebsite(WebsiteType.BLOG);
		
		System.out.println("\n\n****************************************");
		System.out.println(shopSite.getWebsitePages()+"\n");
		System.out.println(blogSite.getWebsitePages());
	}
	
	//It is a static/simple factory, but NOT factory method design pattern as it does not conform to Gang of 4 definition : of let subclass decide which object to instantiate.
	public static Website getWebsite(WebsiteType siteType) {
		switch(siteType) {
			case BLOG : {
				return new Blog();
			}
			case SHOP : {
				return new Shop();
			}
			default : {
				return null;
			}
		}
	}

}
