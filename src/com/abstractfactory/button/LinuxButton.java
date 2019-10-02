package com.abstractfactory.button;

public class LinuxButton implements Button {

	@Override
	public boolean setHeader(String header) {
		System.out.println("Linux setHeader method called");
		return false;
	}

}
