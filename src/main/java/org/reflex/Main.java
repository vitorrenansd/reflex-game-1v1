package org.reflex;

public class Main {
	public static void main(String[] args) {
		Game g = new Game();

		g.setMinTime(1);
		g.setMaxTime(5);
		
		g.testReactionTime();
	}
}