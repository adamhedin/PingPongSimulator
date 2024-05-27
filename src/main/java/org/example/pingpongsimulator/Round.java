package org.example.pingpongsimulator;

public class Round {
    Player playerOne;
    Player playerTwo;
    private boolean playerOneWins;

    public Round(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public boolean startRound() {
        int two = playerTwo.serve();
        return start();
    }

    public boolean start() {
        if (playerOne.hit() + 10 < playerTwo.hit()) {
            return false;

        } else if (playerOne.hit() > 10 + playerTwo.hit()) {
            return true;
        }
        return start();
    }

}
