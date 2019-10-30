package frc.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.commands.Arm.ArmControl;
import frc.robot.Robot;

public class ArmSubsystem extends Subsystem {
  // Talon config
  private final TalonSRX Arm;
  private static final int KArm = 4;

  public ArmSubsystem() {
    // Initialize talons
    Arm = new TalonSRX(KArm);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ArmControl());
  }
  public void moveArm(double ArmSpeed) {
    Arm.set(ControlMode.PercentOutput, ArmSpeed);
  }
}