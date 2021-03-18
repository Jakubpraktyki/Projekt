package Projekt;

//Norbert Harasim

public class Walidacja {
    public static boolean czyRuchJestPrawidlowy (char[][] tablica, String position) { //Funkcja która sprawdza czy dane miejsce w tablicy jest wolne jesli nie zwraca wartość false
        switch(position) {
            case "1":
                return (tablica[0][0] == ' ');
            case "2":
                return (tablica[0][1] == ' ');      // jesli w miejscu gdzie my albo komputer chcemy postawic znak jest pusta przestrzen czyli ' ' możemy postawić tam nasz znak
            case "3":
                return (tablica[0][2] == ' ');
            case "4":
                return (tablica[1][0] == ' ');
            case "5":
                return (tablica[1][1] == ' ');
            case "6":
                return (tablica[1][2] == ' ');
            case "7":
                return (tablica[2][0] == ' ');
            case "8":
                return (tablica[2][1] == ' ');
            case "9":
                return (tablica[2][2] == ' ');
            default:
                return false;       // w przeciwnym razie boolean zwraca nam wartość false
        }
    }
}
