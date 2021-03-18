package Projekt;
//Norbert Harasim


public class Plansza {
    public static void printTablica(char[][] tablica) {        //Funkcja która obramowuje moją pustą tablicę
        System.out.println(tablica[0][0] + "|" +  tablica[0][1] + "|" +  tablica[0][2] );
        System.out.println("-+-+-");
        System.out.println(tablica[1][0] + "|" +  tablica[1][1] + "|" +  tablica[1][2] );
        System.out.println("-+-+-");
        System.out.println(tablica[2][0] + "|" +  tablica[2][1] + "|" +  tablica[2][2] );
    }
}
