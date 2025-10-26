package org.reflex;

import java.util.Random;

public class Game {
    private int MIN_TIME = 1;
    private int MAX_TIME = 5;
    private long startTime;
    private boolean canClick = false;

    // Delay to show green image
    public int getRandomDelay() {
        Random rand = new Random();
        int randomTime = rand.nextInt((MAX_TIME - MIN_TIME) + 1) + MIN_TIME;
        
        return randomTime;
    }

    // Start game logic
    public void startGame() throws InterruptedException {
        System.out.println("Wait... (red)");
        int delay = getRandomDelay();

        Thread.sleep(delay * 1000);
        canClick = true;
        startTime = System.nanoTime();
        System.out.println("GREEN! Click now (Press Enter)");
    }

    // Returns user click delay
    public float registerClick() {
        if (!canClick) {
            System.out.println("Too early!");
            return -1;
        }
        long endTime = System.nanoTime();
        canClick = false;
        return (endTime - startTime) / 1_000_000_000f;
    }
}