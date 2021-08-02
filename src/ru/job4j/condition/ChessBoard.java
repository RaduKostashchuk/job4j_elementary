package ru.job4j.condition;

public class ChessBoard {
    public static boolean checkCoord(int x1, int y1, int x2, int y2) {
        boolean isPositive = (x1 >= 0) && (y1 >= 0) && (x2 >= 0) && (y2 >= 0);
        boolean isNotGreater7 = (x1 < 8) && (y1 < 8) && (x2 < 8) && (y2 < 8);
        return isPositive && isNotGreater7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        if (!ChessBoard.checkCoord(x1, y1, x2, y2)) {
            return 0;
        }
        int deltaX = Math.abs(x2 - x1);
        int deltaY = Math.abs(y2 - y1);
        return  deltaX == deltaY ? deltaX : 0;
    }
}
