package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {
	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		int x=0;
		 String words =	JOptionPane.showInputDialog("Please create a sentence.");
		while(x<2){
	// 2. ask the user for a sentence
 
	// 3. call the speak method below and send it the sentence
	speak(words);
	// 4. repeat steps 2 and 3 a lot of times
	x++;

	}
		}

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
