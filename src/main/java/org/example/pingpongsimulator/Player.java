package org.example.pingpongsimulator;

import java.util.Random;

public class Player {
    private final String name;
    private final int serve;
    private final int foreHand;
    private final int backHand;
    private final int smash;
    private final PreferredHand hand;
    ConsoleLogger logger = new ConsoleLogger();
    Random random = new Random();


    public Player(String name, int serve, int foreHand, int backHand, int smash, PreferredHand hand) {
        this.name = name;
        this.serve = serve;
        this.foreHand = foreHand;
        this.backHand = backHand;
        this.smash = smash;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public int getServe() {
        return serve;
    }

    public int getForeHand() {
        return foreHand;
    }

    public int getBackHand() {
        return backHand;
    }

    public int getSmash() {
        return smash;
    }

    public int serve() {
        int hit = random.nextInt(10) * serve + 10;
        logger.serve(this);
        return hit;
    }

    public int hit() {
        double hit = Math.random();
        return hit > 0.9 || hit < 0.1 ? smash() : hit < 0.5 ? backHand() : foreHand();
    }

    private int smash() {
        int hit = random.nextInt(10) * smash + 10;
        logger.log(this, "SMASH!", hit);
        return hit;
    }

    private int foreHand() {
        int hit = random.nextInt(10) * foreHand;
        logger.log(this, "Fore Hand", hit);
        return hit;
    }

    private int backHand() {
        int hit = random.nextInt(10) * backHand;
        logger.log(this, "Back Hand", hit);
        return hit;
    }
}
