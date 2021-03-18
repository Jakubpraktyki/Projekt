package Projekt;
//Norbert Harasim

public class Pozycjonowanie {
    public static void pozycjaRuchu(char[][] tablica, String position, char symbol) {
        switch(position) {
            case "1":
                tablica[0][0] = symbol;
                break;
            case "2":
                tablica[0][1] = symbol;
                break;
            case "3":
                tablica[0][2] = symbol;
                break;
            case "4":
                tablica[1][0] = symbol;
                break;
            case "5":
                tablica[1][1] = symbol;
                break;
            case "6":
                tablica[1][2] = symbol;
                break;
            case "7":
                tablica[2][0] = symbol;
                break;
            case "8":
                tablica[2][1] = symbol;
                break;
            case "9":
                tablica[2][2] = symbol;
                break;
            default:
                System.out.println(":(");
        }

    }
}
