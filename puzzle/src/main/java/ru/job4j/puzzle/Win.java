package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int diagIndx = 0; diagIndx < board.length; diagIndx++) {
            if (board[diagIndx][diagIndx] == 1) {
                rsl = checkColumn(board, diagIndx) || checkRow(board, diagIndx);
                if (rsl) {
                    break;
                }
            }
        }
        return rsl;
    }

    private static boolean checkColumn(int[][] array, int column) {
        boolean rsl = true;
        for (int j = 0; j < array.length; j++) {
            if (array[column][j] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    private static boolean checkRow(int[][] array, int row) {
        boolean rsl = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i][row] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
