package forLimas;

public class Balok {
    public double panjang;
    public double tinggi;
    public double lebar;
    public double volume;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double HitungVolume() {
        volume = panjang * lebar * tinggi;
        return volume;
    }
}
