package com.builder.robot;

public class ClientApp {
	public static void main(String[] args) {
		
		RobotBuilder robotBuilder = new HumanoidRobot();
		robotBuilder.initBot();
		robotBuilder.assembleArms();
		robotBuilder.assembleLegs();
		robotBuilder.assembleHead();
		Robot sofia = robotBuilder.build();
		
		robotBuilder = new RCCarBotBuilder();
		robotBuilder.initBot();
		robotBuilder.assembleDoors();
		robotBuilder.assembleWheels();
		robotBuilder.assembleSensors();
		robotBuilder.assembleHead();
		Robot bmwClassRobot = robotBuilder.build();
		
		
		System.out.println("Sofia : "+sofia.toString());
		System.out.println("\nBMWClassRobot : "+bmwClassRobot.toString());
	}
}
