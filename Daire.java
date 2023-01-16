import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        //Değişkenlerin girilmesi.

        int r,alfa;
        double pi=3.14,Alan,Cevre,DilimAlan;

        //Dairenin yarıçapı ve alfa açısının girilmesi.

        Scanner inp=new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r=inp.nextInt();

        System.out.print("Dairenin Alfa Açısını Giriniz: ");
        alfa=inp.nextInt();

        //Daire ile ilgili hesaplamalar.

        Alan=pi*(r*r);
        Cevre=2*pi*r;
        int i=360;
        DilimAlan=(pi*(r*r)*alfa)/(i);

        //Sonuçların ekranda yazılması.

        System.out.println("Dairenin Alanı: " + Alan);
        System.out.println("Dairenin Cevresi: " + Cevre);
        System.out.println("Dairenin Dilim Alanı: " + DilimAlan);
    }
}