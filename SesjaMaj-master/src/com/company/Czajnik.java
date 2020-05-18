package com.company;

import java.util.Scanner;

enum MaterialCzajnika
{
    ZELIWO, PORCELANA, SZKLO, METAL
}


enum PojemnosciCzajnika
{
    MALA(0.5, 50.0),
    SREDNIA(0.8, 70.0),
    DUZA(1.1, 100.0);

    private double pojemnosc;
    private double wartosc;

    PojemnosciCzajnika(double pojemnosc, double wartosc)
        {
        this.pojemnosc = pojemnosc;
        this.wartosc = wartosc;
        }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }
}




public class Czajnik extends Produkt
{
    private PojemnosciCzajnika pojemnosciCzajnika;
    private MaterialCzajnika materialCzajnika;

    public Czajnik()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz materiał z którego chcesz czajnik: ");
        this.pokazMozliwosci();
        this.materialCzajnika = switch(sc.nextInt())
                {
                    case 1 -> MaterialCzajnika.ZELIWO;
                    case 2 -> MaterialCzajnika.PORCELANA;
                    case 3 -> MaterialCzajnika.SZKLO;
                    case 4 -> MaterialCzajnika.METAL;
                    default -> {
                         System.out.println("Błąd");
                            yield null;
                                }
                };
        System.out.println("Wybierz pojemność czajnika: ");
        this.rozmiarPojemnosc();
        this.pojemnosciCzajnika = switch(sc.nextInt())
                {
            case 1 -> PojemnosciCzajnika.MALA;
            case 2 -> PojemnosciCzajnika.SREDNIA;
            case 3 -> PojemnosciCzajnika.DUZA;
            default -> {
                System.out.println("Błąd");
                yield null;
            }
                };
    }

    @Override
    public void pokazMozliwosci()
    {
        int i = 0;
        for (MaterialCzajnika r: MaterialCzajnika.values())
        {
            i++;
            System.out.println(i + ". " + r);
        }
    }

    @Override
    public void rozmiarPojemnosc()
    {
        int i = 0;
        for (PojemnosciCzajnika r: PojemnosciCzajnika.values())
        {
            i++;
            System.out.println(i + ". Pojemność: " + r.getPojemnosc() + " wartość: " + r.getWartosc());
        }
    }

    @Override
    public double pobierzWartosc()
    {
        if (this.pojemnosciCzajnika != null)
        {
            return this.pojemnosciCzajnika.getWartosc();
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
        return "Czajnik{" + "pojemnosciCzajnika=" + pojemnosciCzajnika + ", materialCzajnika=" + materialCzajnika + " wartość=" + this.pojemnosciCzajnika.getWartosc() +'}';
    }

    public PojemnosciCzajnika getPojemnosciCzajnika() {
        return pojemnosciCzajnika;
    }

    public void setPojemnosciCzajnika(PojemnosciCzajnika pojemnosciCzajnika)
    {
        this.pojemnosciCzajnika = pojemnosciCzajnika;
    }

    public MaterialCzajnika getMaterialCzajnika() {
        return materialCzajnika;
    }

    public void setMaterialCzajnika(MaterialCzajnika materialCzajnika) {
        this.materialCzajnika = materialCzajnika;
    }
}


