package org.usfirst.frc.team5114.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class sub_SixMotorDrive extends Subsystem {

	/* talons for arcade drive */
	WPI_TalonSRX m_leftFrontMotor = new WPI_TalonSRX(1); 
	WPI_TalonSRX m_leftMiddleMotor = new WPI_TalonSRX(2);
	WPI_TalonSRX m_leftRearMotor = new WPI_TalonSRX(3);
	WPI_TalonSRX m_rightFrontMotor = new WPI_TalonSRX(4);
	WPI_TalonSRX m_rightMiddleMotor = new WPI_TalonSRX(5);
	WPI_TalonSRX m_rightRearMotor = new WPI_TalonSRX(6);
	

	SpeedControllerGroup sc_left = new SpeedControllerGroup(m_leftFrontMotor, m_leftMiddleMotor, m_leftRearMotor);
	SpeedControllerGroup sc_right = new SpeedControllerGroup(m_rightFrontMotor, m_rightMiddleMotor, m_rightRearMotor);
	DifferentialDrive d_drive = new DifferentialDrive(sc_left, sc_right);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

