package LuasLingkaran;

import java.util.Scanner;

public class LingkaranTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari-jari : ");
        double jari = input.nextDouble();

        Lingkaran meja = new Lingkaran();
        meja.setJari(jari);
       

        System.out.println();
        System.out.println("Jari-jarinya     :" + meja.getJari());
        System.out.println("Luasnya          :" + meja.HitungLuas());
    }
}

