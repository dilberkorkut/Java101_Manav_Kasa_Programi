import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlican;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kac Kilo?: ");
        armut = input.nextDouble();

        System.out.print("Elma Kac Kilo?: ");
        elma = input.nextDouble();

        System.out.print("Domates Kac Kilo?: ");
        domates = input.nextDouble();

        System.out.print("Muz Kac Kilo?: ");
        muz = input.nextDouble();

        System.out.print("Patlican Kac Kilo?: ");
        patlican = input.nextDouble();

        double totalArmut, totalElma, totalDomates, totalMuz, totalPatlican;
        double  aKg = 2.14 , eKg= 3.67, dKg = 1.11, mKg = 0.95, pKg = 5.00;

        totalArmut = armut * aKg;
        totalElma = elma * eKg;
        totalDomates = domates * dKg;
        totalMuz = muz * mKg;
        totalPatlican = patlican * pKg;

        double total = totalArmut + totalElma + totalDomates + totalMuz + totalPatlican;
        System.out.println("Toplam Tutar : " + total);

    }
}