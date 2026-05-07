//Wykonal Grzegorz Symoniuk (s21318)
// Program powstal w ramach przedmiotu GIU na uczelni PJA. W ramach projektu korzystalem z pomyslow i przykladow podanych
// na wykladach oraz  stronie internetowej Javastart.pl. Jakkolwiek calosc kodu zostala wykreowana samodzielnie.
// Moze sie zdazyc, ze krotkie odciniki kodu w programie sa podobne do przykladow zawartych w Internecie.
// Jesli tak sie stalo to nie bylo to zamierzone i jest calkowicie przypadkowe.

// W programie udalo sie zaimplementowac:
// - obsluge wyjatkow
// - enumeratory
// - interfejsy
// - dziedziczenie i polimorfizm
// - generycznosc klas czy tez metod
// - kolekcje (ArrayList)
// - zapis do pliku (bez sortowania)

// Natomiast nie udalo sie zrealizowac:
// - wielowatkowosc i obsluga dat

// UWAGA!!!!!!!!!!!!!!!!!!!!!!!  Osoby 0, 1 i 2 maja wstepnie przypisane najmy i przedmioty!!!!!!!!!!!!!!!!!!!
// rzeczy nie sa ewidencjonowane numerem unikatowym, mozna je wykorzystywac wiele razy do wkladania do pomiszczen. Sluza jako szablon.
//Na potrzeby programu nie ewidencjonuje sie osob meldowanych w mieszkaniach. Mozna zameldowac jedna osobe wiele razy nawet w tym samym mieszkaniu.
//chodzi o mozliwosc meldowania dowolnej liczby osob na pomieszczenie, przy ich ogrzniczonej podazy w programie.


