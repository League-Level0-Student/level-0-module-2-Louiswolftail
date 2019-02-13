//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(5);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i < 5.; i++) {
			if (randomNumber == 0) {
				System.out.println("UwU");
			} else if (randomNumber == 1) {
				System.out.println("OwO");
			} else if (randomNumber == 2) {
				System.out.println(">w<");
			} else if (randomNumber == 3) {
				System.out.println("TwT");
				// 2. Repeat all the code above 10 times

				// 3. Find someone to test out your program. They will like it :)
			} else if (randomNumber == 4) {
				System.out.println("YwY");
			}

		}
	}
}
