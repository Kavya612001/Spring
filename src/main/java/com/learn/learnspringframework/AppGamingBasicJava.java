package com.learn.learnspringframework;

import com.learn.learnspringframework.game.GameRunner;
import com.learn.learnspringframework.game.MarioGame;
import com.learn.learnspringframework.game.PacManGame;
import com.learn.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        MarioGame marioGame = new MarioGame();
        SuperContraGame superContraGame = new SuperContraGame();
        PacManGame pacManGame = new PacManGame(); // object creation
        // GameRunner gameRunner = new GameRunner(marioGame);
        // GameRunner gameRunner = new GameRunner(superContraGame);
        GameRunner gameRunner = new GameRunner(pacManGame); // object creation + object wiring
        // Game is a dependency for GameRunner
        gameRunner.run();
    }
}
