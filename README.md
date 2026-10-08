# Program Bentuk Geometri (PBO / Java)

Program Java interaktif ini dibuat untuk mengimplementasikan konsep-konsep dasar Pemrograman Berorientasi Objek (PBO) seperti **Encapsulation**, **Inheritance**, dan **Polymorphism** melalui pemrosesan bentuk geometri (Bujur Sangkar, Lingkaran, dan Silinder).

---

## 📋 Information of the Code

Program ini terdiri dari 5 kelas Java yang saling berhubungan:

| Berkas | Keterangan |
| --- | --- |
| `Bentuk.java` | **Superclass (Kelas Induk)** yang menyimpan atribut umum `warna` serta menyediakan method `getWarna()`, `setWarna()`, dan `printInfo()`. |
| `BujurSangkar.java` | **Subclass** turunan langsung dari `Bentuk` yang menangani atribut `sisi` dan perhitungan luas persegi. |
| `Lingkaran.java` | **Subclass** turunan langsung dari `Bentuk` yang menyimpan atribut `radius`, konstanta `phi`, dan perhitungan luas lingkaran. |
| `Silinder.java` | **Subclass** turunan dari `Lingkaran` yang menambahkan atribut `tinggi` untuk menghitung volume silinder. |
| `MainBentuk.java` | **Class Utama (Main Class)** yang berisi menu interaktif berbasis `while` loop, `switch-case`, serta penanganan kesalahan input (`InputMismatchException`). |

---

## 🔒 Example & Explanation of Encapsulation

Encapsulation (Penskapsulan) adalah konsep pembungkusan data dan method ke dalam satu unit, serta membatasi akses langsung ke atribut internal kelas menggunakan akses modifier (private). Akses nilai hanya diberikan melalui method publik (getter dan setter).

Contoh pada Kode (BujurSangkar.java):
Atribut sisi dideklarasikan secara private agar nilainya tidak bisa diubah secara sembarangan dari luar kelas.

public class BujurSangkar extends Bentuk {
    // Atribut privat (disembunyikan dari luar kelas)
    private double sisi;

    // Getter untuk membaca nilai sisi
    public double getSisi() {
        return sisi;
    }

    // Setter untuk mengubah nilai sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}

---

## 🧬 Example & Explanation of Inheritance

Inheritance (Pewarisan) adalah mekanisme di mana sebuah kelas (subclass) menerima atribut dan method dari kelas lain (superclass) menggunakan kata kunci extends. Hal ini memungkinkan penggunaan kembali kode (reusability).

Contoh pada Kode (Lingkaran.java dan Silinder.java):

1. Pewarisan Tingkat Pertama (Bentuk -> Lingkaran):
Kelas Lingkaran mewarisi atribut warna dari kelas Bentuk dan memanggil konstruktor induk menggunakan super(warna).

public class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(double radius, String warna) {
        super(warna); // Memanggil konstruktor superclass Bentuk
        this.radius = radius;
    }
}

2. Pewarisan Multi-tingkat (Lingkaran -> Silinder):
Kelas Silinder mewarisi perhitungan radius dan konstanta phi dari kelas Lingkaran.

public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna); // Memanggil konstruktor superclass Lingkaran
        this.tinggi = tinggi;
    }
}

---

## 🎭 Example & Explanation of Polymorphism

Polymorphism (Banyak Bentuk) adalah kemampuan suatu objek atau method untuk memiliki banyak bentuk atau perilaku berbeda. Dalam program ini, polimorfisme diterapkan melalui Method Overriding (@Override), di mana subclass menulis ulang implementasi method printInfo() yang diwarisi dari superclass.

Contoh pada Kode (printInfo()):

Method printInfo() didefinisikan pada kelas induk Bentuk, tetapi setiap kelas anak memiliki tampilan output yang disesuaikan:

- Implementasi pada Kelas Induk (Bentuk.java):
public void printInfo() {
    System.out.println("Bentuk Berwarna: " + this.warna);
}

- Overriding pada BujurSangkar.java:
@Override
public void printInfo() {
    System.out.println("Bentuk Berwarna: " + this.warna + ", dan Luas: " + hitungLuas());
}

- Overriding pada Silinder.java:
@Override
public void printInfo() {
    System.out.println("Silinder Berwarna: " + this.warna + ", Volume: " + hitungVolume());
}

---

## 🚀 How to Run

Berikut adalah langkah-langkah untuk menjalankan program ini di komputer Anda:

1. Persyaratan Sistem
Pastikan Java Development Kit (JDK) sudah terinstal. Periksa melalui terminal/command prompt:
javac -version
java -version

2. Kompilasi Seluruh Berkas Java
Buka terminal pada direktori tempat file .java disimpan, lalu jalankan perintah kompilasi:
javac *.java

3. Jalankan Program Utama
Jalankan kelas MainBentuk untuk membuka menu interaktif:
java MainBentuk

4. Alur Penggunaan Program
Saat program berjalan, Anda akan dihadapkan pada menu utama:
- Pilih opsi 1 untuk perhitungan Bujur Sangkar, 2 untuk Lingkaran, atau 3 untuk Silinder.
- Masukkan parameter warna dan ukuran (sisi/radius/tinggi) yang diminta.
- Program akan menampilkan hasil perhitungan beserta warna bentuk.
- Masukkan angka 0 untuk keluar dari program.