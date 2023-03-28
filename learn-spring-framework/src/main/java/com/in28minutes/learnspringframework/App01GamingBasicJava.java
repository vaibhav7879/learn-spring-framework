package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var game = new PacmanGame(); //1: object creation
//        var game = new SuperContraGame();
//        var game=new Mariogame();
        var gameRunner=new GameRunner(game);
        //2: object creation + wiring of dependencies
        // Game is a Dependency of GameRunner or we can say that GameRunner is dependent on Game

        gameRunner.run();
    }
}
