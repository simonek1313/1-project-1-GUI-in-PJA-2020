package pl.pja.grzesym;

public class Mieszkanie extends PomieszczeniaOsiedle {

//    protected String nazwa;
//    protected int idNieruchomosci;
    protected int liczbaPokoi;
    protected int liczbaLozek;
    protected int najemca;
    protected double kubatura;

    Osoba lokator[] = new Osoba[50];

    Mieszkanie(SzablonNieruchomosc nazwa, double dlugosc, double szerokosc, double wysokosc, int pokoje, int lozka){
        super (nazwa, dlugosc, szerokosc, wysokosc);
        liczbaPokoi = pokoje;
        liczbaLozek = lozka;


    }

    public String toString(){
        super.toString();
        return super.toString() +  "Liczba pokoi: " + liczbaPokoi + "Liczba lozek: " + liczbaLozek;

    };
}
