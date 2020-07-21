package com.hiberus.multiarray;

public class MultiArrayLines {
    private int[][] board = new int[8][12];

    public MultiArrayLines() {
        init();
    }

    public void init() {
        // 0 0 0 0
        // 1 1 1 1
        // ....
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = i;
            }
        }
    }

    public void draw() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
