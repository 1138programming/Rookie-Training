package frc.commands.Claw;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ClawControl extends Command {
	boolean forward;
	public ClawControl(boolean forward) {
		requires(Robot.CLAW_SUBSYSTEM);
		this.forward = forward;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		if(forward){
			Robot.CLAW_SUBSYSTEM.ClawMove(1);
		}
		else{
			Robot.CLAW_SUBSYSTEM.ClawMove(0);
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
