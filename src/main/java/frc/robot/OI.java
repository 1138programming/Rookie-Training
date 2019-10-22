//@TODO Figure out XBox triggers, get Sparks MAX working, make Pneumatics and Camera subsystems, vision integration into 
//the hatches, the hatch commands themselves (with x_table), and all of the encoder-based stuff for the arm and lift positions 
//(and maybe climb but that's lower priority)

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class OI {
  //Controller Constants 
  private static final int KLogitechDrive = 0;
  private static final int KXboxArms = 1;
  private static final int KStick = 2;

  //DeadZone 
  private static final double KDeadZone = 0.2; 

  //Logitech Button Constants 
  private static final int KButton1 = 1;
	private static final int KButton2 = 2;
	private static final int KButton3 = 3;
	private static final int KButton4 = 4;
	private static final int KButton5 = 5;
	private static final int KButton6 = 6;
	private static final int KButton7 = 7;
  private static final int KButton8 = 8;
  private static final int KButton9 = 9;
  private static final int KButton10 = 10;
  private static final int KLeftYAxis = 5;
  private static final int KRightYAxis = 1;

  //Xbox Button Constants 
  private static final int KButtonA = 1;
	private static final int KButtonB = 2;
	private static final int KButtonX = 3;
	private static final int KButtonY = 4;
	private static final int KLeftBumper = 5;
  private static final int KRightBumper = 6;
  private static final int KSwitchButton = 7;
	private static final int KStartButton = 8;
	private static final int KLeftTrigger = 9;
  private static final int KRightTrigger = 10;

  //Stick Button Constants
  private static final int KBtn2Stick = 2;
  private static final int KBtn3Stick = 3;
  private static final int KBtn4Stick = 4;
  private static final int KBtn5Stick = 5;
  private static final int KBtn6Stick = 6;
  private static final int KBtn9Stick = 9;

  public static Joystick logitech, stick;
  public static XboxController xbox;
	public static JoystickButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10; // Logitech Button
  public static JoystickButton btnA, btnB, btnX, btnY, btnLB, btnRB, btnSwtch, btnStrt, btnLT, btnRT; // Xbox Buttons
  public static JoystickButton btn2Stick, btn3Stick, btn4Stick, btn5Stick, btn6Stick, btn9Stick; // Stick Buttons

  public OI() {
    //Controllers 
    logitech = new Joystick(KLogitechDrive);
    xbox = new XboxController(KXboxArms);
    stick = new Joystick(KStick);
  }

  public double getRightAxis() {
    double Y = logitech.getRawAxis(KLeftYAxis);
    if (Y > KDeadZone || Y < -KDeadZone)
      return Y;
    else
      return 0;
  }

  public double getArcadeRightAxis() {
    if(logitech.getTwist() > KDeadZone || logitech.getTwist() < -KDeadZone)
      return logitech.getTwist();
    else
      return 0;
  }

  public double getLeftAxis() {
    double Y = logitech.getRawAxis(KRightYAxis);
    SmartDashboard.putNumber("Here's a left thingy!", Y);
    if(Y > KDeadZone || Y < -KDeadZone)
      return Y;
    else 
      return 0; 
  }

  public double getRightXbox() {
    if(xbox.getY(Hand.kRight) > KDeadZone || xbox.getY(Hand.kRight) < -KDeadZone) 
      return xbox.getY(Hand.kRight);
    else 
      return 0;
  }

  public double getLeftXbox() {
    if(xbox.getY(Hand.kLeft) > KDeadZone || xbox.getY(Hand.kLeft) < -KDeadZone) 
      return -xbox.getY(Hand.kLeft);
    else 
      return 0;
  }
}