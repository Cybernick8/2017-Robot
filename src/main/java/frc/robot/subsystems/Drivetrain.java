package  frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem{
    private TalonSRX mLeftA = new TalonSRX(2);
    private TalonSRX mLeftB = new TalonSRX(12);
    private TalonSRX mRightA = new TalonSRX(3);
    private TalonSRX mRightB = new TalonSRX(15);


    public Drivetrain (){
        mLeftB.follow(mLeftA);
        mRightB.follow(mRightA);
        mLeftA.setInverted(true);
        mLeftB.setInverted(true);
    }

    public void initDefaultCommand(){

    }
    public void SetMotorPower(double left, double right){
        mLeftA.set(ControlMode.PercentOutput, left); 
        mRightA.set(ControlMode.PercentOutput, right); 
    }
}