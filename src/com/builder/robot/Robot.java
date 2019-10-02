package com.builder.robot;

public class Robot {
	private String arms;
	private String legs;
	private String head;
	private String doors;
	private String wheels;
	private String sensors;
	private String fireArms;
	
	public String getArms() {
		return arms;
	}
	public void setArms(String arms) {
		this.arms = arms;
	}
	public String getLegs() {
		return legs;
	}
	public void setLegs(String legs) {
		this.legs = legs;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getWheels() {
		return wheels;
	}
	public void setWheels(String wheels) {
		this.wheels = wheels;
	}
	public String getSensors() {
		return sensors;
	}
	public void setSensors(String sensors) {
		this.sensors = sensors;
	}
	public String getFireArms() {
		return fireArms;
	}
	public void setFireArms(String fireArms) {
		this.fireArms = fireArms;
	}
	@Override
	public String toString() {
		return "Robot [arms=" + arms + ", legs=" + legs + ", head=" + head + ", doors=" + doors + ", wheels=" + wheels
				+ ", sensors=" + sensors + ", fireArms=" + fireArms + "]";
	}
}
