package pl.pja.grzesym;

public class Pojazd <U> extends Rzecz {

    String typPojazdu;
    String typSilnika;
    double pojemnoscSilnika;
    String cechaChakrsakterystyczna;
    protected U cecha;


    Pojazd(SzablonPojazd nazwa, String typPojazdu, String typSilnika, double pojemnoscSilnika, double dlugosc, double szerokosc,
           double wysokosc, String cechaChakrsakterystyczna, U cecha){
        super (nazwa, dlugosc, szerokosc, wysokosc);
        this.typPojazdu=typPojazdu;
        this.typSilnika = typSilnika;
        this.pojemnoscSilnika= pojemnoscSilnika;
        this.cechaChakrsakterystyczna = cechaChakrsakterystyczna;
        this.cecha = cecha;

    }

    public String toString(){
        super.toString();
        return super.toString() + "Typ pojazdu: " + typPojazdu + ", " + "Typ silnika: " + typSilnika +", " + "Pojemnosc silnika: " + pojemnoscSilnika + ", "
                + "Cecha charakterystyczna: " + cechaChakrsakterystyczna + "- " + cecha;

    };
}
