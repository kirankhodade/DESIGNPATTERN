package com.abstractfactory.scroll;

public class WindowsScrollComponent extends ScrollComponent {

	@Override
	public Scroll createScroll() {
		System.out.println("Windows scroll created");
		return new WindowsScroll();
	}

}
