package miaw;
import java.util.ArrayList;
import java.util.Scanner;
import model.RekamMedis;

public class RekamMedis2 {
    private ArrayList<RekamMedis> daftarRekamMedis = new ArrayList<>();

    public void tambahRekamMedis(Scanner scanner) {
        System.out.print("ID Rekam Medis: ");
        int id = scanner.nextInt();
        System.out.print("ID Pasien: ");
        int pasienId = scanner.nextInt();
        System.out.print("ID Dokter: ");
        int dokterId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Diagnosis: ");
        String diagnosis = scanner.nextLine();
        System.out.print("Obat: ");
        String obat = scanner.nextLine();
        System.out.print("Catatan: ");
        String catatan = scanner.nextLine();
        
        daftarRekamMedis.add(new RekamMedis(id, pasienId, dokterId, diagnosis, obat, catatan));
        System.out.println("Rekam Medis berhasil ditambahkan.");
    }

    public void tampilkanRekamMedis() {
        if (daftarRekamMedis.isEmpty()) {
            System.out.println("Tidak ada rekam medis yang terdaftar.");
        } else {
            for (RekamMedis rm : daftarRekamMedis) {
                System.out.println(rm);
            }
        }
    }

    public void hapusRekamMedis(Scanner scanner) {
        System.out.print("Masukkan ID Rekam Medis yang akan dihapus: ");
        int id = scanner.nextInt();
        daftarRekamMedis.removeIf(rm -> rm.getId() == id);
        System.out.println("Rekam Medis berhasil dihapus.");
    }

    public void editRekamMedis(Scanner scanner) {
        System.out.print("Masukkan ID Rekam Medis yang akan diedit: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (RekamMedis rm : daftarRekamMedis) {
            if (rm.getId() == id) {
                System.out.print("Masukkan diagnosis baru: ");
                rm.setDiagnosis(scanner.nextLine());
                System.out.print("Masukkan obat baru: ");
                rm.setObat(scanner.nextLine());
                System.out.print("Masukkan catatan baru: ");
                rm.setCatatan(scanner.nextLine());
                System.out.println("Rekam Medis berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Rekam Medis dengan ID tersebut tidak ditemukan.");
    }
}