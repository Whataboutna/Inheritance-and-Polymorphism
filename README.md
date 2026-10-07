 # Inheritance and Polymorphism

Repositori ini berisi proyek Java untuk mempelajari **inheritance (pewarisan)** dan **polymorphism (polimorfisme)** dalam Pemrograman Berorientasi Objek (PBO).

## Tujuan

- Memahami hubungan kelas induk (*superclass*) dan kelas turunan (*subclass*).
- Menggunakan `extends` untuk mewarisi dan memperluas perilaku kelas.
- Memahami konstruktor kelas dan pemanggilan konstruktor induk dengan `super`.
- Menerapkan *method overriding* pada kelas turunan.
- Mengamati polimorfisme melalui referensi kelas induk yang menyimpan objek kelas turunan.
- Memahami bahwa implementasi metode yang di-override dipilih berdasarkan tipe objek aktual saat runtime.

## Konsep

### Inheritance

Pewarisan memungkinkan kelas turunan memperoleh anggota kelas induk dan menambahkan perilaku yang lebih spesifik. Gunakan pewarisan untuk merepresentasikan hubungan *is-a*.

```java
class KelasTurunan extends KelasInduk {
	// Perilaku atau data khusus kelas turunan
}
```

### Polymorphism

Polimorfisme memungkinkan objek turunan digunakan melalui referensi bertipe induk. Ketika metode instance di-override, Java menjalankan implementasi milik tipe objek aktual.

```java
KelasInduk objek = new KelasTurunan();
objek.metode();
```
## Run Program

1. Buka direktori proyek di terminal atau IDE.
2. Periksa berkas Java dan temukan kelas yang memiliki `public static void main(String[] args)`.
3. Kompilasikan berkas sumber sesuai struktur proyek. Untuk satu berkas tanpa deklarasi paket:

   ```bash
   javac NamaKelas.java
   java NamaKelas
   ```

Untuk beberapa berkas atau proyek yang menggunakan `package`, kompilasikan dari direktori sumber dengan struktur paket dan *classpath* yang sesuai. Ganti `NamaKelas` dengan nama kelas utama yang benar-benar tersedia di proyek.

## Panduan Membaca Kode

1. Identifikasi kelas induk dan kelas-kelas yang mewarisinya.
2. Periksa konstruktor, atribut, serta metode yang diwarisi atau ditambahkan.
3. Cari metode yang di-override dan bandingkan implementasinya.
4. Telusuri pembuatan objek dan tipe referensi yang digunakan.
5. Jalankan program, lalu hubungkan hasilnya dengan pemilihan metode saat runtime.

## Catatan

Perintah di atas merupakan pola umum Java. Nama kelas utama, nama berkas, deklarasi paket, serta cara kompilasi yang tepat mengikuti kode dan struktur berkas dalam proyek ini.
