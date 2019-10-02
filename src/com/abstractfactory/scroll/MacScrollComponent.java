package com.abstractfactory.scroll;

public class MacScrollComponent extends ScrollComponent {

	@Override
	public Scroll createScroll() {
		System.out.println("MAC scroll created");
		return new MacScroll();
	}

}
