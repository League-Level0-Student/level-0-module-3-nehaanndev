package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Are you Happy?");
		if (userInput.equals("yes")){
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}else {
			userInput = JOptionPane.showInputDialog("Do you want to be Happy?");
		if(userInput.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}	
	}

}
