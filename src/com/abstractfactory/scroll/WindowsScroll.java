package com.abstractfactory.scroll;

public class WindowsScroll implements Scroll {

	@Override
	public boolean setHeader(String header) {
		System.out.println("Windows scroll setHeader method called");
		return false;
	}

}
