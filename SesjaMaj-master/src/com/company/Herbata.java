package com.company;

import java.util.Scanner;

enum NazwaHerbaty
{
    KASZMIR(10.0),
    MALACHIT(12.0),
    SZMARAGD(14.0),
    LAS(3.0),
    OCEAN(8.0);

    private double wartosc;

    NazwaHerbaty(double wartosc) {
        this.wartosc = wartosc;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }
}


public class Herbata extends Produkt
{
    private NazwaHerbaty nazwaHerbaty;

    public Herbata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz herbatę: ");
        this.pokazMozliwosci();
        this.nazwaHerbaty = switch(sc.nextInt())
                {
            case 1 -> nazwaHerbaty.KASZMIR;
            case 2 -> nazwaHerbaty.MALACHIT;
            case 3 -> nazwaHerbaty.SZMARAGD;
            case 4 -> nazwaHerbaty.LAS;
            case 5 -> nazwaHerbaty.OCEAN;
            default ->
                    {
                System.out.println("Błąd");
                yield null;
                     }
                  };
    }

    @Override
    public void  pokazMozliwosci()
    {
        int i = 0;
        for (NazwaHerbaty r: NazwaHerbaty.values())
        {
            i++;
            System.out.println(i + ". " + r);
        }
    }

    @Override
    public void rozmiarPojemnosc() {
        System.out.println("Herbaty sprzedawane są tylko w paczkach po 20 gramów.");
    }

    @Override
    public double pobierzWartosc()
    {
        if (this.nazwaHerbaty != null)
        {
            return this.nazwaHerbaty.getWartosc();
        }
        else
            {
            System.out.println("Błąd");
            return 0.0;
             }
    }

    @Override
    public String toString()
    {
        return "Herbata{" + "nazwaHerbaty=" + nazwaHerbaty + " wartosc=" + this.nazwaHerbaty.getWartosc() + '}';
    }

    public NazwaHerbaty getNazwaHerbaty() {
        return nazwaHerbaty;
    }

    public void setNazwaHerbaty(NazwaHerbaty nazwaHerbaty) {
        this. nazwaHerbaty =  nazwaHerbaty;
    }
}

