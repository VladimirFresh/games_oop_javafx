package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (monoHorizontal(board, i) || monoVertical(board, i))) {
                rsl = true;
                break;
            }
        }
            return rsl;
        }

        public static boolean monoHorizontal(int[][] board, int cell) {
            boolean result1 = true;
            for (int i = 0; i < board.length; i++) {
                if (board[cell][i] != 1) {
                    result1 = false;
                    break;
                }
            }
            return result1;
        }

        public static boolean monoVertical(int[][] board, int row) {
            boolean result2 = true;
            for (int i = 0; i < board.length; i++) {
                if (board[i][row] != 1) {
                    result2 = false;
                    break;
                }
            }
            return result2;
        }

    }
