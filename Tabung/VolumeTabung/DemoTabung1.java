package VolumeTabung;

class Tabung {
    double jari;
    double tinggi;
}

public class DemoTabung1 {
   public static void main(String[] args) {
    Tabung t = new Tabung(); 
    double pi = 3.14;

    t.jari = 10;
    t.tinggi = 15;

    double kuadrat = t.jari * t.jari;
    double volume = pi * kuadrat * t.tinggi;

    System.out.println("Volume tabung adalah: " + volume);
   } 
}