package com.abstractfactory.scroll;

public class LinuxScrollComponent extends ScrollComponent {
	
	@Override
	public Scroll createScroll() {
		System.out.println("Linux scroll created");
		return new LinuxScroll();
	}
}
