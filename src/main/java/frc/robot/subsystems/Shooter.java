package frc.robot.subsystems;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
    private TalonSRX mLeftShooter, mRightShooter;
    public Shooter() {
        mLeftShooter = new TalonSRX(Constants.kLeftShooter = 0);
        mRightShooter = new TalonSRX(Constants.kRightShooter = 0);
    }
    public void initDefaultCommand() {

    }
    public void setLeftTalon(double leftTalonSpeed) {
        mLeftShooter.set(ControlMode.PercentOutput, leftTalonSpeed);
    }
    public void setRightTalon(double rightTalonSpeed) {
        mRightShooter.set(ControlMode.PercentOutput, rightTalonSpeed);
    }
}