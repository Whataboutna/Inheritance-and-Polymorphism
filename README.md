# Inheritance and Polymorphism

<<<<<<< HEAD
Proyek Java sederhana ini memperagakan pewarisan (*inheritance*), enkapsulasi (*encapsulation*), dan *method overriding* menggunakan kelas-kelas bentuk geometri. Program menyediakan menu untuk menghitung luas bujur sangkar dan lingkaran, serta volume silinder.
=======
Repositori ini berisi proyek Java untuk mempelajari **inheritance (pewarisan)** dan **polymorphism (polimorfisme)** dalam Pemrograman Berorientasi Objek (PBO).
>>>>>>> 60a858c10ff43ac50c767ebb41e9c07413bcf0ad

## Struktur berkas

| Berkas | Keterangan |
| --- | --- |
| `Bentuk.java` | Kelas induk yang menyimpan warna dan menyediakan `getWarna()`, `setWarna()`, serta `printInfo()`. |
| `BujurSangkar.java` | Kelas turunan `Bentuk` dengan atribut sisi, metode `hitungLuas()`, dan implementasi `printInfo()` sendiri. |
| `Lingkaran.java` | Kelas turunan `Bentuk` dengan radius dan konstanta `phi`; menyediakan `hitungLuas()` dan implementasi `printInfo()`. |
| `Silinder.java` | Kelas yang dimaksudkan untuk menghitung volume silinder dan menampilkan informasinya. Implementasinya saat ini memiliki masalah kompilasi; lihat [Catatan implementasi](#catatan-implementasi). |
| `MainBentuk.java` | Kelas utama yang menampilkan menu, menerima masukan, membuat objek, dan memanggil `printInfo()`. |

## Konsep OOP pada proyek

### Pewarisan

<<<<<<< HEAD
`BujurSangkar` dan `Lingkaran` menggunakan `extends Bentuk`. Keduanya mewarisi data dan perilaku umum bentuk, seperti warna dan `getWarna()`, lalu menambahkan data serta perhitungan yang khusus.

`Silinder` juga ditulis sebagai kelas turunan `Bentuk`, tetapi pemanggilan konstruktornya belum sesuai dengan konstruktor yang tersedia di `Bentuk`.

### Enkapsulasi

Atribut `sisi` pada `BujurSangkar`, `radius` pada `Lingkaran`, dan `tinggi` pada `Silinder` dideklarasikan `private`. Kelas menyediakan metode untuk mengakses atau mengubah sebagian atribut tersebut. Atribut `warna` di `Bentuk`, sebaliknya, dideklarasikan `public`.

### *Method overriding* dan polimorfisme

`BujurSangkar`, `Lingkaran`, dan `Silinder` mendeklarasikan ulang `printInfo()` dengan anotasi `@Override`. Karena objek kelas turunan dapat disimpan dalam variabel bertipe `Bentuk`, pemanggilan metode tersebut dapat memilih implementasi sesuai kelas objek:
=======
Pewarisan memungkinkan kelas turunan memperoleh anggota kelas induk dan menambahkan perilaku yang lebih spesifik.
>>>>>>> 60a858c10ff43ac50c767ebb41e9c07413bcf0ad

```java
Bentuk bentuk = new BujurSangkar(4, "Biru");
bentuk.printInfo();
```

Contoh ini memanggil `printInfo()` milik `BujurSangkar`. Namun, `MainBentuk` saat ini membuat variabel dengan tipe kelas konkret, bukan tipe `Bentuk`.

## Rumus yang digunakan

<<<<<<< HEAD
- Bujur sangkar: luas = sisi × sisi.
- Lingkaran: luas = `phi` × radius × radius, dengan `phi` ditetapkan sebesar `3.14159`.
- Silinder: volume secara matematis = `phi` × radius × radius × tinggi. Metode di berkas `Silinder.java` belum berhasil menerapkan perhitungan ini karena masalah kompilasi yang disebutkan di bawah.

## Menjalankan program

Pastikan JDK sudah terpasang. Periksa instalasi dengan:

```bash
java -version
javac -version
```

Setelah masalah kompilasi pada `Silinder.java` diperbaiki, kompilasikan semua berkas dari direktori proyek:
=======
```java
KelasInduk objek = new KelasTurunan();
objek.metode();
```
## Run Program
>>>>>>> 60a858c10ff43ac50c767ebb41e9c07413bcf0ad

```bash
javac Bentuk.java BujurSangkar.java Lingkaran.java Silinder.java MainBentuk.java
```

<<<<<<< HEAD
Jalankan program melalui kelas utama:

```bash
java MainBentuk
```
=======
   ```bash
   javac MainBentuk.java
   java MainBentuk
   ```

Untuk beberapa berkas atau proyek yang menggunakan `package`, kompilasikan dari direktori sumber dengan struktur paket dan *classpath* yang sesuai.
>>>>>>> 60a858c10ff43ac50c767ebb41e9c07413bcf0ad

Program menampilkan menu berikut:

<<<<<<< HEAD
```text
1. Bujur Sangkar
2. Lingkaran
3. Silinder
0. Keluar
```

Pilih jenis bentuk, lalu masukkan warna serta ukuran yang diminta. Program menampilkan hasil melalui `printInfo()`. Pilihan `0` mengakhiri program. Masukan yang tidak sesuai tipe angka ditangani dengan pesan kesalahan dan program meminta pilihan kembali.

## Catatan implementasi

`Silinder.java` sebagaimana tertulis saat ini mencegah seluruh proyek dikompilasi. Beberapa masalah yang perlu diperbaiki pada berkas tersebut:

- `Bentuk` hanya memiliki konstruktor `Bentuk(String warna)`, sedangkan `Silinder` memanggil `super(radius, warna)`.
- Ekspresi `get.Tinggi` pada `hitungVolume()` bukan pemanggilan metode Java yang valid.
- `printInfo()` memanggil `volume()`, padahal metode tersebut tidak didefinisikan; metode yang ada bernama `hitungVolume()`.

Dokumentasi dan perintah di atas mencerminkan struktur serta nama kelas/metode dalam berkas proyek. Perintah kompilasi baru dapat dijalankan setelah masalah tersebut diperbaiki.
=======
1. Identifikasi kelas induk dan kelas-kelas yang mewarisinya.
2. Periksa konstruktor, atribut, serta metode yang diwarisi atau ditambahkan.
3. Cari metode yang di-override dan bandingkan implementasinya.
4. Telusuri pembuatan objek dan tipe referensi yang digunakan.
5. Jalankan program, lalu hubungkan hasilnya dengan pemilihan metode saat runtime.
>>>>>>> 60a858c10ff43ac50c767ebb41e9c07413bcf0ad
