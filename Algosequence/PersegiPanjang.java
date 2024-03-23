package Algosequence;

public class PersegiPanjang {
    public double panjang;
    public double lebar;
    public double luas;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double HitungLuas() {
        luas = panjang * lebar;
        return luas;
    }
}
