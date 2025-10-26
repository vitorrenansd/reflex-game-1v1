package org.reflex;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Game g = new Game();
		
		try (Scanner scan = new Scanner(System.in)) {
			g.startGame();
			scan.nextLine(); // Simulate user click
			float reaction = g.registerClick();

			if (reaction > 0) {
				System.out.printf("Your reaction time: %.3f seconds%n", reaction);
			}
		}
	}
}