package pl.pja.grzesym;
import java.util.ArrayList;

public class PomieszczeniaOsiedle {

    protected int idNieruchomosci;
    protected int idNajemcy = -1;

    SzablonNieruchomosc nazwa;
    private double dlugosc;
    private double szerokosc;
    private double wysokosc;
    protected String dataNajmu;
    protected String dataZakonczeniaNajmu;
    protected int najemca;
    protected boolean czyWynajete = false;
    protected double kubatura;
    protected double polePowierzchni;
    protected ArrayList<Rzecz> listaPrzedmiotow = new ArrayList<>();
    protected ArrayList<Osoba> listaZameldowanych = new ArrayList<>();


    public PomieszczeniaOsiedle(SzablonNieruchomosc nazwa, double dlugosc, double szerokosc, double wysokosc) {

        this.nazwa = nazwa;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;

        kubatura = dlugosc*szerokosc*wysokosc;
        polePowierzchni = dlugosc*szerokosc;
    }

    public PomieszczeniaOsiedle(){
    }


    protected static void printListaPrzedmiotow(ArrayList<Rzecz> list){
        for(Rzecz ele: list){
            System.out.println(ele);
        }
    }


    protected static void printListaOsob(ArrayList<Osoba> list){
        for(Osoba oso: list){
            System.out.println(oso);
        }
    }

    protected static void dodajPrzedmiot(PomieszczeniaOsiedle pomieszczenie, Rzecz rzecz) throws TooManyThingsException {
        double powierzchnia = 0;
        Rzecz rzecz1;
        if(pomieszczenie.listaPrzedmiotow.size()!=0) {
            for (int i = 0; i <= pomieszczenie.listaPrzedmiotow.size(); i++) {
                rzecz1 = pomieszczenie.listaPrzedmiotow.get(i);
                powierzchnia = powierzchnia + rzecz1.polePowierzchni;
            }
        }
        rzecz1=rzecz;
        powierzchnia = powierzchnia + rzecz.polePowierzchni;
        if(pomieszczenie instanceof Mieszkanie && rzecz instanceof Pojazd){
            System.out.println("Z przykroscia stwierdzam, ze do mieszkania nie wkladamy pojazdow. Rozpocznij procedure od nowa (Pzycja 6 w menu)");
        }
        else if(powierzchnia > pomieszczenie.polePowierzchni){
            throw new TooManyThingsException();
//            System.out.println(" Twoje pomieszczenie jest przepelnione. Dodawany przedmiot sie nie zmiesci");
        }
        else{
        pomieszczenie.listaPrzedmiotow.add(rzecz);
        System.out.println("Rzecz zostala dodana");
        }
    }

    protected static void usunPrzedmiot(PomieszczeniaOsiedle pomieszczenie, Rzecz rzecz){

        if(pomieszczenie.listaPrzedmiotow.size() == 0){
            System.out.println("Pomieszczenie jest puste");
        }
        else{
            pomieszczenie.listaPrzedmiotow.remove(rzecz);
            System.out.println("Rzecz zostala usunieta");
        }
    }

    protected static void zameldujOsobe(PomieszczeniaOsiedle pomieszczenie, Osoba osoba) {

        if(pomieszczenie instanceof MiejsceParkingowe){
            System.out.println("Z przykroscia stwierdzam, ze do garazu nie meldujemy osob. Rozpocznij procedure od nowa (Pzycja 10 w menu)");
        }

        else{
            pomieszczenie.listaZameldowanych.add(osoba);
            System.out.println("Osoba zostala zameldowana");
        }
    }

    protected static void wymeldujOsobe(PomieszczeniaOsiedle pomieszczenie, Osoba osoba){

        if(pomieszczenie.listaZameldowanych.size() == 0){
            System.out.println("Pomieszczenie jest puste. Trudno wymeldowuje sie nikogo :).");
        }
        else if(pomieszczenie instanceof MiejsceParkingowe){
            System.out.println("Z przykroscia stwierdzam, ze z garazu nie wymeldujemy osob. Rozpocznij procedure od nowa (Pzycja 10 w menu)");
        }
        else{
            pomieszczenie.listaZameldowanych.remove(osoba);
            System.out.println("Osoba zostala wymeldowana");
        }
    }

    public String toString(){
        return "      " + idNieruchomosci + ". " + "Typ: " + nazwa + ", " +"Dlugosc: " + dlugosc + ", " + "Szerokosc: " + szerokosc + ", " + "Wyskokosc: " + wysokosc
                +"\n         " + "Pole powierzchni: " + polePowierzchni + ", " ;
    };
}





