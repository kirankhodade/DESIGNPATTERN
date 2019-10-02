package com.abstractfactory.scroll;

public abstract class ScrollComponent {
	
	Scroll scroll = null;
	
	public abstract Scroll createScroll();
	
	public ScrollComponent getScrollComponent(String scrollHeader) {
		scroll = createScroll();
		scroll.setHeader(scrollHeader);
		return this;
	}
}
