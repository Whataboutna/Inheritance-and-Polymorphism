import java.util.Scanner;
import java.util.InputMismatchException;

public class MainBentuk {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = -1;
        String warna;
        double radius;
        
        while (pilihan != 0) {
        System.out.println("\n---Menu---");
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Lingkaran");   
        System.out.println("3. Silinder");
        System.out.println("0. Keluar"); 
        System.out.println("Pilihan (0-3): ");
        
        try {
        pilihan = input.nextInt();
        input.nextLine();   

        switch (pilihan){
            case 1:
                System.out.println("\n--- Input Bujur Sangkar ---");
                System.out.print("Masukkan warna: ");
                warna = input.nextLine();
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();

                BujurSangkar bujur1 = new BujurSangkar(sisi, warna);
                System.out.println("\n--- Hasil ---");
                bujur1.printInfo();
                break;

            case 2:
                System.out.println("\n--- Input Lingkaran ---");
                System.out.print("Masukkan warna: ");
                warna = input.nextLine();
                System.out.print("Masukkan jari-jari: ");
                radius = input.nextDouble();
                
                Lingkaran bulat = new Lingkaran(radius, warna);
                System.out.println("\n--- Hasil ---");
                bulat.printInfo();
                break;

            case 3:
                    System.out.println("\n--- Input Silinder ---");
                    System.out.print("Masukkan warna: ");
                    warna = input.nextLine();
                    System.out.print("Masukkan jari-jari: ");
                    radius = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();

                    Silinder silin = new Silinder(tinggi, radius, warna);
                    System.out.println("\n--- Hasil ---");
                    silin.printInfo();
                    break;

            case 0:
                System.out.println("Terima kasih, program selesai.");
                break;

            default:
                System.out.println("Pilihan tidak valid! Silakan masukkan angka 0-3.");
                break;
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");
            input.nextLine();
            pilihan = -1;
            }
        }
        input.close();
    }
}