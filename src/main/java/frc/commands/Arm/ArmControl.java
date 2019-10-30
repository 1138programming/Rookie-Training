package frc.commands.Arm;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ArmControl extends Command {
	private boolean forward;

	public ArmControl(boolean forward) {
		requires(Robot.ARM_SUBSYSTEM);

		this.forward = forward;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		if (forward) {
			Robot.ARM_SUBSYSTEM.moveArm(1);
		} else {
			Robot.ARM_SUBSYSTEM.moveArm(-1);
		}
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
