package com.abstractfactory;

import com.abstractfactory.button.ButtonComponent;
import com.abstractfactory.button.LinuxButtonComponent;
import com.abstractfactory.scroll.LinuxScrollComponent;
import com.abstractfactory.scroll.ScrollComponent;

public class ConcreteLinuxUIFactory extends AbstractUIFactory{

	@Override
	public ButtonComponent createButton() {
		return new LinuxButtonComponent().getButtonComponent("Linux Button");
	}

	@Override
	public ScrollComponent createScroll() {
		return new LinuxScrollComponent().getScrollComponent("Linux Scroller");
	}

}
