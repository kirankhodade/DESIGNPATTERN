package com.prototype.ecommerce;

public class ClientApp {
	public static void main(String[] args) {
		Registry reg = new Registry();
		
		Movie m = (Movie)reg.createItem("Movie");
		m.setTitle("Fight Club");
		System.out.println(m);
		System.out.println(m.getTitle());
		System.out.println(m.getRunTime());
		System.out.println(m.getUrl());
		
		m = (Movie)reg.createItem("Movie");
		m.setTitle("Matrix Reloaded");
		System.out.println(m);
		System.out.println(m.getTitle());
		System.out.println(m.getRunTime());
		System.out.println(m.getUrl());
	}
}
