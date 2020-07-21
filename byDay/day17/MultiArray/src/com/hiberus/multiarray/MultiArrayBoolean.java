package com.hiberus.multiarray;

public class MultiArrayBoolean {
    private boolean[][] board;

    public MultiArrayBoolean() {
        board = new boolean[9][9];
        init();
    }

    private void init() {
        int medio = board.length / 2;
        board[medio][medio] = true;
    }

    public void draw() {
        // iterate over board and print
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
