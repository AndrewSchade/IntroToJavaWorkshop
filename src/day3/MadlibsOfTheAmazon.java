package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's
		// how to do it...
		JOptionPane.showMessageDialog(null,
				"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String name1 = JOptionPane.showInputDialog("Please enter an adjective.");
		// Get the user to enter a type of liquid
		String name2 = JOptionPane.showInputDialog("Please enter a type of liquid.");
		// Get the user to enter a body part
		String name3 = JOptionPane.showInputDialog("Please enter a body part.");
		// Get the user to enter a verb
		String name4 = JOptionPane.showInputDialog("Please enter a verb.");
		// Get the user to enter a place
		String name5 = JOptionPane.showInputDialog("Please enter a place.");
		JOptionPane.showMessageDialog(null, "Building your story...");
		JOptionPane.showMessageDialog(null,"Building your story...");
		JOptionPane.showMessageDialog(null,"Building your story...");
		JOptionPane.showMessageDialog(null,"...");
		JOptionPane.showMessageDialog(null,"Your story is ready!");
		JOptionPane.showMessageDialog(null,"Piranhas are more " + name1 + " during the day, so cross the river at"
				+ " night. Piranhas are attracted to fresh " + name2 + " and will most"
				+ " likely take a bite out of your " + name3 + " if you " + name4 + ". Whatever"
				+ " you do, if you have an open wound, try to find another way to get" + " back to the " + name5
				+ ". Good luck!");

		// Make a pop-up for the final story. You can use \n to go to the next
		// line.

	}
}
