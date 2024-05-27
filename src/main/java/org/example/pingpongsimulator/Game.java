package org.example.pingpongsimulator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Game {
    final Player playerOne;
    final Player playerTwo;
    int scoreOne;
    int scoreTwo;
    boolean playerOneServes = true;
    ConsoleLogger logger = new ConsoleLogger();


    public Game(@Qualifier("playerOne") @Autowired Player playerOne, @Qualifier("playerTwo") @Autowired Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        playGame();
    }

    public void playGame() {
        while (scoreOne < 11 && scoreTwo < 11) {
            startNextRound();
        }
        if (scoreOne >= 11) {
            logger.winner(playerOne);
        } else {
            logger.winner(playerTwo);
        }
    }

    public void startNextRound() {
            if (new Round(playerOne, playerTwo).startRound()) {
                scoreOne++;
                logger.score(playerTwo, scoreOne, scoreTwo);
                playerOneServes = true;
            } else {
                scoreTwo++;
                logger.score(playerOne, scoreOne, scoreTwo);
                playerOneServes = false;
            }
    }
    class scoreTracker extends Thread {
        int oldScoreOne = scoreOne;
        int oldScoreTwo = scoreTwo;
        public void run() {
            if (scoreOne != oldScoreOne || scoreTwo != oldScoreTwo) {
                logger.score(playerOne, scoreOne, scoreTwo);
            }
        }
    }


}
