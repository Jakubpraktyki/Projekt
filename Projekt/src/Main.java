package Projekt;

import Projekt.Gracz;
import Projekt.Koniec;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner skaner = new Scanner(System.in);
        Plansza plansza = new Plansza();
        Pozycjonowanie pozycjonowanie = new Pozycjonowanie();
        Gracz gracz = new Gracz();
        Zwyciezca zwyciezca = new Zwyciezca();
        Komputer komputer = new Komputer();
        Walidacja walidacja = new Walidacja();
        Koniec koniec = new Koniec();
                            //INSTRUKCJA
        System.out.println("INSTRUKCJA !!!!");
        System.out.println("Grasz przeciwko komputerowi Pola w których stawia on znak O są losowe,\nWybierz pola w których wstawiasz swój znak X, pola ponumerowane są kolejno od 1-9");
        System.out.println();

        char[][] tablica = {{' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}};       //Wyświetlenie pustej tablicy
        plansza.printTablica(tablica);                  //Dodanie do tablicy szablonu złożonego ze znaku |, -, i +

    while (true) {                          //Wykorzystanie pętli while żeby zakonczyć program gdy ktoś wygra
        Gracz.ruchGracza(tablica, scanner);
        if (Koniec.czyGraJestSkonczona(tablica)) {
            break;
        }
        plansza.printTablica(tablica);

        Komputer.ruchKomputera(tablica);
        if (Koniec.czyGraJestSkonczona(tablica)) {
            break;
        }
        plansza.printTablica(tablica);
    }
}
}