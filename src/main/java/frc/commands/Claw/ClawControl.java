package frc.commands.Claw;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ClawControl extends Command {
	public ClawControl() {
		requires(Robot.CLAW_SUBSYSTEM);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
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
