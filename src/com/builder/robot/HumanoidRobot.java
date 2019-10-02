package com.builder.robot;

public class HumanoidRobot implements RobotBuilder {
private Robot robot;
	
	public HumanoidRobot() {}
	
	@Override
	public void initBot() {
		this.robot = new Robot();
	}

	@Override
	public void assembleArms() {
		this.robot.setArms("Setting Arms");
	}

	@Override
	public void assembleLegs() {
		this.robot.setLegs("Setting Legs");
	}

	@Override
	public void assembleHead() {
		this.robot.setHead("Setting Head");
	}

	@Override
	public void assembleFireArms() {
		this.robot.setFireArms("Setting FireArms");
	}

	@Override
	public void assembleSensors() {
		this.robot.setSensors("Setting sensors");
	}

	@Override
	public void assembleDoors() {
		this.robot.setDoors("Humanoid - No doors required");
	}
	
	@Override
	public void assembleWheels() {
		this.robot.setDoors("Humanoid - No wheels required");
		
	}

	@Override
	public Robot build() {
		return this.robot;
	}

}
