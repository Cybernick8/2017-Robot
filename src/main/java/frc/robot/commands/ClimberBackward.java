package frc.robot.commands;
import static frc.robot.Robot.kClimber;
import edu.wpi.first.wpilibj.command.Command;


public class ClimberBackward extends Command{
    public ClimberBackward() {
    }

    protected void initialize() {

    }
    protected void execute() {
        kClimber.setClimber(-1.0);
    }

    protected boolean isFinished() {
        return true;
    }
    protected void end() {

    };
    protected void interrupted() {

    }
}