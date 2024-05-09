
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 25th";
		String dadsBirthday = "Febuary 3th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String respon = JOptionPane.showInputDialog("What birthday do you want?");

		// 3. Print out what the user typed
System.out.println(respon);
if (respon.equals("mom")) {
	System.out.println(momsBirthday);
}else if (respon.equals("dad")) {
	System.out.println(dadsBirthday);
}else if (respon.equals("neha")) {
	System.out.println(myBirthday);
}else {
	System.out.println("Sorry, i don't remember that person's birthday!");
}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
