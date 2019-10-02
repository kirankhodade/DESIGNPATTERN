package com.abstractfactory.scroll;

public class LinuxScroll implements Scroll {

	@Override
	public boolean setHeader(String header) {
		System.out.println("Linux scroll setHeader method called");
		return false;
	}

}
