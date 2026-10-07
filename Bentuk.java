public class Bentuk {
    //attributnye
    public String warna;

    //constructornye
    public Bentuk (String warna) {
        this.warna = warna;
    }

    //setter and getter yah
    public String getWarna () {
        return warna;
    }

    public void setWarna (String warna) {
        this.warna = warna;
    }
    
    //methodsnye
    public void printInfo () {
        System.out.println ("Bentuk Berwarna: " + this.warna);
    }
    }