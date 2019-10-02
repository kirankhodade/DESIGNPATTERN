package com.abstractfactory.button;

public class ClientApp {
	public static void main(String[] args) {
		ButtonComponent bc = ClientApp.getButtonCompType(ButtonCompType.LINUX);
		bc.getButtonComponent("Submit Button");
		System.out.println(bc);
		
		bc = ClientApp.getButtonCompType(ButtonCompType.WINDOWS);
		bc.getButtonComponent("Submit Button");
		System.out.println(bc);
		
		bc = ClientApp.getButtonCompType(ButtonCompType.MAC);
		bc.getButtonComponent("Submit Button");
		System.out.println(bc);
		
	}
	
	//It is a static/simple factory, but NOT factory method design pattern as it does not conform to Gang of 4 definition : of let subclass decide which object to instantiate.
			public static ButtonComponent getButtonCompType(ButtonCompType bcType) {
				switch(bcType) {
					case WINDOWS : {
						return new WindowsButtonComponent();
					}
					case MAC : {
						return new MacButtonComponent();
					}
					case LINUX : {
						return new LinuxButtonComponent();
					}
					default : {
						return null;
					}
				}
		 }
}
