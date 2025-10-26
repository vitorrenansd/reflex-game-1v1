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
        int randomTime = rand.nextInt((maxTime - minTime) + 1) + minTime;
        
        return randomTime;
    }
}