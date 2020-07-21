package com.hiberus.tictactoe;

public class Main {

    public static void main(String[] args) {
	    TicTacToe game = new TicTacToe();

	    game.draw();

	    // UI
        // x e y
        // game.move()

	    game.move(1,0); // 0
        game.move(0,1); // x
        game.move(2,2); // 0

        // 0 X -
        // - - -
        // - - 0
        game.move(0,2); // x
        game.move(1,1);
        game.move(0, 0);
    }
}
