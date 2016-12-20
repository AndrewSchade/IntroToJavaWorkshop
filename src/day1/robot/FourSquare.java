package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot andrew = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
andrew.setSpeed(10);
		// 5. Set the pen width to 5
andrew.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for(int x=0; x<4; x=x+1){
			// 7. Set the pen color to random
	andrew.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare(); 
			// 8. Turn the robot 90 degrees to the right
andrew.turn(90);
}
	}
	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		andrew.penDown();
andrew.move(100);
andrew.turn(90);
andrew.move(100);
andrew.turn(90);
andrew.move(100);
andrew.turn(90);
andrew.move(100);
andrew.turn(90);

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
