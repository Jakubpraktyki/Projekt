package Projekt;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        boolean exit = true;
        System.out.println("\n" +
                "████████╗██╗░█████╗░████████╗░█████╗░░█████╗░████████╗░█████╗░███████╗\n" +
                "╚══██╔══╝██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██╔════╝\n" +
                "░░░██║░░░██║██║░░╚═╝░░░██║░░░███████║██║░░╚═╝░░░██║░░░██║░░██║█████╗░░\n" +
                "░░░██║░░░██║██║░░██╗░░░██║░░░██╔══██║██║░░██╗░░░██║░░░██║░░██║██╔══╝░░\n" +
                "░░░██║░░░██║╚█████╔╝░░░██║░░░██║░░██║╚█████╔╝░░░██║░░░╚█████╔╝███████╗\n" +
                "░░░╚═╝░░░╚═╝░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝░╚════╝░░░░╚═╝░░░░╚════╝░╚══════╝");

            do {
                try {



                        System.out.println("\uD835\uDFD9 - \uD835\uDD3E\uD835\uDD63\uD835\uDD52\uD835\uDD54\uD835\uDD6B \uD835\uDD67\uD835" +
                                "\uDD64 \uD835\uDD3E\uD835\uDD63\uD835\uDD52\uD835\uDD54\uD835\uDD6B");
                        System.out.println("\uD835\uDFDA - \uD835\uDD3E\uD835\uDD63\uD835\uDD52\uD835\uDD54\uD835\uDD6B \uD835\uDD67\uD835" +
                                "\uDD64 \uD835\uDD42\uD835\uDD60\uD835\uDD5E\uD835\uDD61\uD835\uDD66\uD835\uDD65\uD835\uDD56\uD835\uDD63");
                        System.out.println("\uD835\uDFDB - \uD835\uDD3C\uD835\uDD4F\uD835\uDD40\uD835\uDD4B");


                        int liczba = skaner.nextInt();
                        switch (liczba) {
                            case 1: {
                                char[][] board = new char[3][3];
                                Plansza1 plansza1 = new Plansza1();
                                Wygrana wygrana = new Wygrana();
                                Scanner sc = new Scanner(System.in);
                                char symbol = '0';
                                int A = 0;


                                while (true && A <= 8) {

                                    A++;
                                    plansza1.board2(board);
                                    System.out.println(" Podaj Wiersz: ");
                                    int Wiersz = sc.nextInt();
                                    System.out.println("Podaj kolumne: ");
                                    int Kolumna = sc.nextInt();

                                    boolean bl = board[Wiersz][Kolumna] == 0;
                                    if (!bl) {
                                        System.out.println("To miejsce jest już zajęte :( ");
                                        continue;
                                    }


                                    if (symbol == 'X') {
                                        symbol = '0';
                                    } else {
                                        symbol = 'X';
                                    }
                                    board[Wiersz][Kolumna] = symbol;
                                    if (wygrana.wygrana(board, 'X')) {
                                        A++;

                                        plansza1.board2(board);
                                        System.out.println("Wygrał X !! ");
                                        break;
                                    }
                                    if (wygrana.wygrana(board, '0')) {
                                        A++;

                                        plansza1.board2(board);
                                        System.out.println("Wygrał 0  !! ");
                                        break;
                                    }
                                    if (A == 9) {
                                        plansza1.board2(board);
                                        System.out.println("Remis !!!");
                                    }


                                }
                            }
                            break;


                            case 2: {
                                Scanner scanner = new Scanner(System.in);
                                Plansza plansza = new Plansza();                //Klasa Rysująca tablicę
                                Pozycjonowanie pozycjonowanie = new Pozycjonowanie();       //Klasa Wymieniająca w case-ach możliwe opcje gdzie można wstawić symbol X lub O
                                Gracz gracz = new Gracz();              //Klasa umożliwiająca gre graczowi
                                Zwyciezca zwyciezca = new Zwyciezca();  // Klasa która analizuje wszystkie możliwe opcje wygranej w if np w pionie poziomie
                                Komputer komputer = new Komputer();         //Klasa odpowiadająca za grę komputera losująca w którym miejscu stawia O
                                Walidacja walidacja = new Walidacja();      //Klasa sprawdzająca czy w miejscu gdzie gracz lub komputer chce postawić Znak nic nie stoi
                                Koniec koniec = new Koniec();               //Klasa która zamyka program gdy wszystkie miejsca w tablicy są zajęte i wyłania zwycięzcę


                                char[][] tablica = {{' ', ' ', ' '},                //Pusta tablica
                                        {' ', ' ', ' '},
                                        {' ', ' ', ' '}};
                                plansza.printTablica(tablica);                  //Dodanie do tablicy szablonu złożonego ze znaku |, -, +
                                while (true) {                          //Wykorzystanie pętli while żeby zakonczyć program gdy ktoś wygra
                                    Gracz.ruchGracza(tablica, scanner);             //Najpierw ruch gracza
                                    if (Koniec.czyGraJestSkonczona(tablica)) {          //Jesli gra jest skonczona zakończy program
                                        break;
                                    }
                                    plansza.printTablica(tablica);          //wyswietla tablice na koniec z wszystkimi zapelnionymi polami
                                    Komputer.ruchKomputera(tablica);        //Pozniej jest ruch komputera
                                    if (Koniec.czyGraJestSkonczona(tablica)) {      //jesli gra jest skonczona  zakonczy program
                                        break;
                                    }
                                    plansza.printTablica(tablica);          //wyswietla tablice na koniec z wszystkimi zapelnionymi polami
                                }
                            }

                            break;

                            case 3: {
                                System.out.println("Wyjście z Kółko i krzyżyk");
                                exit = false;
                                break;
                            }

                            default:
                                System.out.println("Podałeś złą opcję");
                                break;
                        }

                } catch (Exception e) {
                    System.out.println("Podałeś złą opcję");
                    skaner.next();
                }

        }while (exit);
        }



    }






