public class Silinder extends Bentuk {
    //atributnya
    private double tinggi;

    //constructor
    public Silinder (double tinggi, double radius, String warna) {
        this.tinggi = tinggi;
        super(radius, warna);
    }

    //getter and setter
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi (double tinggi) {
        this.tinggi = tinggi;
    }

    //methods
    public double hitungVolume () {
        return Lingkaran.phi * getRadius() * get.Tinggi;
    }

    @Override
    public void printInfo () {
        System.out.println("Silinder Berwarna: " + this.warna + ", Volume: " + volume());
    }
}