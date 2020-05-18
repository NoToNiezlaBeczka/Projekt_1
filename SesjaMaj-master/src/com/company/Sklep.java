package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Sklep {
    private Scanner scanner = new Scanner(System.in);
    private String nazwa;
    private Deque<Rachunek> rachunki = new ArrayDeque<>();

    public Sklep(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajRachunek(Rachunek rachunek)
    {
        boolean opcja2 = true;
        while (opcja2) {
            System.out.println("Wybierz co chcesz kupić: ");
            System.out.println("1. Czajnik");
            System.out.println("2. Herbatę");
            System.out.println("3. Zakończenie zakupów");
            switch (scanner.nextInt())
            {
                case 1:
                    rachunek.dodajProdukt(new Czajnik());
                    break;
                case 2:
                    rachunek.dodajProdukt(new Herbata());
                    break;
                case 3:
                    this.rachunki.add(rachunek);
                    opcja2 = false;
                    break;
                default:
                    this.rachunki.add(rachunek);
                    opcja2 = false;
                    System.out.println("Błąd");
            }
        }
    }

    public void wyswietlRachunki()
    {
        this.rachunki.forEach(rachunek ->
        {
            System.out.println(rachunek);
        });
    }
}
