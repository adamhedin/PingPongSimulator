package org.example.pingpongsimulator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    @Qualifier("playerOne")
    public Player playerOne() {
        return new PlayerBuilder()
                .setName("Player One")
                .setServe(3)
                .setForeHand(2)
                .setBackHand(3)
                .setSmash(3)
                .setHand(PreferredHand.RIGHT)
                .build();
    }
    @Bean
    @Qualifier("playerTwo")
    public Player playertwo() {
        return new PlayerBuilder()
                .setName("Player two")
                .setServe(3)
                .setForeHand(3)
                .setBackHand(3)
                .setSmash(3)
                .setHand(PreferredHand.RIGHT)
                .build();
    }
}
