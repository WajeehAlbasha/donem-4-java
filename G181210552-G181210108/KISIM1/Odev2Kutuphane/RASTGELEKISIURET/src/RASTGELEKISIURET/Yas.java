package RASTGELEKISIURET;

import RASTGELEKISIURET.Rastgele;

/**
*
* @author wajeeh bacha wajeeh.bacha@ogr.sakarya.edu.tr ---- mertcan yaman mertcan.yaman@ogr.sakarya.edu.tr
* @since 26/04/2020
* <p>
* Yas sınıfında 0-100 aralığında yaş üretilmektedir.
* </p>
*/
public class Yas {

    Rastgele rakamuret = new Rastgele(100);

    public int Yas() {
        return rakamuret.nextInt();
    }
}
