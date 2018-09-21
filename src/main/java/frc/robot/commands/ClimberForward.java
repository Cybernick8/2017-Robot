package frc.robot.commands;
import static frc.robot.Robot.kClimber;
import edu.wpi.first.wpilibj.command.Command;


public class ClimberForward extends Command{
    public ClimberForward() {
    }

    protected void initialize() {

    }
    protected void execute() {
        kClimber.setClimber(1.0);
    }

    protected boolean isFinished() {
        return true;
    }
    protected void end() {

    };
    protected void interrupted() {

    }
}