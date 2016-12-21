package day3;

import javax.swing.JOptionPane;

public class Compliments {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, name+", wow great name!");
	JOptionPane.showMessageDialog(null, name+"... is that Sweedish.");
	JOptionPane.showMessageDialog(null, "Oh its not...");
	JOptionPane.showMessageDialog(null, "Sorry.");
	JOptionPane.showMessageDialog(null, "Alright "+name+" see you later!");
}
}
