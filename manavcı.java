import java.util.Scanner;

public class manavcı {
    public static void main(String[] args) {
        Scanner ders = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        int armut=ders.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        int elma=ders.nextInt();
        System.out.print("Domates Kaç Kilo ?:");
        int domates=ders.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        int muz=ders.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :");
        int patlıcan=ders.nextInt();
        double toplam= armut*2.14+elma*3.67 +domates*1.11 +muz*0.95+ patlıcan*5.00;
        System.out.println("Toplam Tutar :"+ toplam + "TL");
    }
}
