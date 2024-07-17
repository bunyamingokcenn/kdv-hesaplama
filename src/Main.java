import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double fiyat, kdv = 0.18, satisFiyat, kdvliFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Kdv'siz fiyat girin: ");
        fiyat = input.nextDouble();

        kdvliFiyat = fiyat*kdv;
        satisFiyat = fiyat + kdvliFiyat;

        System.out.println("Kdv'siz fiyat: " + fiyat);
        System.out.println("Kdv Oranı: " + kdv);
        System.out.println("Kdv tutarı: " + kdvliFiyat);
        System.out.println("Kdv'li fiyat: " + satisFiyat);


    }
}