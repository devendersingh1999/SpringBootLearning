
package com.example.demo.game;

/**
 * Executes any game that implements the GamingConsole interface.
 */
public class GameRunner {

    private final GamingConsole game;

    // Constructor injection — allows for loose coupling with any game
 // inject dependency whatever game we are playing it will call that game
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game.getClass().getSimpleName());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
