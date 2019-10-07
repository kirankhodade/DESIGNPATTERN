package com.abstractfactory;

public class ClientApp {
	public static void main(String[] args) {
		AbstractUIFactory ui = ClientApp.getUIPlatform(PlatformType.MAC);
		ui.getUIComponent();
		
		ui = ClientApp.getUIPlatform(PlatformType.WINDOWS);
		ui.getUIComponent();
		
		ui = ClientApp.getUIPlatform(PlatformType.LINUX);
		ui.getUIComponent();
	}
	
	//It is a static/simple factory, but NOT factory method design pattern as it does not conform to Gang of 4 definition : of let subclass decide which object to instantiate.
			public static AbstractUIFactory getUIPlatform(PlatformType type) {
				switch(type) {
					case WINDOWS : {
						return new ConcreteWindowsUIFactory();
					}
					case MAC : {
						return new ConcreteMacUIFactory();
					}
					case LINUX : {
						return new ConcreteLinuxUIFactory();
					}
					default : {
						return null;
					}
				}
		 }
	}
