package org.example.pingpongsimulator;

import org.springframework.stereotype.Component;

@Component
public class setUp {
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
}
