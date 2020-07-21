package com.hiberus.multiarray;

import java.util.Random;

public class MultiArrayFloats {
    private float[][] board = new float[5][5];

    public MultiArrayFloats() {
        init();
    }

    public MultiArrayFloats(int size) {
        board = new float[size][size];
        init();
    }

    private void init() {
        // fill all board cells with random value between 0 - 100
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Random().nextFloat();
            }
        }
    }

    public void draw() {
        // iterate over board and print
        System.out.println();
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%.2f ", board[i][j]);
                //System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
