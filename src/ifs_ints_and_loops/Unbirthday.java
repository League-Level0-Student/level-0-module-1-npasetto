package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("What is your birthday(mm/dd)?");
		if (birthday.equals("08/15")) {
		JOptionPane.showMessageDialog(null, "Have a happy birthday!");
		}else {
			JOptionPane.showMessageDialog(null, "Have a happy unbirthday!");
		}
	}
}
