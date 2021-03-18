package Projekt;
//Norbert Harasim


import java.util.Random;

public class Komputer {
    public static void ruchKomputera(char[][] tablica) {           //Funcja umieszająca znak Komputera czyli znak O w wolne miejsce
        Random rand = new Random();
        int ruchKomputera;
        while (true) {
            ruchKomputera = rand.nextInt(10) ;              //Zakres jego ruchów to 10 czyli od 0 - 9
            if (Walidacja.czyRuchJestPrawidlowy(tablica, Integer.toString(ruchKomputera))) {
                break;
            }
        }
        System.out.println("Komputer wybiera miejsce " + ruchKomputera);
        Pozycjonowanie.pozycjaRuchu(tablica, Integer.toString(ruchKomputera), 'O');
    }

}
