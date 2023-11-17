import java.util.Scanner;

public class kdvhesap {
    public static void main(String[] args) {
        Scanner tutar = new Scanner(System.in);
        System.out.println("ürünün ücretini giriniz:");
        int fiyat = tutar.nextInt();
        double kdv = (fiyat >= 1000) ? 1.08 : 1.18;
        double kdvli = kdv * fiyat;
        double kdvdeger = kdvli - fiyat;
        System.out.println("fiyat= " + fiyat + "\nKDV'li = "+kdvli+"\nKDV=" + kdvdeger);
    }
}

