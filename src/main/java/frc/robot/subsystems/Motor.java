// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
  /** Creates a new Motor. */
  private SparkMax sparkMax;
  public Motor() {
    sparkMax = new SparkMax(2, MotorType.kBrushless);

   

    }
    public void setSpeed(double speed){
      sparkMax.set(speed);
    }
    public double getEncoderPosition(){
      return sparkMax.getEncoder().getPosition();
    }
    public void resetEncoder(){
      sparkMax.getEncoder().setPosition(0); 
    }
    
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("EncoderPose", getEncoderPosition());
  }
}

