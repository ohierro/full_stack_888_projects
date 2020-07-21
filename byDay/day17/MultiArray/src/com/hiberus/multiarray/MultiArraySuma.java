package com.hiberus.multiarray;

import java.util.Random;

public class MultiArraySuma {
    private int[][] board = new int[4][4];

    public MultiArraySuma() {
        init();
    }

    // 45 35 23 78
    // 45 35 23 78
    // 45 35 23 78
    // -----------
    // 0  0  0  0
    public void init() {
        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Random().nextInt(100);
            }
        }
        for (int i = 0; i < board.length; i++) {
            board[board.length - 1][i] = board[0][i] + board[1][i] + board[2][i];
        }
    }

    public void draw() {
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
