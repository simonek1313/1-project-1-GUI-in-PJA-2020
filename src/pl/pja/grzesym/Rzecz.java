package pl.pja.grzesym;

public class Rzecz <T> {
    T nazwa;
    private double dlugosc;
    private double szerokosc;
    private double wysokosc;
    protected double objetosc;
    protected double polePowierzchni;
    protected int idRzeczy;


    public Rzecz(T nazwa, double dlugosc, double szerokosc, double wysokosc) {

        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;

        objetosc = dlugosc*szerokosc*wysokosc;
        polePowierzchni = dlugosc * szerokosc;
    }

    public String toString(){
        return "               " + idRzeczy + " " + "Nazwa: " + nazwa + " " +"Dlugosc: " + dlugosc + " " + "Szerokosc: " + szerokosc + " " + "Wyskokosc: " + wysokosc
                + " " + "Powierzchnia: " + polePowierzchni + ", ";
    }


}
