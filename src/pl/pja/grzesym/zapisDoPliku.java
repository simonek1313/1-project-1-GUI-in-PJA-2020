package pl.pja.grzesym;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;

public class zapisDoPliku {

    public static void stanOsiedla(Osoba osoba[], int idOsoba, PomieszczeniaOsiedle pomieszczenie[], int idPomieszcenia ) throws FileNotFoundException {

        PrintWriter pw = null;
//        Arrays.sort(pomieszczenie);
        try {
            pw = new PrintWriter("stanOsiedla.txt");
            for (int i = 0; i <= idOsoba; i++) {
                pw.println("Osoba: ");
                pw.println(osoba[i]);
                pw.println();
                Collections.sort(osoba[i].listaPomieszczen);
                int j =0 ;
//                for (j = 0; j < osoba[i].listaPomieszczen.size(); j++)
//                    if (osoba[i].idOsoby == pomieszczenie[j].idNajemcy) {
                    for (PomieszczeniaOsiedle ele : osoba[i].listaPomieszczen) {
                        pw.println("   Wynajete pomieszczenie: ");
                        pw.println(ele);
                        pw.println();
                        pw.println("          Lista przedmiotow: ");
                        int nr = ele.idNieruchomosci;
                        Collections.sort((pomieszczenie[nr].listaPrzedmiotow));
                        for (Rzecz ele1 : pomieszczenie[nr].listaPrzedmiotow) {
                            pw.println(ele1);
                        }
                        pw.println();
                        pw.println("          Zameldowane osoby: ");
                        for (Osoba ele2 : (pomieszczenie[nr].listaZameldowanych)) {
                            pw.println("               " + ele2);

                        }
                        pw.println();
//                    }
//                        pw.println();
//                        pw.println("          Lista przedmiotow: ");
//                        Collections.sort((pomieszczenie[j].listaPrzedmiotow));
//                        Arrays.sort(new ArrayList[]{(pomieszczenie[j].listaPrzedmiotow)});
//                        for (Rzecz ele : pomieszczenie[j].listaPrzedmiotow) {
//                            pw.println(ele);
//                        }
//                        pw.println();
//                        pw.println("          Zameldowane osoby: ");
//                        for (Osoba ele : pomieszczenie[j].listaZameldowanych) {
//                            pw.println("               " + ele);
//                        }
//                        pw.println();
                    }
//                pw.println();
//                pw.println();
            }
        }finally {
            if (pw !=  null )
                pw.close();
        }

    }


}
