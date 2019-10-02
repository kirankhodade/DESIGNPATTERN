package com.abstractfactory.button;

public class WindowsButtonComponent extends ButtonComponent {

	@Override
	public Button createButton() {
		System.out.println("Windows buttn created");
		return new WindowsButton();
	}

}
