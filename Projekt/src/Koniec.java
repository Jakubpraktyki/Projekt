package Projekt;
//Norbert Harasim


public class Koniec {
    public static boolean czyGraJestSkonczona(char[][] tablica) {
        Plansza plansza = new Plansza();
        if (Zwyciezca.ktoWygralRunde (tablica, 'X') )         //Jeśli wygrał rundę znak X wygrałeś ty
        {
            plansza.printTablica(tablica);
            System.out.println("Wygrałeś !! ");
            return true;
        }

        if (Zwyciezca.ktoWygralRunde(tablica, 'O')) {             //Jeśli wygrał rundę znak O wygrał komputer
            plansza.printTablica(tablica);
            System.out.println("Komputer wygrał ");

            return true;
        }

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                if (tablica[i][j] == ' ') {     //dopóki tablica nie jest zapełniona zwraca fałsz
                    return false;
                }
            }
        }

        plansza.printTablica(tablica);
        System.out.println("Remis!");       // w innym przypadku wyświetl remis
        return true;
    }
}
