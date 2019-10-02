package com.abstractfactory;

import com.abstractfactory.button.ButtonComponent;
import com.abstractfactory.button.MacButtonComponent;
import com.abstractfactory.scroll.MacScrollComponent;
import com.abstractfactory.scroll.ScrollComponent;

public class ConcreteMacUIFactory extends AbstractUIFactory{

	@Override
	public ButtonComponent createButton() {
		return new MacButtonComponent().getButtonComponent("Mac Button");
	}

	@Override
	public ScrollComponent createScroll() {
		return new MacScrollComponent().getScrollComponent("Mac scroller");
	}

}
