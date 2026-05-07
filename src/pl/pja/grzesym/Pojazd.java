package pl.pja.grzesym;
import java.util.ArrayList;
import java.util.Collections;

public class Pojazd <U> extends Rzecz   {

    String typPojazdu;
    String typSilnika;
    double pojemnoscSilnika;
    String cechaChakrsakterystyczna;
    protected U cecha;
    public double polePowierzchni;


    Pojazd(String nazwa, String typPojazdu, String typSilnika, double pojemnoscSilnika, double dlugosc, double szerokosc,
           double wysokosc, String cechaChakrsakterystyczna, U cecha){
        super (nazwa, dlugosc, szerokosc, wysokosc);
        this.typPojazdu=typPojazdu;
        this.typSilnika = typSilnika;
        this.pojemnoscSilnika= pojemnoscSilnika;
        this.cechaChakrsakterystyczna = cechaChakrsakterystyczna;
        this.cecha = cecha;
        polePowierzchni = super.polePowierzchni;


    }

    public String toString(){
        super.toString();
        return super.toString() + "Typ pojazdu: " + typPojazdu + ", " + "Typ silnika: " + typSilnika +", " + "Pojemnosc silnika: " + pojemnoscSilnika + ", "
                + "Cecha charakterystyczna: " + cechaChakrsakterystyczna + "- " + cecha;

    };






}
