package com.abstractfactory.scroll;

public class ClientApp {
	public static void main(String[] args) {
		ScrollComponent bc = ClientApp.getScrollCompType(ScrollCompType.LINUX);
		bc.getScrollComponent("Left Scroller");
		System.out.println(bc);
		
	}
	
	//It is a static/simple factory, but NOT factory method design pattern as it does not conform to Gang of 4 definition : of let subclass decide which object to instantiate.
			public static ScrollComponent getScrollCompType(ScrollCompType scType) {
				switch(scType) {
					case WINDOWS : {
						return new WindowsScrollComponent();
					}
					case MAC : {
						return new MacScrollComponent();
					}
					case LINUX : {
						return new LinuxScrollComponent();
					}
					default : {
						return null;
					}
				}
		 }
}
