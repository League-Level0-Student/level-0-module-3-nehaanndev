package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main (String [] args) {
		String choice = JOptionPane.showInputDialog("You are on a cheap ship, do you choose to eat the Fish and Chips, "
				+ "or the A6 waygu steak?");
		if(choice.equals("Fish and Chips")) {
			choice = JOptionPane.showInputDialog(null, "The ship starts sinking and you find a lifeboat and life jacket. "
					+ "You lower the boat and spot an island and people who need help."
					+ "Do you choose to paddle to an island or help others? ");
			if (choice.equals("help others")) {
				JOptionPane.showMessageDialog(null,"You help others and someone has a phone and calls the police. "
						+ "You guys get out safely.");
			} else {
				choice = JOptionPane.showInputDialog(null,"You leave the others and paddle to an island."
						+ "However you experince a storm and get stranded on the island. "
						+ "You find two bushes full with berries do you eat from them?");
				if(choice.equals("eat the berries")) {
					JOptionPane.showMessageDialog(null,"You die from the posionous berries.");
				}else {
					JOptionPane.showMessageDialog(null,"You die from stravation.");
				}
			}
		}else {
			choice=JOptionPane.showInputDialog("You get food poisionning from the food, and have to go the bathroom when the ship starts sinking."
					+ "You rush out, Do you try to find a life jacket or jump into the water?");
			if(choice.equals("find a life jacket")) {
				JOptionPane.showMessageDialog(null,"You fail to find a lifejacket. However when you look down you realize all the lifeboats left already,"
						+ " and you die.");		
			}else {
				JOptionPane.showMessageDialog(null,"You jump into the water and start shouting, a lifeboat stops and picks you up and you live. ");	
			}
		}
	}
}
