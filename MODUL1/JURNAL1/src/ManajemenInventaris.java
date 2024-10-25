import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Deklarasi ArrayList untuk menyimpan barang
private ArrayList<Barang> inventaris = new ArrayList<>();

    // Method untuk menambah barang elektronik
public void tambahBarangElektronik() {
    // Scanner 
    Scanner scanner = new Scanner(System.in);

    // Input Nama Barang, Jumlah Barang, Harga Barang, Garansi Barang
    System.out.print("Masukkan Nama Barang Elektronik: ");
    String nama = scanner.nextLine();
    System.out.print("Masukkan Jumlah Barang: ");
    int jumlah = scanner.nextInt();
    System.out.print("Masukkan Harga Barang: ");
    double harga = scanner.nextDouble();
    System.out.print("Masukkan Garansi Barang (dalam bulan): ");
    int garansi = scanner.nextInt();
    scanner.nextLine();

    // Membuat objek barang elektronik baru
    BarangElektronik barang = new BarangElektronik(nama, jumlah, harga, garansi);
    inventaris.add(barang); 
    System.out.println("Barang elektronik berhasil ditambahkan!\n");
}

// Method untuk menambah barang non-elektronik
public void tambahBarangNonElektronik() {
    // Scanner
    Scanner scanner = new Scanner(System.in);

    // Input Nama Barang, Jumlah Barang, Harga Barang, Material Barang
    System.out.print("Masukkan Nama Barang Non-Elektronik: ");
    String nama = scanner.nextLine();
    System.out.print("Masukkan Jumlah Barang: ");
    int jumlah = scanner.nextInt();
    System.out.print("Masukkan Harga Barang: ");
    double harga = scanner.nextDouble();
    scanner.nextLine(); // Membersihkan buffer
    System.out.print("Masukkan Material Barang: ");
    String material = scanner.nextLine();

    // Membuat objek barang non-elektronik baru
    BarangNonElektronik barang = new BarangNonElektronik(material ,nama, jumlah, harga);
    inventaris.add(barang); // Menambahkan barang ke dalam inventaris
    System.out.println("Barang non-elektronik berhasil ditambahkan!\n");
}



    // Method untuk menampilkan semua barang memakai if-else (jika tidak ada barang akan menampilkan tidak ada barang dalam inventaris)

}