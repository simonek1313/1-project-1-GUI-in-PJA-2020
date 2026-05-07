package pl.pja.grzesym;
import java.io.IOException;
import java.util.Scanner;


public class Menu {

    public static int start() throws IOException {

        System.out.println("***************************************************************************************");
        System.out.println("***                                    Menu programu                                ***");
        System.out.println("***************************************************************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("1 - Wybranie osoby.");
        System.out.println("2 - Moje dane i wynajmy");
        System.out.println("3 - Lista pomieszczen i osob");
        System.out.println("4 - Wynajecie pomieszczenia");
        System.out.println("5 - Zawartosc pomieszczenia ");
        System.out.println("6 - Zameldowanie osoby ");
        System.out.println("7 - Wymeldowanie osoby ");
        System.out.println("8 - Osoby zameldowane");
        System.out.println("9 - Wlozenie pojazdu lub przemiotu do pomieszczenia");
        System.out.println("10 - Wyjecie przedmiotow lub pojazdow z pomieszczenia");
        System.out.println("11 - Zapisanie stanu osiedla do pliku");
        System.out.println("12 - Wypowiedzenie najmu (rowniez eksmisja)");
        System.out.println("13 - Wyjscie/Zakonczenie programu");
        System.out.println(" ");
        System.out.println("Podaj liczbe (1-13):");

        Scanner scan = new Scanner(System.in);
        int M = 0;
        M = Narzedzia.skanujInt();
        return M;

        }

    }

