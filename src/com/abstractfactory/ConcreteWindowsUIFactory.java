package com.abstractfactory;

import com.abstractfactory.button.ButtonComponent;
import com.abstractfactory.button.WindowsButton;
import com.abstractfactory.button.WindowsButtonComponent;
import com.abstractfactory.scroll.ScrollComponent;
import com.abstractfactory.scroll.WindowsScrollComponent;

public class ConcreteWindowsUIFactory extends AbstractUIFactory {

	@Override
	public ButtonComponent createButton() {
		return new WindowsButtonComponent().getButtonComponent("Windows Button");
	}

	@Override
	public ScrollComponent createScroll() {
		return new WindowsScrollComponent().getScrollComponent("Windows Scroller");
	}
	
}
