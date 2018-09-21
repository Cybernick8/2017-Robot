package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Constants;


public class Climber extends Subsystem {
        private TalonSRX mLeftClimber, mRightClimber;
        public Climber() {
    
            mLeftClimber = new TalonSRX(Constants.kLeftClimber);
            mRightClimber = new TalonSRX(Constants.kRightClimber);
            mLeftClimber.setInverted(true);
            mLeftClimber.follow(mRightClimber);
        }


public void initDefaultCommand() {

}
public void setClimber(double power) {
    mLeftClimber.set(ControlMode.PercentOutput,power);
}

}
