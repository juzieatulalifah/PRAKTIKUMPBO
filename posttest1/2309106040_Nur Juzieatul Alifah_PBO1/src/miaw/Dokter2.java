package miaw;
import java.util.ArrayList;
import java.util.Scanner;
import model.Dokter;

public class Dokter2 {
    private ArrayList<Dokter> daftarDokter = new ArrayList<>();

    public void tambahDokter(Scanner scanner) {
        System.out.print("ID Dokter: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Spesialis: ");
        String spesialis = scanner.nextLine();
        System.out.print("No Telepon: ");
        String noTelp = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        daftarDokter.add(new Dokter(id, nama, spesialis, noTelp, email));
        System.out.println("Dokter berhasil ditambahkan.");
    }

    public void tampilkanDokter() {
        if (daftarDokter.isEmpty()) {
            System.out.println("Tidak ada dokter yang terdaftar.");
        } else {
            for (Dokter d : daftarDokter) {
                System.out.println(d);
            }
        }
    }

    public void hapusDokter(Scanner scanner) {
        System.out.print("Masukkan ID Dokter yang akan dihapus: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        daftarDokter.removeIf(d -> d.id == id);
        System.out.println("Dokter berhasil dihapus.");
    }

    public void editDokter(Scanner scanner) {
        System.out.print("Masukkan ID Dokter yang akan diedit: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Dokter d : daftarDokter) {
            if (d.id == id) {
                System.out.print("Masukkan nama baru: ");
                d.nama = scanner.nextLine();
                System.out.print("Masukkan spesialis baru: ");
                d.spesialis = scanner.nextLine();
                System.out.print("Masukkan no telepon baru: ");
                d.noTelp = scanner.nextLine();
                System.out.print("Masukkan email baru: ");
                d.email = scanner.nextLine();
                System.out.println("Data Dokter berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Dokter dengan ID tersebut tidak ditemukan.");
    }
}
