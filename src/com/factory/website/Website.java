package com.factory.website;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	protected List<Page> pages = null;
	
	public Website() {
		System.out.println("Website constructor called..");
	}

	
	public List<Page> getWebsitePages() {
		this.createPages();
		return this.pages;
	}

	//factory method
	public abstract void createPages();
}
