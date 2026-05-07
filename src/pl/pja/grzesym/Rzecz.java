package pl.pja.grzesym;


public class Rzecz implements Comparable <Rzecz> {
    String nazwa;
    public double dlugosc;
    public double szerokosc;
    private double wysokosc;
    protected double objetosc;
    public double polePowierzchni;
    protected int idRzeczy;


    public Rzecz(String nazwa, double dlugosc, double szerokosc, double wysokosc) {

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


     @Override
    public int compareTo(Rzecz au) {
        if (this.polePowierzchni> au.polePowierzchni)
            return -1;
            else if  (this.polePowierzchni< au.polePowierzchni)
                return 1;

                return  this.nazwa.compareTo(au.nazwa);

     }

}
