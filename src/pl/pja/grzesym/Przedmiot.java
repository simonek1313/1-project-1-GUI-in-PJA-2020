package pl.pja.grzesym;


public class Przedmiot extends Rzecz{

    String kolor;

    Przedmiot(String nazwa, String kolor, double dlugosc, double szerokosc, double wysokosc){
        super (nazwa, dlugosc, szerokosc, wysokosc);
        this.kolor = kolor;

    }

    public String toString(){
        super.toString();
        return super.toString() + "Kolor: " + kolor;

    };
}