package pl.pja.grzesym;
import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException, TooManyThingsException {
        int MAX_OSOBA = 500;
        int MAX_RZECZ = 500;
        int MAX_POMIESZCZENIA = 100;
        int idOsoba = 0;
        int idPomieszczenia = 0;
        int idRzeczy = 0;
        PomieszczeniaOsiedle osiedle1[] = new PomieszczeniaOsiedle[MAX_POMIESZCZENIA];
        Osoba[] lokator = new Osoba[MAX_OSOBA];
        Osoba aktualnaOsoba = new Osoba();
        PomieszczeniaOsiedle aktualnyNajem = new PomieszczeniaOsiedle();
        Rzecz[] rzeczy = new Rzecz[MAX_RZECZ];
        Scanner scan = new Scanner(System.in);
        int i;
        int wielkoscMenu = 13;


//  Tworzenie obiektow

        lokator[idOsoba] = new Osoba ("Jan", "Kowalski", "23-03-1972", 720323086, "Chelm, ul. Wolnosci 7/78");
        lokator[idOsoba].idOsoby=idOsoba;
        idOsoba++;
        lokator[idOsoba] = new Osoba("Ewa", "Nowak", "15-05-1996", 960515121 , "Pisaeczno, ul. Na Wale 15");
        lokator[idOsoba].idOsoby=idOsoba;
        idOsoba++;
        lokator[idOsoba]  = new Osoba("Jolanta", "Krzywousta", "01-01-1992", 920101156, "Torun, ul. Kopernika 15/1");
        lokator[idOsoba].idOsoby=idOsoba;
        idOsoba++;
        lokator[idOsoba]  = new Osoba("Barbara", "Wegiel", "17-11-1998" , 981117156, "Torun, ul. Kopernika 15/1");
        lokator[idOsoba].idOsoby=idOsoba;
        idOsoba++;
        lokator[idOsoba]  = new Osoba("Edward", "Solarski", "31-12-1981", 811231055, "Suchowla 15" );
        lokator[idOsoba].idOsoby=idOsoba;
        idOsoba++;
        lokator[idOsoba]  = new Osoba("Waldemar", "Wiatraczny", "09-07-1948", 480709999, "Lublin, ul. Nadbystrzycka 48/16");
        lokator[idOsoba].idOsoby=idOsoba;
        idOsoba++;
        lokator[idOsoba]  = new Osoba("Zofia", "Grzesiuk", "02-02-1965", 650202358, "Warszawa, ul Chlodna 15/26");
        lokator[idOsoba].idOsoby=idOsoba;
        idOsoba++;
        lokator[idOsoba]  = new Osoba("Przemyslaw", "Nowakowski", "29-03-1972", 700329954, "Zielona Gora, ul. Na Stoczku 389");
        lokator[idOsoba].idOsoby=idOsoba;
        idOsoba++;
        lokator[idOsoba]  = new Osoba("Zygfryd", "Lwieserce", "15-09-1978", 780915422, "Zamosc, Plac Zamkowy 25/2");
        lokator[idOsoba].idOsoby=idOsoba;
        idOsoba++;
        lokator[idOsoba]  = new Osoba("Genowefa", "Pigwa", "13-11-2000", 0011135666, "Gdansk, ul. Dluga 2/1578");
        lokator[idOsoba].idOsoby=idOsoba;

        osiedle1[idPomieszczenia] = new Mieszkanie(SzablonNieruchomosc.MIESZKANIE_M4,  10, 8, 2.6,4, 6 );
        osiedle1[idPomieszczenia].idNieruchomosci = idPomieszczenia;
        idPomieszczenia++;
        osiedle1[idPomieszczenia] = new Mieszkanie(SzablonNieruchomosc.MIESZKANIE_M4, 12, 10, 2.6,4, 6 );
        osiedle1[idPomieszczenia].idNieruchomosci = idPomieszczenia;
        idPomieszczenia++;
        osiedle1[idPomieszczenia] = new Mieszkanie(SzablonNieruchomosc.MIESZKANIE_M3,8, 8, 2.6,3, 5 );
        osiedle1[idPomieszczenia].idNieruchomosci = idPomieszczenia;
        idPomieszczenia++;
        osiedle1[idPomieszczenia] = new Mieszkanie(SzablonNieruchomosc.MIESZKANIE_M3,8, 6.5, 2.6,3, 4 );
        osiedle1[idPomieszczenia].idNieruchomosci = idPomieszczenia;
        idPomieszczenia++;
        osiedle1[idPomieszczenia] = new Mieszkanie(SzablonNieruchomosc.MIESZKANIE_M2,7, 6.28, 2.6,2, 3 );
        osiedle1[idPomieszczenia].idNieruchomosci = idPomieszczenia;
        idPomieszczenia++;
        osiedle1[idPomieszczenia] = new Mieszkanie(SzablonNieruchomosc.MIESZKANIE_M2,8.33, 4.28, 2.6,2, 2 );
        osiedle1[idPomieszczenia].idNieruchomosci = idPomieszczenia;
        idPomieszczenia++;
        osiedle1[idPomieszczenia] = new MiejsceParkingowe( SzablonNieruchomosc.PARKING1,5, 4, 2.2,true );
        osiedle1[idPomieszczenia].idNieruchomosci = idPomieszczenia;
        idPomieszczenia++;
        osiedle1[idPomieszczenia] = new MiejsceParkingowe(SzablonNieruchomosc.PARKING2,5,3.5, 2.2,true );
        osiedle1[idPomieszczenia].idNieruchomosci = idPomieszczenia;
        idPomieszczenia++;
        osiedle1[idPomieszczenia] = new MiejsceParkingowe(SzablonNieruchomosc.PARKING1,5, 4, 2.2,false );
        osiedle1[idPomieszczenia].idNieruchomosci = idPomieszczenia;
        idPomieszczenia++;
        osiedle1[idPomieszczenia] = new MiejsceParkingowe(SzablonNieruchomosc.PARKING2,5,3.5, 2.2,false );
        osiedle1[idPomieszczenia].idNieruchomosci = idPomieszczenia;

        rzeczy[idRzeczy] = new Przedmiot("Polka",  "Niebieski", 2.5,0.8, 1.6);
        rzeczy[idRzeczy].idRzeczy = idRzeczy;
        idRzeczy++;
        rzeczy[idRzeczy] = new Przedmiot("Krzeslo",  "Niebieski", 0.3,0.3, 0.8);
        rzeczy[idRzeczy].idRzeczy = idRzeczy;
        idRzeczy++;
        rzeczy[idRzeczy] = new Przedmiot("Narty",  "Zolty", 1.6,0.15, 0.3);
        rzeczy[idRzeczy].idRzeczy = idRzeczy;
        idRzeczy++;
        rzeczy[idRzeczy] = new Przedmiot("Lozko",  "Zloty", 2.0,1.6, 0.8);
        rzeczy[idRzeczy].idRzeczy = idRzeczy;
        idRzeczy++;
        rzeczy[idRzeczy] = new Przedmiot("Lozko",  "Zloty", 2.0,1, 0.8);
        rzeczy[idRzeczy].idRzeczy = idRzeczy;
        idRzeczy++;
        rzeczy[idRzeczy] = new Przedmiot("Rower",  "Czerwony", 1.8,0.6, 1.2);
        rzeczy[idRzeczy].idRzeczy = idRzeczy;
        idRzeczy++;
        rzeczy[idRzeczy] = new Pojazd<Double>("SzablonPojazd.SAMOCHOD_TERENOWY",  "Paka", "Diesel",2.5, 5.5,
                2.5,2.1, "Przeswit podwozia", 0.3);
        rzeczy[idRzeczy].idRzeczy = idRzeczy;
        idRzeczy++;
        rzeczy[idRzeczy] = new Pojazd<Double>("SzablonPojazd.SAMOCHOD_OSOBOWY",  "Sedan", "Diesel",1.8, 4.5,
                2.2,2, "Ilosc miejsc", 5.0);
        rzeczy[idRzeczy].idRzeczy = idRzeczy;
        idRzeczy++;
        rzeczy[idRzeczy] = new Pojazd<Boolean>("SzablonPojazd.MOTOCYKL",  "Wyscigowy", "Benzyna",1.2, 3.5,
                1.0,1.2, "Turystyczny", false);
        rzeczy[idRzeczy].idRzeczy = idRzeczy;
        idRzeczy++;
        rzeczy[idRzeczy] = new Pojazd<Boolean>("SzablonPojazd.LODZ",  "Turystyczny", "Diesel",1.2, 6.5,
                1.5,1.0, "Z silnikiem", true);
        rzeczy[idRzeczy].idRzeczy = idRzeczy;
        idRzeczy++;
        rzeczy[idRzeczy] = new Pojazd<Double>("SzablonPojazd.AMFIBIA",  "Toporny", "Diesel",1.2, 6.5,
                1.5,1.0, "Predkosc na wodzie w wezlach", 32.0 );
        rzeczy[idRzeczy].idRzeczy = idRzeczy;

                System.out.println();
        System.out.println("Dostepne osoby: ");
        System.out.println();

        for (i=0; i <= idOsoba; i++){
            System.out.println(lokator[i].toString());
            System.out.println();
        }

        System.out.println();
        System.out.println("Dostepne pomieszczenia: ");
        System.out.println();

        for (i=0; i <= idPomieszczenia; i++) {
            System.out.println(osiedle1[i].toString());
            System.out.println();
        }

//  Przypisania wstepne
        System.out.println("Przypisania wstepne w programie");
        System.out.println();
        lokator[0].wynajmijPomieszczenie(lokator[0], osiedle1[0]);
        lokator[0].wynajmijPomieszczenie(lokator[0], osiedle1[1]);
        lokator[0].wynajmijPomieszczenie(lokator[0], osiedle1[9]);
        lokator[0].wynajmijPomieszczenie(lokator[0], osiedle1[6]);
        lokator[0].wynajmijPomieszczenie(lokator[0], osiedle1[4]);
        lokator[1].wynajmijPomieszczenie(lokator[1], osiedle1[0]);
        lokator[2].wynajmijPomieszczenie(lokator[2], osiedle1[2]);
        osiedle1[1].listaPrzedmiotow.add(rzeczy[0]);
        osiedle1[1].listaPrzedmiotow.add(rzeczy[1]);
        osiedle1[1].listaPrzedmiotow.add(rzeczy[1]);
        osiedle1[1].listaPrzedmiotow.add(rzeczy[1]);
        osiedle1[1].listaPrzedmiotow.add(rzeczy[1]);
        osiedle1[1].listaPrzedmiotow.add(rzeczy[3]);
        osiedle1[1].listaPrzedmiotow.add(rzeczy[4]);
        osiedle1[6].listaPrzedmiotow.add(rzeczy[6]);
        osiedle1[1].listaZameldowanych.add(lokator[9]);
        osiedle1[1].listaZameldowanych.add(lokator[8]);
        osiedle1[1].listaZameldowanych.add(lokator[7]);
        osiedle1[1].listaZameldowanych.add(lokator[6]);
        osiedle1[1].listaZameldowanych.add(lokator[5]);

        System.out.println();
        System.out.println();


        //  Obsluga menu. Kod wlasciwy

        int wyborMenu = 0;
        do {
                wyborMenu = Menu.start();

            switch (wyborMenu) {

                case 1:

                    Narzedzia.wyswietl(lokator, idOsoba);
                    System.out.println("Wybranie osoby (Podaj numer najemcy): ");
                    int k = Narzedzia.skanujMaxMin0(idOsoba);
                    aktualnaOsoba = Narzedzia.utawOsobe(lokator[k]);
                    System.out.println("Wybrany najemca: " + aktualnaOsoba.toString());
                    Narzedzia.pauza();
                    break;

                case 2:

                    if(aktualnaOsoba.nazwisko == null){
                        System.out.println("Nikt nie zostal wybrany: ");
                        System.out.println("Prosze wybrac osobe/najemce (poz 1 w menu): ");

                    }
                    else{
                    System.out.println("Moje dane: ");
                    System.out.println(aktualnaOsoba.toString());
                        System.out.println("Moje wynajmy: ");
                        Osoba.mojeWynajmy(aktualnaOsoba.listaPomieszczen);
                    }
                    Narzedzia.pauza();
                    break;

                case 3:

                    System.out.println("Wszystkie pomieszczenia: ");
                    System.out.println();
                    Narzedzia.wyswietl(osiedle1, idPomieszczenia);
                    System.out.println("Wszystkie osoby: ");
                    System.out.println();
                    Narzedzia.wyswietl(lokator, idOsoba);
                    Narzedzia.pauza();
                    break;

                case 4:

                    if(aktualnaOsoba.nazwisko == null){
                        System.out.println("Nikt nie zostal wybrany: ");
                        System.out.println("Prosze wybrac osobe/najemce (poz 1 w menu): ");
                        }
                    else {
                        System.out.println("Wolne pomieszczenia: ");
                        for (i = 0; i <= idPomieszczenia; i++) {
                            if (osiedle1[i].czyWynajete == false) {
                                System.out.println(osiedle1[i].toString());
                                System.out.println();
                                }
                        }
                        System.out.println("Podaj pomieszczenie do wynajecia z listy powyzej: ");
                        int l = Narzedzia.skanujMaxMin0(idOsoba);
                        aktualnaOsoba.wynajmijPomieszczenie(aktualnaOsoba, osiedle1[l]);
                        }
                    Narzedzia.pauza();
                    break;

                case 5:

                    System.out.println("Zawartosc pomieszczenia: ");

                if(aktualnaOsoba.nazwisko == null){
                    System.out.println("Nikt nie zostal wybrany: ");
                    System.out.println("Prosze wybrac osobe/najemce (poz 1 w menu): ");
                }
                else{
                    System.out.println("Moje wynajmy: ");
                    Osoba.mojeWynajmy(aktualnaOsoba.listaPomieszczen);
                    System.out.println("Podaj numer pomieszczenia (z listy powyzej): ");
                    int n = Narzedzia.skanujMaxMin0(idPomieszczenia);
                    aktualnyNajem = Narzedzia.utawNajem(osiedle1[n]);
                    if( aktualnyNajem.listaPrzedmiotow.size() == 0 ){
                        System.out.println("Pomieszczenie jest puste. Nie zawiera zadnych przedmiotow.");}
                    else {
                    System.out.println("Zawartosc pomieszczenia: ");
                    PomieszczeniaOsiedle.printListaPrzedmiotow(aktualnyNajem.listaPrzedmiotow);
                    System.out.println("To wszystkie przedmioty: ");}
                }
                Narzedzia.pauza();
                break;

                case 6:
                    System.out.println("Zameldowanie osoby");
                    if(aktualnaOsoba.nazwisko == null){
                        System.out.println("Nikt nie zostal wybrany: ");
                        System.out.println("Prosze wybrac osobe/najemce (poz 1 w menu): ");
                    }

                    else {
                        System.out.println("Osoby do wyboru (lista jest szablonem osob, osoby wybrane raz nie znikaja z listy): ");
                        Narzedzia.wyswietl(lokator, idOsoba);
                        System.out.print("Aby zameldowac osobe w mieszkaniu");
                        System.out.println("Podaj numer osoby (z listy powyzej): ");
                        int o = Narzedzia.skanujMaxMin0(idRzeczy);
                        Osoba.mojeWynajmy(aktualnaOsoba.listaPomieszczen);
                        System.out.println("Podaj mieszkanie, do ktorego chcesz zameldowac osobe (z listy powyzej): ");
                        int p;
                        do{
                            p = Narzedzia.skanujMaxMin0(idPomieszczenia);
                            if(osiedle1[p].idNajemcy != aktualnaOsoba.idOsoby){
                                System.out.println("Tego lokalu nie wynajmujesz. Nie mozesz meldowac osob.");
                                System.out.println("Podaj poprawna wartosc z listy");
                            }
                        } while(osiedle1[p].idNajemcy != aktualnaOsoba.idOsoby);

                        PomieszczeniaOsiedle.zameldujOsobe(osiedle1[p], lokator[o]);
                    }
                    Narzedzia.pauza();
                    break;

                case 7:
                    System.out.println("Wymeldowanie osoby");
                    if(aktualnaOsoba.nazwisko == null){
                        System.out.println("Nikt nie zostal wybrany: ");
                        System.out.println("Prosze wybrac osobe/najemce (poz 1 w menu): ");
                    }

                    else {
                        Osoba.mojeWynajmy(aktualnaOsoba.listaPomieszczen);
                        System.out.println("Podaj lokal, z ktorego chcesz wymeldowac osobe (z listy powyzej): ");
                        int p;
                        do{
                            p = Narzedzia.skanujMaxMin0(idPomieszczenia);
                            if(osiedle1[p].idNajemcy != aktualnaOsoba.idOsoby){
                                System.out.println("Tego lokalu nie wynajmujesz. Nie mozesz usuwac przedmiotow.");
                                System.out.println("Podaj poprawna wartosc z listy");
                            }
                        } while(osiedle1[p].idNajemcy != aktualnaOsoba.idOsoby);
                        PomieszczeniaOsiedle.printListaOsob(osiedle1[p].listaZameldowanych);
                        System.out.print("Aby wymeldowac osobe z mieszkania )");
                        System.out.println("Podaj numer przedmiotu (z listy powyzej): ");
                        int o = Narzedzia.skanujMaxMin0(idRzeczy);

                        PomieszczeniaOsiedle.wymeldujOsobe(osiedle1[p], lokator[o]);
                    }
                    Narzedzia.pauza();
                    break;

                case 8:
//                    System.out.println("Osoby zameldowane");

                    if(aktualnaOsoba.nazwisko == null){
                        System.out.println("Nikt nie zostal wybrany: ");
                        System.out.println("Prosze wybrac osobe/najemce (poz 1 w menu): ");
                    }
                    else{
                        System.out.println("Osoby zameldowane : ");
                        Osoba.mojeWynajmy(aktualnaOsoba.listaPomieszczen);
                        System.out.println("Podaj numer pomieszczenia (z listy powyzej): ");
                        int n = Narzedzia.skanujMaxMin0(idPomieszczenia);
                        aktualnyNajem = Narzedzia.utawNajem(osiedle1[n]);
                        if( aktualnyNajem.listaZameldowanych.size() == 0 ){
                            System.out.println("Nikt nie zostal jeszcze zameldowany.");}
                        else {
                            System.out.println("Osoby zameldowane: ");
                            PomieszczeniaOsiedle.printListaOsob(aktualnyNajem.listaZameldowanych);
                            System.out.println("To wszystkie zameldowane osoby: ");}
                    }
                    Narzedzia.pauza();
                    break;

                case 9:
                    System.out.println("Wlozenie przedmiotu do pomieszczenia");
                    if(aktualnaOsoba.nazwisko == null){
                        System.out.println("Nikt nie zostal wybrany: ");
                        System.out.println("Prosze wybrac osobe/najemce (poz 1 w menu): ");
                    }

                    else {
                        System.out.println("Przedmioty do wyboru (lista jest szablonem przedmiotow, przedmioty wybrane raz nie znikaja z listy): ");
                        Narzedzia.wyswietl(rzeczy, idRzeczy);
                        System.out.print("Aby wlozyc przedmiot do pomieszczenia )");
                        System.out.println("Podaj numer przedmiotu (z listy powyzej): ");
                        int o = Narzedzia.skanujMaxMin0(idRzeczy);
                        Osoba.mojeWynajmy(aktualnaOsoba.listaPomieszczen);
                        System.out.println("Podaj lokal, do ktorego chcesz wlozyc przedmiot (z listy powyzej): ");
                        int p;
                        do{
                            p = Narzedzia.skanujMaxMin0(idPomieszczenia);
                            if(osiedle1[p].idNajemcy != aktualnaOsoba.idOsoby){
                                System.out.println("Tego lokalu nie wynajmujesz. Nie mozesz dodawac przedmiotow.");
                                System.out.println("Podaj poprawna wartosc z listy");
                            }
                        } while(osiedle1[p].idNajemcy != aktualnaOsoba.idOsoby);

                        PomieszczeniaOsiedle.dodajPrzedmiot(osiedle1[p], rzeczy[o]);
                    }
                    Narzedzia.pauza();
                    break;

                case 10:

                    System.out.println("Wyjecie przedmiotow lub pojazdow z pomieszczenia: ");
                    if(aktualnaOsoba.nazwisko == null){
                        System.out.println("Nikt nie zostal wybrany: ");
                        System.out.println("Prosze wybrac osobe/najemce (poz 1 w menu): ");
                    }

                    else {
                        Osoba.mojeWynajmy(aktualnaOsoba.listaPomieszczen);
                        System.out.println("Podaj lokal, z ktorego chcesz wyjac przedmiot (z listy powyzej): ");
                        int p;
                        do{
                            p = Narzedzia.skanujMaxMin0(idPomieszczenia);
                            if(osiedle1[p].idNajemcy != aktualnaOsoba.idOsoby){
                                System.out.println("Tego lokalu nie wynajmujesz. Nie mozesz usuwac przedmiotow.");
                                System.out.println("Podaj poprawna wartosc z listy");
                            }
                        } while(osiedle1[p].idNajemcy != aktualnaOsoba.idOsoby);
                        PomieszczeniaOsiedle.printListaPrzedmiotow(osiedle1[p].listaPrzedmiotow);
                        System.out.print("Aby wyjac przedmiot z pomieszczenia )");
                        System.out.println("Podaj numer przedmiotu (z listy powyzej): ");
                        int o = Narzedzia.skanujMaxMin0(idRzeczy);

                        PomieszczeniaOsiedle.usunPrzedmiot(osiedle1[p], rzeczy[o]);
                    }
                    Narzedzia.pauza();
                    break;

                case 11:

                    System.out.println("Zapisanie stanu osiedla do pliku: )");
                    System.out.println(lokator[0].listaPomieszczen.get(1).listaPrzedmiotow);
                    System.out.println(lokator[0].listaPomieszczen.get(1).listaZameldowanych);
//                    zapisDoPliku.zapisStanuOsoby(lokator, idOsoba);
//                    zapisDoPliku.zapisStanuOsob(aktualnaOsoba);
                    zapisDoPliku.stanOsiedla(lokator, idOsoba, osiedle1, idPomieszczenia);
//                    zapisDoPliku.sortowanie(rzeczy);
                    Narzedzia.pauza();
                    break;

                case 12:

                    if(aktualnaOsoba.nazwisko == null){
                        System.out.println("Nikt nie zostal wybrany: ");
                        System.out.println("Prosze wybrac osobe/najemce (poz 1 w menu): ");
                       }
                    else if(aktualnaOsoba.listaPomieszczen.size() == 0){
                        System.out.println("Nie masz zadnych wynajetych pomieszczen. Zeby usuwac najpierw wynajmij cos. (Poz. 4 z menu)");

                    }

                    else{
                        System.out.println("Moje wynajmy: ");
                        Osoba.mojeWynajmy(aktualnaOsoba.listaPomieszczen);
                        System.out.println("Ktory lokal chesz wypowiedziec?");
                        System.out.println("Podaj numer lokalu z powyzszej listy: ");
                        int m = Narzedzia.skanujMaxMin0(idOsoba);
                        aktualnaOsoba.wypowiedzPomieszczenie(osiedle1[m], aktualnaOsoba);
                    }
                    Narzedzia.pauza();
                    break;

                case 13:

                    System.out.println("*****************************************************");
                    System.out.println("Zakonczenie programu: ");
                    break;

                default:

                    if (wyborMenu <wielkoscMenu || wyborMenu > 1)System.out.println("Podales wartosc spoza zakresu. Wybierz poprawnie ");
                    Narzedzia.pauza();
            }
        } while (wyborMenu != wielkoscMenu);
        }
    }
