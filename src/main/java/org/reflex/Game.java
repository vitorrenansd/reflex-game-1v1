package org.reflex;

import java.util.Random;

public class Game {
    private int minTime;
    private int maxTime;


    public int getMinTime() {
        return this.minTime;
    }
    public void setMinTime(int minTime) {
        this.minTime = minTime;
    }
    public int getMaxTime() {
        return this.maxTime;
    }
    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

    public int testReactionTime() {
        Random rand = new Random();
        int randomTime = rand.nextInt((maxTime - minTime) + 1) + minTime;
        
        return randomTime;
    }
}