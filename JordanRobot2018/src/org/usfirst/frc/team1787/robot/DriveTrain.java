package org.usfirst.frc.team1787.robot;

import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class DriveTrain {
	
	private final int RIGHT_DRIVE_MASTER_TALON_ID = 9;
	private final int RIGHT_DRIVE_FOLLOWER_VICTOR_ID = 8;
	private final int LEFT_DRIVE_MASTER_TALON_ID = 10;
	private final int LEFT_DRIVE_FOLLOWER_VICTOR_ID = 11;
	
	private WPI_TalonSRX rightMaster = new WPI_TalonSRX(RIGHT_DRIVE_MASTER_TALON_ID);
	private WPI_VictorSPX rightFollower = new WPI_VictorSPX(RIGHT_DRIVE_FOLLOWER_VICTOR_ID);
	private WPI_TalonSRX leftMaster = new WPI_TalonSRX(LEFT_DRIVE_MASTER_TALON_ID);
	private WPI_VictorSPX leftFollower = new WPI_VictorSPX(LEFT_DRIVE_FOLLOWER_VICTOR_ID);
	
	//This might end up being gear shifting if I do it right
	DoubleSolenoid GearShift = new DoubleSolenoid(1,2);
	
	
	
}
