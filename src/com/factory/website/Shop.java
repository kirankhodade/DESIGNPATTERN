package com.factory.website;

import java.util.ArrayList;

public class Shop extends Website {

	public Shop() {
		System.out.println("Shop constructor called");
	}
	
	@Override
	public void createPages() {
		System.out.println("Shop createPages method executed");
		pages = new ArrayList<>();
		pages.add(new CartPage());
		pages.add(new ItemPage());
	}
}
