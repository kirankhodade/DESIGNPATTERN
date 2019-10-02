package com.abstractfactory.button;

public class MacButton implements Button {

	@Override
	public boolean setHeader(String header) {
		System.out.println("MAC setHeader method called");
		return false;
	}

}
