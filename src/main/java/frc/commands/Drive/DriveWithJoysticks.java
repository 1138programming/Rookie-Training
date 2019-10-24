package frc.commands.Drive;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.subsystems.PDP;

public class DriveWithJoysticks extends Command {
  public DriveWithJoysticks() {
    requires(Robot.DRIVE_SUBSYSTEM);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    double leftSpeed = Robot.oi.getLeftAxis();
    double rightSpeed = Robot.oi.getRightAxis();
    Robot.DRIVE_SUBSYSTEM.move(rightSpeed, leftSpeed);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
