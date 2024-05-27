package org.example.pingpongsimulator;

import org.springframework.stereotype.Component;

@Component
public class ConsoleLogger {
    private final String lineBreaker = "\n ------------------------------------------------------------ \n";
    private final String graphics = """
                O            ______________________            O
               /|\\          |          |           |          /|\\
               / \\          |__________|___________|          / \\""";

    public void start(Player playerOne, Player playerTwo) {

    }

    public void log(Player player, String type, int hit) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(lineBreaker +  player.getName() + " hits a " + type + " with a power of " + hit);
    }

   public void serve(Player playerOne) {
       System.out.println(graphics);
       System.out.println(lineBreaker + playerOne.getName() + " with the serve! ");
   }

    public void winner(Player player) {
        System.out.println(lineBreaker +  player.getName() + " won the game!");
    }

    public void score(Player player, int one, int two) {
        System.out.println(lineBreaker + graphics + lineBreaker +  player.getName() + " MISSES THE BALL!");
        System.out.println("Current score: " + one + " - " + two);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
