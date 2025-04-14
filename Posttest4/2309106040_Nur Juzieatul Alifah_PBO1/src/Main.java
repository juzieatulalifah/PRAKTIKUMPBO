import java.util.ArrayList;
import java.util.Scanner;
import miaw.Dokter2;
import miaw.Jadwal2;
import miaw.RekamMedis2;
import model.Pasien;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dokter2 dokterManager = new Dokter2();
        Jadwal2 jadwalManager = new Jadwal2();
        RekamMedis2 rekamMedisManager = new RekamMedis2();
        ArrayList<Pasien> daftarPasien = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Tambah Dokter");
            System.out.println("2. Tampilkan Dokter");
            System.out.println("3. Edit Dokter");
            System.out.println("4. Hapus Dokter");
            System.out.println("5. Tambah Jadwal");
            System.out.println("6. Tampilkan Jadwal");
            System.out.println("7. Edit Jadwal");
            System.out.println("8. Hapus Jadwal");
            System.out.println("9. Tambah Rekam Medis");
            System.out.println("10. Tampilkan Rekam Medis");
            System.out.println("11. Edit Rekam Medis");
            System.out.println("12. Hapus Rekam Medis");
            System.out.println("13. Polymorphism (Pasien)");
            System.out.println("14. Tambah Pasien");
            System.out.println("15. Tampilkan Pasien");
            System.out.println("16. Edit Pasien");
            System.out.println("17. Hapus Pasien");
            System.out.println("18. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    dokterManager.tambahDokter(scanner);
                    break;
                case 2:
                    dokterManager.tampilkanDokter();
                    break;
                case 3:
                    dokterManager.editDokter(scanner);
                    break;
                case 4:
                    dokterManager.hapusDokter(scanner);
                    break;
                case 5:
                    jadwalManager.tambahJadwal(scanner);
                    break;
                case 6:
                    jadwalManager.tampilkanJadwal();
                    break;
                case 7:
                    jadwalManager.editJadwal(scanner);
                    break;
                case 8:
                    jadwalManager.hapusJadwal(scanner);
                    break;
                case 9:
                    rekamMedisManager.tambahRekamMedis(scanner);
                    break;
                case 10:
                    rekamMedisManager.tampilkanRekamMedis();
                    break;
                case 11:
                    rekamMedisManager.editRekamMedis(scanner);
                    break;
                case 12:
                    rekamMedisManager.hapusRekamMedis(scanner);
                    break;
                case 13:
                    Pasien contohPasien = new Pasien(101, "Elly", 22, "Jl. Kenanga", "0822334455", "elly@mail.com");
                    System.out.println("\nTampilan info lengkap:");
                    contohPasien.tampilkanInfo(); 

                    System.out.println("\nTampilan info singkat:");
                    contohPasien.tampilkanInfo(true); 
                    break;
                case 14:
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

                    Pasien pasienBaru = new Pasien(id, nama, usia, alamat, noTelp, email);
                    daftarPasien.add(pasienBaru);
                    System.out.println("Pasien berhasil ditambahkan.");
                    break;
                case 15:
                    if (daftarPasien.isEmpty()) {
                        System.out.println("Belum ada data pasien.");
                    } else {
                        for (Pasien p : daftarPasien) {
                            p.tampilkanInfo(); 
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 16:
                    System.out.print("Masukkan ID pasien yang ingin diedit: ");
                    int editId = scanner.nextInt(); scanner.nextLine();
                    boolean ditemukan = false;

                    for (Pasien p : daftarPasien) {
                        if (p.getIdPasien() == editId) {
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
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                case 17:
                    System.out.print("Masukkan ID pasien yang ingin dihapus: ");
                    int hapusId = scanner.nextInt(); scanner.nextLine();
                    boolean terhapus = daftarPasien.removeIf(p -> p.getIdPasien() == hapusId);
                    if (terhapus) {
                        System.out.println("Pasien berhasil dihapus.");
                    } else {
                        System.out.println("Pasien dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                case 18:
                    System.out.println("Bye bye");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
