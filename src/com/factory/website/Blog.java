package com.factory.website;

import java.util.ArrayList;

public class Blog extends Website {

	public Blog() {
		System.out.println("Blog constructor called");
	}
	
	@Override
	public void createPages() {
		System.out.println("Blog createPages method executed");
		pages = new ArrayList<>();
		pages.add(new PostPage());
		pages.add(new CommentPage());
	}

}
