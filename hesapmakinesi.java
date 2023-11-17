import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner ders = new Scanner(System.in);
        System.out.println("matematik notu:");
        int matematik=ders.nextInt();
        System.out.println("fizik notu:");
        int fizik=ders.nextInt();
        System.out.println("kimya notu:");
        int kimya=ders.nextInt();
        System.out.println("tarih notu:");
        int tarih=ders.nextInt();
        System.out.println("muzik notu:");
        int muzik=ders.nextInt();
        float toplam=(matematik+fizik+kimya+tarih+muzik)/5;
        System.out.println("ortalamanız: "+ toplam);
        String b = (toplam >= 60) ? "gecti": "kaldı";
        System.out.println(b);
    }
}