package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("Brothers and sisters I have none, but this man's father is my father's son. Who is the man?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equalsIgnoreCase("Your son.")) {
	JOptionPane.showMessageDialog(null, "You are correct!");
	score++;
		// 5. Otherwise, say "wrong" and tell them the answer
}else {
	JOptionPane.showMessageDialog(null, "You are wrong. The correct answer is Your son.");
}

		// 6. Add some more riddles
answer = JOptionPane.showInputDialog(null, "I am tall when I am young, and I am short when I am old.What am I?");
if (answer.equalsIgnoreCase("A candle.")) {
	JOptionPane.showMessageDialog(null, "You are correct.");
	score++;
}else {
	JOptionPane.showMessageDialog(null, "You are wrong. The correct answer is A candle.");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is "+score);
	}
}

