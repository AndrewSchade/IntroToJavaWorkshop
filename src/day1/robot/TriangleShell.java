package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot andrew = new Robot();

	void go() {
		andrew.penDown();

		// 6. Make the robot go as fast as possible
andrew.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
int length = 50;
		// 7. Do the following (up to step 10) 60 times
while(length<650){
			// 9. Change the color of the pen to a random color
	andrew.setRandomPenColor();
length = length + 10;
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(length);
	andrew.turn(6);
    
	}

	}

	/*
	 * 2. fill in the method below to draw a triangle. Use the length variable
	 * for the size of the triangle.
	 */
	private void drawTriangle(int length) {
		andrew.move(length);
		andrew.turn(120);
		andrew.move(length);
		andrew.turn(120);
		andrew.move(length);
		andrew.turn(120);
	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
