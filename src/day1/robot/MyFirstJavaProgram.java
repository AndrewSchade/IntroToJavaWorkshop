package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot andrew = new Robot();

   andrew.penDown();
   int x = 0;
   andrew.setSpeed(10);
   while(x<4){
	   andrew.move(200);
	   andrew.turn(90);
	   x=x+1;
   }
   
   
   
   
	}
}
