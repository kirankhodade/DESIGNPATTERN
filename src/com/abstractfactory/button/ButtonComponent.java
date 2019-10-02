package com.abstractfactory.button;

public abstract class ButtonComponent {
	
	Button button = null;
	
	public abstract Button createButton();
	
	public ButtonComponent getButtonComponent(String buttonHeader) {
		button = createButton();
		button.setHeader(buttonHeader);
		return this;
	}
}
