package com.company;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;

public class Rachunek
{
    private Deque<Produkt> produkty = new ArrayDeque<>();
    private final Date dataZamowienia;
    private double wartosc;

    public Rachunek(Date dataZamowienia)
    {
        this.dataZamowienia = dataZamowienia;
    }

    public void dodajProdukt(Produkt produkt)
    {
        this.wartosc += produkt.pobierzWartosc();
        this.produkty.add(produkt);
    }

    @Override
    public String toString()
    {
        return "Rachunek{" + "produkty=" + produkty.toString() + ", dataZamowienia=" + dataZamowienia + ", wartosc=" + wartosc + '}';
    }
}
