package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Sklep herbatka = new Sklep("Herbata Marzeń");
        Scanner scanner = new Scanner(System.in);
        boolean opcja1 = true;
        while (opcja1){

            System.out.println("1. Dodaj produkt");
            System.out.println("2. Wyświetl koszyk");
            System.out.println("3. Zakończ");

            switch (scanner.nextInt())
            {
                case 1:
                    Rachunek rachunek = new Rachunek(new Date());
                    herbatka.dodajRachunek(rachunek);
                    break;
                case 2: herbatka.wyswietlRachunki(); break;
                case 3: opcja1 = false; break;
                default:
                    opcja1 = false;
                    System.out.println("Błąd");
            }
        }
    }
}
