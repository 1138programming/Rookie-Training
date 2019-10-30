package frc.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.commands.Drive.DriveWithJoysticks;

public class DriveSubsystem extends Subsystem {
  private final TalonSRX driveLeft, driveRight; 
  public static final int KDriveLeftTalon = 0;
  public static final int KDriveRightTalon = 1;  

  public DriveSubsystem()
  {
    driveLeft = new TalonSRX(KDriveLeftTalon);
    driveRight = new TalonSRX(KDriveRightTalon);
  }

  @Override
  public void initDefaultCommand() {
   setDefaultCommand(new DriveWithJoysticks());
  }

  public void move(double LeftSpeed, double RightSpeed) {
    driveLeft.set(ControlMode.PercentOutput, LeftSpeed);
    driveRight.set(ControlMode.PercentOutput, RightSpeed);
  }
}