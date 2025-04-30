package miaw;

import java.util.ArrayList;
import java.util.Scanner;
import model.Pasien;

public class Pasien2 {
    private ArrayList<Pasien> daftarPasien = new ArrayList<>();

    public void tambahPasien(Scanner scanner) {
        System.out.print("ID Pasien: ");
        int id = scanner.nextInt(); scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Usia: ");
        int usia = scanner.nextInt(); scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("No Telp: ");
        String noTelp = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Pasien p = new Pasien(id, nama, usia, alamat, noTelp, email);
        daftarPasien.add(p);
        System.out.println("Pasien berhasil ditambahkan.");
    }

    public void tampilkanPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada data pasien.");
        } else {
            for (Pasien p : daftarPasien) {
                p.tampilkanInfo(); // Polymorphism (Overloading)
                System.out.println("------------------");
            }
        }
    }

    public void editPasien(Scanner scanner) {
        System.out.print("Masukkan ID pasien yang ingin diedit: ");
        int id = scanner.nextInt(); scanner.nextLine();

        for (Pasien p : daftarPasien) {
            if (p.getIdPasien() == id) {
                System.out.print("Nama baru: ");
                p.setNama(scanner.nextLine());
                System.out.print("Usia baru: ");
                p.setUsia(scanner.nextInt()); scanner.nextLine();
                System.out.print("Alamat baru: ");
                p.setAlamat(scanner.nextLine());
                System.out.print("No Telp baru: ");
                p.setNoTelp(scanner.nextLine());
                System.out.print("Email baru: ");
                p.setEmail(scanner.nextLine());
                System.out.println("Data pasien berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
    }

    public void hapusPasien(Scanner scanner) {
        System.out.print("Masukkan ID pasien yang ingin dihapus: ");
        int id = scanner.nextInt(); scanner.nextLine();

        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getIdPasien() == id) {
                daftarPasien.remove(i);
                System.out.println("Pasien berhasil dihapus.");
                return;
            }
        }
        System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
    }
}
