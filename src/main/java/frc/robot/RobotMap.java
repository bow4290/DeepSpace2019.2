/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  
  public static DifferentialDrive driveTrainBase;

  private static SpeedController driveTrainMotorRightFront; 
  private static SpeedController driveTrainMotorRightBack;
  private static SpeedControllerGroup driveTrainRight;

  private static SpeedController driveTrainMotorLeftFront;
  private static SpeedController driveTrainMotorLeftBack;
  private static SpeedControllerGroup driveTrainLeft;

  public static void init(){
    driveTrainMotorRightFront = new Spark(0);
    driveTrainMotorRightBack = new Spark(1);
    driveTrainRight = new SpeedControllerGroup(driveTrainMotorRightFront, driveTrainMotorRightBack);

    driveTrainMotorLeftFront = new Spark(2);
    driveTrainMotorLeftBack = new Spark(3);
    driveTrainLeft = new SpeedControllerGroup(driveTrainMotorLeftFront, driveTrainMotorLeftBack);

    driveTrainBase = new DifferentialDrive(driveTrainLeft, driveTrainRight);

  }
}
