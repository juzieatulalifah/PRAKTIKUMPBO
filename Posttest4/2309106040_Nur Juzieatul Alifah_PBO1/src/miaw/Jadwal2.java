package miaw;
import java.util.ArrayList;
import java.util.Scanner;
import model.Jadwal;

public class Jadwal2 {
    private ArrayList<Jadwal> daftarJadwal = new ArrayList<>();

    public void tambahJadwal(Scanner scanner) {
        System.out.print("ID Jadwal: ");
        int id = scanner.nextInt();
        System.out.print("ID Dokter: ");
        int dokterId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Hari: ");
        String hari = scanner.nextLine();
        System.out.print("Jam: ");
        String jam = scanner.nextLine();
        
        daftarJadwal.add(new Jadwal(id, dokterId, hari, jam));
        System.out.println("Jadwal berhasil ditambahkan.");
    }

    public void tampilkanJadwal() {
        if (daftarJadwal.isEmpty()) {
            System.out.println("Tidak ada jadwal yang terdaftar.");
        } else {
            for (Jadwal j : daftarJadwal) {
                System.out.println(j);
            }
        }
    }

    public void hapusJadwal(Scanner scanner) {
        System.out.print("Masukkan ID Jadwal yang akan dihapus: ");
        int id = scanner.nextInt();
        daftarJadwal.removeIf(j -> j.getId() == id);
        System.out.println("Jadwal berhasil dihapus.");
    }

    public void editJadwal(Scanner scanner) {
        System.out.print("Masukkan ID Jadwal yang akan diedit: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Jadwal j : daftarJadwal) {
            if (j.getId() == id) {
                System.out.print("Masukkan hari baru: ");
                j.setHari(scanner.nextLine());
                System.out.print("Masukkan jam baru: ");
                j.setJam(scanner.nextLine());
                System.out.println("Jadwal berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Jadwal dengan ID tersebut tidak ditemukan.");
    }
}
