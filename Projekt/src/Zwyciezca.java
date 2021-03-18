package Projekt;
//Norbert Harasim


public class Zwyciezca {
    public static boolean ktoWygralRunde(char[][] tablica, char symbol) {               //Analizowanie kto wygrał ty czy komputer

            if ((tablica[0][0] == symbol && tablica[0][1] == symbol && tablica[0][2] == symbol) ||
                    (tablica[1][0] == symbol && tablica[1][1] == symbol && tablica[1][2] == symbol) ||
                    (tablica[2][0] == symbol && tablica[2][1] == symbol && tablica[2][2] == symbol) ||

                    (tablica[0][0] == symbol && tablica[1][0] == symbol && tablica[2][0] == symbol) ||  //Wypisywanie wszystkich możliwości czyli np na ukos poziomo pionowo itd
                    (tablica[0][1] == symbol && tablica[1][1] == symbol && tablica[2][1] == symbol) ||
                    (tablica[0][2] == symbol && tablica[1][2] == symbol && tablica[2][2] == symbol) ||

                    (tablica[0][0] == symbol && tablica[1][1] == symbol && tablica[2][2] == symbol) ||
                    (tablica[0][2] == symbol && tablica[1][1] == symbol && tablica[2][0] == symbol)) {
                return true;
            }

        return false;

    }
}
