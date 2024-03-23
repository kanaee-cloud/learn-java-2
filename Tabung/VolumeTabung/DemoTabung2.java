package VolumeTabung;

class DemoTabung2 {
    public static void main(String[] args) {
        double volume1, volume2;
        double pi = 3.14;

        Tabungs t1 = new Tabungs();
        Tabungs t2 = new Tabungs();

        t1.jari = 30;
        t1.tinggi = 15;

        t2.jari = 6;
        t2.tinggi = 9;

        volume1 = pi * t1.jari * t1.jari * t1.tinggi;
        volume2 = pi * t2.jari * t2.jari * t2.tinggi;

        System.out.println("Volume tabung 1 " + volume1);
        System.out.println("Volume tabung 2 " + volume2);
    }
}