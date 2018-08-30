/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1787.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;


public class Robot extends TimedRobot {
	
	Compressor C = new Compressor(0);
	C.setClosedLoopControl(true);
	
	
	
	
	//AAAAAAAAAH
	private final int RIGHT_STICK = 1;
	public Joystick RStick = new Joystick(RIGHT_STICK);
	
	

	@Override
	public void robotInit() {

	}


	@Override
	public void autonomousInit() {

	}

	@Override
	public void autonomousPeriodic() {
	
		}


	@Override
	public void teleopPeriodic() {
		
	}

	@Override
	public void testPeriodic() {
	}
}
