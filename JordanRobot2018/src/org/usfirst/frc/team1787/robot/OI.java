package org.usfirst.frc.team1787.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.command.*;
import edu.wpi.first.wpilibj.AnalogInput;

public class OI {
	
	//Joystick Setup
	Joystick RStick = new Joystick(1);
	Button button1 = new JoystickButton(RStick,1);
	Button button2 = new JoystickButton(RStick,2);
	Button button3 = new JoystickButton(RStick,3);
	Button button4 = new JoystickButton(RStick,4);
	Button button5 = new JoystickButton(RStick,5);
	Button button6 = new JoystickButton(RStick,6);
	Button button7 = new JoystickButton(RStick,7);
	
	double value;
	value = RStick.getThrottle();
	
}
