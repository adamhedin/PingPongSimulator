package org.example.pingpongsimulator;

public enum PreferredHand {
    LEFT("Left"),
    RIGHT("Right");
    private String hand;

    PreferredHand(String hand) {
        this.hand = hand;
    }

    public String getHand() {
        return hand;
    }
}
