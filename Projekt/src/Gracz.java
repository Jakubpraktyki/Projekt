package Projekt;

//Norbert Harasim

import java.util.Scanner;
public class Gracz {
    public static void ruchGracza(char[][] tablica, Scanner scanner) {
        String userInput;                   //Zmienna string oznaczająca to co wprowadził gracz
        while (true) {                  //petla while która trwa aż do wyczerpania ruchów
            System.out.println("Gdzie chcesz postawić X? (1-9)");       //Zapytytanie o miejsce gdzie postawić znak
            userInput = scanner.nextLine();                             //Skanowanie tego co wprowadza gracz
            if (Walidacja.czyRuchJestPrawidlowy(tablica, userInput)){           //Jeśli miejsce jest poprawne i zweryfikowane przez klase walidacja ruch gracza się kończy
                break;
            } else {
                System.out.println("Podałeś nieprawidłową liczbę.");            // W innym przypadku wyświetla sie komunikat że wprowadziliśmy złą liczbe
            }
        }
        Pozycjonowanie.pozycjaRuchu(tablica, userInput, 'X');           //Wprowadzenie znaku X do jednej z opcji która wybraliśmy
    }
}
