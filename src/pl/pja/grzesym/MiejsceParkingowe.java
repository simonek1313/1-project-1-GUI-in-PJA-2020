package pl.pja.grzesym;

public class MiejsceParkingowe extends PomieszczeniaOsiedle {

//    protected String nazwa;
//    protected int idNieruchomosci;
    protected int najemca;
    protected boolean gniazdko;
    protected double kubatura;


    MiejsceParkingowe(SzablonNieruchomosc nazwa, double dlugosc, double szerokosc, double wysokosc, boolean gniazdko){
        super (nazwa, dlugosc, szerokosc, wysokosc);
        this.gniazdko = gniazdko;

    }


    public String toString(){
        return super.toString() +"Ganiazdko: " + gniazdko;
    };

}
