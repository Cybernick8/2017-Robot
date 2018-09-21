package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Button;
import frc.robot.commands.ClimberBackward;
import frc.robot.commands.ClimberForward;
import frc.robot.commands.SetShooterSpeed;


public class OI {
    private Joystick stick;
    public JoystickButton shooterButton = new JoystickButton(stick, Constants.kShooterButton);
    public JoystickButton climberForwardsButton = new JoystickButton(stick, Constants.kLeftClimber);
    public JoystickButton climberBackwardsButton = new JoystickButton(stick,Constants.kRightClimber);
    public OI() {
        climberForwardsButton.whenPressed(new ClimberForward());
        climberBackwardsButton.whenPressed(new ClimberBackward());
        shooterButton.whenPressed(new SetShooterSpeed(1, 1));
        stick = new Joystick(Constants.kJoystickPort);
    }
    public double getLeftXAxis() {
        return stick.getRawAxis(Constants.kJoystickLeftX);
    }

    public double getLeftYAxis() {
        return stick.getRawAxis(Constants.kJoystickLeftY);
    }

    public double getRightXAxis() {
        return stick.getRawAxis(Constants.kJoystickRightX);
    }

    public double getRightYAxis() {
        return stick.getRawAxis(Constants.kJoystickRightY);


    }
    


}