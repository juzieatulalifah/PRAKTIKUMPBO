import java.util.Scanner;
import miaw.Dokter2;
import miaw.Jadwal2;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dokter2 dokterManager = new Dokter2();
        Jadwal2 jadwalManager = new Jadwal2();
        
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
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
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
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }            
        }
    }
}