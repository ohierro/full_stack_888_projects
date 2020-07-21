package com.hiberus.tictactoe;

public class TicTacToe {
    private boolean xTurn = false;
    private char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        init();
    }

    public TicTacToe(int size) {
        board = new char[size][size];
        init();
    }

    private void init() {
        // fill all board cells with '-'
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void draw() {
        // iterate over board and print
        System.out.println();
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void drawPosition(int x, int y) {
        // check board[x][y] position with
        // X if xTurn
        // 0 else
        if (xTurn) {
            board[x][y] = 'X';
        } else {
            board[x][y] = '0';
        }
    }

    // - - -
    // - - -
    // - - -
    private boolean checkWin(char who) {
        if (board[0][0] == who &&
                board[0][1] == who &&
                board[0][2] == who) {
            return true;
        }
        if (board[1][0] == who &&
                board[1][1] == who &&
                board[1][2] == who) {
            return true;
        }
        if (board[2][0] == who &&
                board[2][1] == who &&
                board[2][2] == who) {
            return true;
        }
        if (board[0][0] == who &&
                board[1][0] == who &&
                board[2][0] == who) {
            return true;
        }
        if (board[0][1] == who &&
                board[1][1] == who &&
                board[2][1] == who) {
            return true;
        }
        if (board[0][2] == who &&
                board[1][2] == who &&
                board[2][2] == who) {
            return true;
        }
        if (board[0][0] == who &&
                board[1][1] == who &&
                board[2][2] == who) {
            return true;
        }
        if (board[0][2] == who &&
                board[1][1] == who &&
                board[2][0] == who) {
            return true;
        }

        return false;
    }

    public void move(int x, int y) {
        drawPosition(x, y);
        draw();

        boolean winX = checkWin('X');
        boolean win0 = checkWin('0');

        if (winX) {
            System.out.println("Han ganado las X");
        }
        if (win0) {
            System.out.println("Han ganado los 0");
        }
        xTurn = !xTurn;

        // check if allowed
        // drawPosition(x,y)
        // draw()
        // checkWin()
    }

    public boolean isxTurn() {
        return this.xTurn;
    }
}
