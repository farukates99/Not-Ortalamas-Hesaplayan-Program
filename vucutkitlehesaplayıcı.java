import java.util.Scanner;

public class vucutkitlehesaplayıcı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        float boy = input.nextFloat();
        System.out.print ("Lütfen kilonuzu giriniz :  ");
        float kilo= input.nextFloat();

        System.out.println(kilo/(boy*boy));
    }
}
