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


public class Robot extends TimedRobot {

	@Override
	public void robotInit() {
		Compressor c = new Compressor(0); 
		c.setClosedLoopControl(true);

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
