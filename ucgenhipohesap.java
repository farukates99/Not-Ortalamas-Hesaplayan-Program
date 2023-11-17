import java.util.Scanner;

public class ucgenhipohesap {
 public static void main(String[] args) {
            Scanner uzunluk = new Scanner(System.in);
            System.out.println("1. kenar uzunlugu: ");
            float a = uzunluk.nextFloat();
            System.out.println("2. kenar uzunlugu: ");
            float b = uzunluk.nextFloat();
            System.out.println("3. kenar uzunlugu: ");
            float c = uzunluk.nextFloat();
            float 𝑢 = (a+b+c) / 2;
            float alan = 𝑢 * (𝑢-a)* (𝑢-b) * (𝑢-c);

            System.out.println(Math.sqrt(alan));
        }
    }
