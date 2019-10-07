package com.abstractfactory;

import com.abstractfactory.button.ButtonComponent;
import com.abstractfactory.scroll.ScrollComponent;

public abstract class AbstractUIFactory {
	ButtonComponent bc;
	ScrollComponent sc;
	
	public abstract ButtonComponent createButton();
	public abstract ScrollComponent createScroll();
	
	public void getUIComponent() {
		bc = createButton();
		sc = createScroll();
		
		System.out.println("AbstractFactory getUIComponent executed..."+this.bc+" :: "+this.sc+"\n");
	}
}
