package com.prototype.entertainment;

public class Movie implements PrototypeCapable {

	private String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public PrototypeCapable clone() throws CloneNotSupportedException {
		System.out.println("Cloning Movie Object...");
		return (PrototypeCapable)super.clone();
	}


	@Override
	public String toString() {
		return "Movie [name=" + name + "]";
	}
}
