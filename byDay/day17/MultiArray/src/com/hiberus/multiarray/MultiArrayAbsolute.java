package com.hiberus.multiarray;

public class MultiArrayAbsolute {
    private int[][] board = new int[3][3];

    public MultiArrayAbsolute() {
        init();
    }

    public void init() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = i * board.length + j;
            }
        }
    }

    public void draw() {
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
