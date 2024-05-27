package org.example.pingpongsimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PingPongSimulator {

    public static void main(String[] args) {
        var context = SpringApplication.run(PingPongSimulator.class, args);
        var mainBootcamp = context.getBean(Game.class);


    }

}
