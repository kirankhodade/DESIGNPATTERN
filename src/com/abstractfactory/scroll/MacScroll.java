package com.abstractfactory.scroll;

public class MacScroll implements Scroll {

	@Override
	public boolean setHeader(String header) {
		System.out.println("MAC scroll setHeader method called");
		return false;
	}

}
