import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner mes = new Scanner(System.in);
        System.out.println("mesafeyi kilometre cinsinden giriniz: ");
        int mesafe = mes.nextInt();
        double kmbasına=2.20;
        double total=mesafe*kmbasına+10;
        double minucret = (total >= 20) ? total : 20;
        System.out.println(minucret1);
    }
}
