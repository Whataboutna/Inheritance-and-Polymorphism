public class BujurSangkar extends Bentuk {
    //attributnya
    private double sisi;

    //constructornya
    public BujurSangkar (double sisi, String warna) {
        super(warna); //menuju ke parentnya
        this.sisi = sisi;
    }

    //getter and setter
    public double getSisi() {
        return sisi;
    }

    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    //methods
    public double hitungLuas () {
        return getSisi() * getSisi();
    }

    @Override
    public void printInfo () {
        System.out.println("Bentuk Berwarna: " + this.warna + ", dan Luas: " + hitungLuas());
    }
}