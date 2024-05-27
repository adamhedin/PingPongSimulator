package org.example.pingpongsimulator;

import org.springframework.stereotype.Component;

@Component
public class PlayerBuilder {
    private String name;
    private int serve;
    private int foreHand;
    private int backHand;
    private int smash;
    private PreferredHand hand;

    public PlayerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder setServe(int serve) {
        this.serve = serve;
        return this;
    }

    public PlayerBuilder setForeHand(int foreHand) {
        this.foreHand = foreHand;
        return this;
    }

    public PlayerBuilder setBackHand(int backHand) {
        this.backHand = backHand;
        return this;
    }

    public PlayerBuilder setSmash(int smash) {
        this.smash = smash;
        return this;
    }

    public PlayerBuilder setHand(PreferredHand hand) {
        this.hand = hand;
        return this;
    }
    public Player build() {
        return new Player(name, serve, foreHand, backHand, smash, hand);
    }
}
