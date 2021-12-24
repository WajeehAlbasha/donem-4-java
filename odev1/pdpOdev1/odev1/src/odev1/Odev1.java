/**
*
* @author Mertcan Yaman(G181210108) mertcan.yaman@ogr.sakarya.edu.tr - wajeeh bacha(G181210552) wajeeh.bacha@ogr.sakarya.edu.tr  
* @since 08.03.2020
* <p>
* Programlama Dillerinin Prensipleri 2. Öğretim A Grubu
* </p>
*/

package odev1;

import java.io.*;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Odev1 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File file = new File("sa.txt"); //sa.txt adlı text dosyasını okuyoruz
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
        //Sayacları integer olarak tanımladık ve 0 atadık
        int sesSayac=0;
        int kelimeSayac=0;
        int cumleSayac=0;
        int mailSayac=0;
        int webSayac=0;
        int harfSayac=0;
        
        
        
        //sesli harfleri bulmak için sesli harfleri char dizisine atıyoruz
        char sesliler[]={'A','a','E','e','İ','i','O','o','U','u','ı','I','Ö','ö','Ü','ü'};
        
        // NULL'a kadar dosyayı satır satır okuyoruz,,
        while((line = reader.readLine()) != null) 
        { 
            //emailleri bulmak için aradığımız gereksinimleri regex düzeni ile tanımladık
            Pattern mail= Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
            Matcher mailM =mail.matcher(line);
            //while dögüsü ile aradığımız gereksinimleri buluncaya kadar dödürüyoruz bulunca da mailsayacı 1 arttırıyoruz
            while(mailM.find()){
                mailSayac++;    
            } 
            //emailleri bulmak için aradığımız gereksinimleri regex düzeni ile tanımladık
            Pattern cumle= Pattern.compile("[a-z][.][ ]");
            Matcher cumleM =cumle.matcher(line);
            //while dögüsü ile aradığımız gereksinimleri buluncaya kadar dödürüyoruz bulunca da cumlesayacı 1 arttırıyoruz
            while(cumleM.find()){
                cumleSayac++;    
            }    
            
            if(!(line.equals(""))) 
            { 
                harfSayac += line.length(); 
                
                for(int i=0;i<line.length();i++){
                char c ;
                //okuduğumuz harfi char c'ye atıyoruz
                c=line.charAt(i);
                harfSayac++;
                    //for döngüsü ile satırlar daki sesli harfleri sayıyoruz
                    for( int j=0;j<sesliler.length;j++){
                    if(c==sesliler[j])
                        
                        sesSayac++;
                    }
                }
                
                // \\s+ space tuşunun ifadesini kullanarak kelime sayisini buluyoruz
                String[] wordList = line.split("\\s+"); 
                kelimeSayac += wordList.length; 
            } 
            //emailleri bulmak için aradığımız gereksinimleri regex düzeni ile tanımladık
            Pattern web= Pattern.compile(".com|.edu|.net|.org|.com.tr|.edu.tr|.net.tr|.org.tr");
            Matcher webM =web.matcher(line);
             //while dögüsü ile aradığımız gereksinimleri buluncaya kadar dödürüyoruz bulunca da cumlesayacı 1 arttırıyoruz
            while(webM.find()){
                webSayac++;   
                
            }
            
        }
        //yaptığımız regexler de mail olup web sitesi sayılmaması için web sayısından mail sayısını çıkartıyoruz
        webSayac=webSayac-mailSayac;
        //Bizden istenen verileri ekrana bastırıyoruz   
        System.out.println("Toplam Sesli Harf Sayısı : "+ sesSayac);
        System.out.println("Toplam Kelime Sayisi : " + kelimeSayac);
        System.out.println("Toplam Cumle Sayısı : "+ cumleSayac);
        System.out.println("Toplam Mail Sayisi : " + mailSayac);
        System.out.println("toplam Web Sitesi Sayisi : " + webSayac);
    }
}    
        
        
  