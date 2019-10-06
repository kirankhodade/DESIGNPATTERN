package com.prototype.entertainment;

public class Show implements PrototypeCapable {

	private String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public PrototypeCapable clone() throws CloneNotSupportedException {
		System.out.println("Cloning Show Object...");
		return (PrototypeCapable)super.clone();
	}


	@Override
	public String toString() {
		return "Show [name=" + name + "]";
	}

}
