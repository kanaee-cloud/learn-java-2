package VolumeTabung;

class Tabungs {
    double jari;
    double phi;
    double tinggi;

    void isiData(double j, double p, double t){
        jari = j;
        phi = p;
        tinggi = t;
    }

    double hitungVolume() {
        return (jari * jari * phi * tinggi);
    }
}

class DemoMethod3{
    public static void main(String[] args) {
        
        Tabungs t;

        t = new Tabungs();

        t.isiData(9,3.14,15);

        System.out.println("Volume kotak = " + t.hitungVolume());
    }
}