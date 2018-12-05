//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int randomChoice =0;
	Random Rover = new Random();
	randomChoice=Rover.nextInt();
	randomChoice=Rover.nextInt((2 - 0)+1)-1;
	
	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Ask a Question");
	// 5. If the random number is 0
if (randomChoice == 0) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "\\__  |   |\\_   _____//   _____/| |\n" + 
		" /   |   | |    __)_ \\_____  \\ | |\n" + 
		" \\____   | |        \\/        \\ \\|\n" + 
		" / ______|/_______  /_______  / __\n" + 
		" \\/               \\/        \\/  \\/");}

	// 6. If the random number is 1
else if (randomChoice == 1) {
	// -- tell the user "No"
JOptionPane.showMessageDialog(null, "░░░░░▄▄▀▀▀▀▀▀▀▀▀▄▄░░░░░\n" + 
		"░░░░█░░░░░░░░░░░░░█░░░░\n" + 
		"░░░█░░░░░░░░░░▄▄▄░░█░░░\n" + 
		"░░░█░░▄▄▄░░▄░░███░░█░░░\n" + 
		"░░░▄█░▄░░░▀▀▀░░░▄░█▄░░░\n" + 
		"░░░█░░▀█▀█▀█▀█▀█▀░░█░░░\n" + 
		"░░░▄██▄▄▀▀▀▀▀▀▀▄▄██▄░░░\n" + 
		"░▄█░█▀▀█▀▀▀█▀▀▀█▀▀█░█▄░ NO!"); }
	// 7. If the random number is 2
else if (randomChoice == 2) {
	// -- tell the user "Maybe you should ask Google?"
JOptionPane.showMessageDialog(null, "¯\\_(ツ)_/¯ Who Knows"); }
	// 8. If the random number is 3

	// -- write your own answer

}}
