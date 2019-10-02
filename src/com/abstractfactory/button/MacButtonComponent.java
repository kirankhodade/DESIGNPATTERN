package com.abstractfactory.button;

public class MacButtonComponent extends ButtonComponent {

	@Override
	public Button createButton() {
		System.out.println("MAC buttn created");
		return new MacButton();
	}

}
