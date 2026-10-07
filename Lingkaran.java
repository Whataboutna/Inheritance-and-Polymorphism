public class Lingkaran extends Bentuk {
    //attributnya
    public static final double phi = 3.14159; //pakai final biar nilainya konstan, 
    private double radius;

    //constructor
    public Lingkaran (double radius, String warna) {
        this.radius = radius;
        super(warna);
    }

    //getter and setter
    public double getRadius() {
        return radius;
    }

    public void getRadius (double radius) {
        this.radius = radius;
    }

    //methods
    public double hitungLuas () {
        return phi * (getRadius() * getRadius());
    }

    @Override
    public void printInfo () {
        System.out.println("Lingkaran Berwarna: " + getWarna() + ", Luas: " + hitungLuas());
    }
}