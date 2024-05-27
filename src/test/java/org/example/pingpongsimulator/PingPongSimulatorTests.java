package org.example.pingpongsimulator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PingPongSimulatorTests {

    @Test
    void contextLoads() {
        Player playerOne = new PlayerBuilder()
                .setName("Player One")
                .setServe(3)
                .setForeHand(2)
                .setBackHand(3)
                .setSmash(3)
                .setHand(PreferredHand.RIGHT)
                .build();

        Player playerTwo = new PlayerBuilder()
                .setName("PLayer two")
                .setServe(3)
                .setForeHand(3)
                .setBackHand(3)
                .setSmash(3)
                .setHand(PreferredHand.RIGHT)
                .build();

        new Game(playerOne, playerTwo).playGame();
    }

}
