/**
*
* @author wajeeh bacha wajeeh.bacha@ogr.sakarya.edu.tr ---- mertcan yaman mertcan.yaman@ogr.sakarya.edu.tr
* @since 26/04/2020
* <p>
* Bu sınıf rastgeleliği sağlamaktadır.
* </p>
*/
package RASTGELEKISIURET;

public class Rastgele {
    
    private int max;
    private int last;
    
    public Rastgele(int max){
        this.max = max;
        last = (int) (System.currentTimeMillis() % max);
    }  
    public int nextInt(){
    last = (last * 32719 + 3) % 32749;
    return last % max;
    }
}
