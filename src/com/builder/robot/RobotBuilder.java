package com.builder.robot;

public interface RobotBuilder {
	void initBot();
	void assembleArms();
	void assembleLegs();
	void assembleHead();
	void assembleFireArms();
	void assembleSensors();
	
	void assembleDoors();
	void assembleWheels();
	
	Robot build();
}
