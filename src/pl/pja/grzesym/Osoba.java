package pl.pja.grzesym;

import java.util.ArrayList;

public class Osoba {
    protected int idOsoby = -1;
    protected String imie;
    protected String nazwisko;
    private String dataUrodzenia;
    private int pesel;
    String adres;


//    public int lokalePomieszczenia[] = new int[5];
    protected ArrayList<PomieszczeniaOsiedle> listaPomieszczen = new ArrayList<>();



    public Osoba(String imie, String nazwisko, String dataUrodzenia, int pesel, String adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.pesel = pesel;
        this.adres = adres;
    }
    public Osoba(){
    }

    public void wynajmijPomieszczenie(Osoba osoba, PomieszczeniaOsiedle pomieszczenie) {

        if (osoba.listaPomieszczen.size() ==0 && pomieszczenie instanceof MiejsceParkingowe){
            System.out.println("Nie masz jeszcze wynajetego mieszkania. Garaz wynajmiesz dopiero" +
                    " jak bedziesz mial wynajete mieszkanie.");
        }

        else if (osoba.listaPomieszczen.size() < 5 && pomieszczenie.czyWynajete == false) {
            osoba.listaPomieszczen.add(pomieszczenie);
            pomieszczenie.idNajemcy = osoba.idOsoby;
            System.out.println("Pomieszczenie zostalo wynajete");
            pomieszczenie.czyWynajete = true;
        }
        else if (osoba.listaPomieszczen.size() >= 5) {
            System.out.println("Nie mozesz dodac pomieszczenia. Przekroczony limit 5-ciu pomieszczen na osobe!");
        }
        else if (pomieszczenie.czyWynajete == true){
            System.out.println("Tego pomieszczenia nie mozesz dodac. Jest juz wynajete!");
        }
    }

    public void wypowiedzPomieszczenie(PomieszczeniaOsiedle pomieszczenie, Osoba osoba){
        pomieszczenie.listaPrzedmiotow.clear();
        pomieszczenie.listaZameldowanych.clear();
        pomieszczenie.czyWynajete = false;
        osoba.listaPomieszczen.remove(pomieszczenie);
        pomieszczenie.idNajemcy = -1;
        System.out.println("Pomieszczenie zostalo zwolnione");
        }


    public static void mojeWynajmy(ArrayList<PomieszczeniaOsiedle> list){
          for(PomieszczeniaOsiedle ele: list){
          System.out.println(ele);
                }
            }


      public String toString(){
        return idOsoby + ". " + "Imie i nazwisko: " + imie + ", " + nazwisko
                + ", " + "Pesel: " + pesel + ", " + "Adres: " + adres;
            };

}
