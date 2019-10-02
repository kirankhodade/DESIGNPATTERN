package com.abstractfactory.button;

public class LinuxButtonComponent extends ButtonComponent {
	
	@Override
	public Button createButton() {
		System.out.println("Linux buttn created");
		return new LinuxButton();
	}
}
