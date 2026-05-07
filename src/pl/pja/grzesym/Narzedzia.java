package pl.pja.grzesym;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Narzedzia implements InterfaceNarzedzia {

    public static void pauza() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWciśnij Enter, aby kontynuować...");
        System.in.read();

    }

    public static int skanujInt(){
        Scanner scan = new Scanner(System.in);
        int M = 0;
        boolean err = true;
        do {
            try {
                M = scan.nextInt();
                err = false;
            } catch (InputMismatchException e) {
                System.out.println("Podales niepoprawna wartosc. Sprobuj ponownie: ");
                scan.nextLine();
            }
        } while (err);
        return M;
    }

    public static int skanujMaxMin0(int max){
        Scanner scan = new Scanner(System.in);
        int M = 0;
        boolean err = true;
        do {
            do {
                try {
                    M = scan.nextInt();
                    err = false;
                } catch (InputMismatchException e) {
                    System.out.println("Podales niepoprawna wartosc. Sprobuj ponownie: ");
                    scan.nextLine();
                }
            } while (err);
            if(M < 0|| M >max){
                System.out.println("Niepoprawna wartosc, sprobuj jeszcze raz: ");
            }
        }while (M < 0|| M >max);
        return M;
    }

    public static void wyswietl(Osoba[] osoba, int iD) {
        for (int i = 0; i <= iD; i++) {
            System.out.println(osoba[i].toString());
            System.out.println();
        }
    }
    public static void wyswietl(PomieszczeniaOsiedle[] osiedle, int iD) {
        for (int i = 0; i <= iD; i++) {
            System.out.println(osiedle[i].toString());
            System.out.println();
        }
    }
    public static void wyswietl(Rzecz[] rzeczy, int iD) {
        for (int i = 0; i <= iD; i++) {
            System.out.println(rzeczy[i].toString());
            System.out.println();
        }
    }

    public static Osoba utawOsobe(Osoba osoba){
        return osoba;
    }

    public static PomieszczeniaOsiedle utawNajem(PomieszczeniaOsiedle aktualnynajem){
        return aktualnynajem;
    }

}


