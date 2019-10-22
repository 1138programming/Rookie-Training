package frc.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.commands.Claw.ClawControl;
import frc.robot.Robot;

public class ClawSubsystem extends Subsystem {
  // Talon config
  private final TalonSRX Claw;
  private static final int KClaw = 5;

  public ClawSubsystem() {
    Claw = new TalonSRX(KClaw);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ClawControl());
  }
}