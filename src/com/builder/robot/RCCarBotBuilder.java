package com.builder.robot;

public class RCCarBotBuilder implements RobotBuilder {

	private Robot robot;
	
	public RCCarBotBuilder() {}
	
	@Override
	public void initBot() {
		this.robot = new Robot();
	}

	@Override
	public void assembleArms() {
		this.robot.setArms("No Arms for rc bot required");
	}

	@Override
	public void assembleLegs() {
		this.robot.setLegs("No Legs for rc bot required");
	}

	@Override
	public void assembleHead() {
		this.robot.setHead("No Head for rc bot required");
	}

	@Override
	public void assembleFireArms() {
		this.robot.setFireArms("No FireArms for rc bot required");
	}

	@Override
	public void assembleSensors() {
		this.robot.setSensors("Setting sensors");
	}

	@Override
	public void assembleDoors() {
		this.robot.setDoors("setting doors");
	}
	
	@Override
	public void assembleWheels() {
		this.robot.setWheels("Setting Wheels");
		
	}

	@Override
	public Robot build() {
		return this.robot;
	}
}
