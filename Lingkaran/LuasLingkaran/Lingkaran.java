package LuasLingkaran;

public class Lingkaran {
    public double jari;
    public double phi = 3.14;
    public double luas;

    public void setJari(double jari) {
        this.jari = jari;
    }

    public void setPhi(double phi) {
        this.phi = 3.14;
    }

    public double getJari() {
        return jari;
    }

    public double getPhi() {
        return phi;
    }

    public double HitungLuas() {
        luas = jari * jari * phi;
        return luas;
    }
}
