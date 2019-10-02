package com.abstractfactory.button;

public class WindowsButton implements Button {

	@Override
	public boolean setHeader(String header) {
		System.out.println("Windows setHeader method called");
		return false;
	}

}
