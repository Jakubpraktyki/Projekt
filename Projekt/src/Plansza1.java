package Projekt;
//Jakub Czaja

public class Plansza1 {


    public static void board2(char[][]board) {

        System.out.print("\t0:\t1:\t2:\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i+":\t");
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();

        }
    }
}





