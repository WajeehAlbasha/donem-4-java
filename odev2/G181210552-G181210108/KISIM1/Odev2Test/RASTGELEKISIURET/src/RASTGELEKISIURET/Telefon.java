package RASTGELEKISIURET;

import RASTGELEKISIURET.Rastgele;

/**
*
* @author wajeeh bacha wajeeh.bacha@ogr.sakarya.edu.tr ---- mertcan yaman mertcan.yaman@ogr.sakarya.edu.tr
* @since 26/04/2020
* <p>
* Telefon sınıfında Türkiyedeki telefon numaralarına uygun üretilmektedir.
* </p>
*/
public class Telefon {

    private final Rastgele rakamuret = new Rastgele(10);
    private String TelNumarasi = "";

    public String Telefon() {
        TelNumarasi = "";
        int TelDizi[] = new int[11];
        TelDizi[0] = 0;
        TelDizi[1] = 5;
        TelDizi[2] = rakamuret.nextInt() + 2;
        while (TelDizi[2] < 3 || TelDizi[2] > 5) {
            TelDizi[2] = rakamuret.nextInt() + 2;
        }
        for (int a = 3; a < 11; a++) {
            TelDizi[a] = rakamuret.nextInt();
        }
        for (int a = 0; a < 11; a++) {
            TelNumarasi += TelDizi[a];
        }
        return TelNumarasi;
    }
}
