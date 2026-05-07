package pl.pja.grzesym;

import java.io.*;

public class zapisDoPliku {

    public static void stanOsiedla(Osoba osoba[], int idOsoba, PomieszczeniaOsiedle pomieszczenie[], int idPomieszcenia) throws FileNotFoundException {

        PrintWriter pw = null;

        try {
            pw = new PrintWriter("stanOsiedla.txt");
            for (int i = 0; i <= idOsoba; i++) {
                pw.println("Osoba: ");
                pw.println(osoba[i]);
                pw.println();

                for (int j = 0; j <= idOsoba; j++)
                    if (osoba[i].idOsoby == pomieszczenie[j].idNajemcy) {

                        pw.println("   Wynajete pomieszczenie: ");
                        pw.println(pomieszczenie[j]);
                        pw.println();
                        pw.println("          Lista przedmiotow: ");

                        for (Rzecz ele : pomieszczenie[j].listaPrzedmiotow) {
                            pw.println(ele);
                        }
                        pw.println();
                        pw.println("          Zameldowane osoby: ");
                        for (Osoba ele : pomieszczenie[j].listaZameldowanych) {
                            pw.println("               " + ele);
                        }
                        pw.println();
                    }
                pw.println();
                pw.println();
            }
        }finally {
            if (pw !=  null )
                pw.close();
        }
    }
}
