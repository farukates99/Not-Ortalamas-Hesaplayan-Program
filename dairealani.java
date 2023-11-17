import java.util.Scanner;

public class dairealani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("yarıçapı giriniz: ");
        int r = input.nextInt();
        System.out.println("merkez açıyı giriniz: ");
        int acı= input.nextInt();
        double pi=3.14;
        double total=(pi * (r*r) * acı) / 360;
        System.out.println(total);
    }
}
