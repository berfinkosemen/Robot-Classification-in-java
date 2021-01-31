
package robotprojesi;
import java.util.ArrayList;
import java.util.Scanner;

public class Paletli extends GezginRobotlar{
    int paletSayisi;
    Scanner keyboard = new Scanner(System.in);
    
   String [] yonSiralamasi;
    int yonSayisi = 0;
    
    ArrayList <String> yonAdlari = new ArrayList <String> ();
    
    public Paletli(String robotTipi, int motorSayisi, int yukMiktari, float gezinmeHizi, int paletSayisi) { // tum ozelliklerin bulundugu constructor
        this.robotTipi = robotTipi;
        this.motorSayisi = motorSayisi;
        this.yukMiktari = yukMiktari;
        this.gezinmeHizi = gezinmeHizi;
        this.paletSayisi = paletSayisi;
    }

    @Override
    public void hedefeUlasildiMi(){
        j=0;
        j1=0;
        j2=0;
        j3=0;
        sayac1 = 0;
        sayac2 = 0;
        c=0;
        while(c != -1){
            System.out.println("Hangi yone ilerleyeceksiniz : ");
            yon = keyboard.next();
            
            yonSayisi++;
            yonAdlari.add(yon);
            
            
            if("sag".equals(yon)){
                System.out.println("saga kac birim ilerleyeceksiniz : ");
                dizisag[j] = keyboard.nextInt();
                b += dizisag[j];
                
                for(k=0;k<2*engelSayisi;k+=2){
                    for(i=b1+1 ; i<=b ; i++){
                        if(engeller[k] == i && engeller[k+1] == d1)
                            sayac1++;  
                    }
                }
            
                if(b > 20){
                    b -= dizisag[j];
                    dizisag[j] = 20-b;
                    b += dizisag[j];
                    System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac2 += b-b1;
                    b1 = b;
                    j++;
                    break;
                }
               
                sayac2 += b-b1;
                b1 = b;
                j++;
            }
            if("sol".equals(yon)){
                System.out.println("sola kac birim ilerleyeceksiniz : ");
                dizisol[j1] = keyboard.nextInt();
                b -= dizisol[j1];
                
                for(k=0;k<2*engelSayisi;k+=2){
                    for(i=b ; i<=b1-1 ; i++){
                        if(engeller[k] == i && engeller[k+1] == d1)
                            sayac1++;  
                    }
                }
                
                if(b <= 0){
                    b += dizisol[j1];
                    dizisol[j1] = b-1;
                    b -= dizisol[j1];
                    System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac2 += b1-b;
                    b1 = b;
                    j1++;
                    break;
                }
                
                sayac2 += b1-b;
                b1 = b;
                j1++;
            }
            if("yukari".equals(yon)){
                System.out.println("yukari kac birim ilerleyeceksiniz : ");
                diziyukari[j2] = keyboard.nextInt();
                d -= diziyukari[j2];
                
                for(k=0;k<2*engelSayisi;k+=2){
                    for(i=d ; i<=d1-1 ; i++){
                        if(engeller[k] == b1 && engeller[k+1] == i)
                            sayac1++;  
                    }
                }
                
                if(d <= 0){
                    d += diziyukari[j2];
                        diziyukari[j2] = d-1;
                        d -= diziyukari[j2];
                        System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                        sayac2 += d1-d;
                        d1 = d;
                        j2++;
                        break;
                }
                
                sayac2 += d1-d;
                d1 = d;
                j2++;
            }  
            if("asagi".equals(yon)){
                System.out.println("asagi kac birim ilerleyeceksiniz : ");
                diziasagi[j3] = keyboard.nextInt();
                d += diziasagi[j3];
                
                for(k=0;k<2*engelSayisi;k+=2){
                    for(i=d1+1 ; i<=d ; i++){
                        if(engeller[k] == b1 && engeller[k+1] == i)
                            sayac1++;  
                    }
                }
                
                if(d > 20){
                    d -= diziasagi[j3];
                    diziasagi[j3] = 20-d;
                    d += diziasagi[j3];
                    System.out.println("izgaradan ciktiniz.Program sonlandirilacak : ");
                    sayac2 += d-d1;
                    d1 = d;
                    j3++;
                    break;
                }
                
                sayac2 += d-d1;
                d1 = d;
                j3++;
            }
            System.out.println("hedefe ulasildi ise -1 giriniz : ");
            c = keyboard.nextInt();
            
        }
        sayac2 -=sayac1;
        
        
        yonSiralamasi = new String[yonSayisi];
        for(int t=0; t<yonAdlari.size(); t++) {
            yonSiralamasi[t] = yonAdlari.get(t);
        }
        
    }
    
    public String yonSir(int i) {
        return yonSiralamasi[i];
    }


    @Override
    public float EngelGecmeSuresiBul() {
        return (motorSayisi * 3);
    }

    @Override
    public void toplamSureHesaplama() {
        a += sayac1*EngelGecmeSuresiBul();
        gezinmeSuresi = 10*sayac2/gezinmeHizi;
        a += gezinmeSuresi;
        System.out.println(" " +a);
    }
    
     
}
