package org.usfirst.frc.team1787.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.command.*;

public class OI {
	
	Joystick rightJoy = new Joystick(1);
	Button button1 = new JoystickButton(rightJoy, 1);
	Button button2 = new JoystickButton(rightJoy, 2);
}
