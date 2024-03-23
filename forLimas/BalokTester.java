package forLimas;

import java.util.Scanner;

public class BalokTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang     : ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan Lebar     : ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan Tinggi   : ");
        double tinggi = input.nextDouble();

        Balok meja = new Balok();
        meja.setPanjang(panjang);
        meja.setLebar(lebar);
        meja.setTinggi(tinggi);

        System.out.println();
        System.out.println("Alas         :" + meja.getPanjang());
        System.out.println("Lebar        :" + meja.getLebar());
        System.out.println("Tinggi       :" + meja.getTinggi());
        System.out.println("Volume       :" + meja.HitungVolume());
    }
}
