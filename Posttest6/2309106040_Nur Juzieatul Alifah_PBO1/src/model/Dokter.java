package model;

public class Dokter extends Orang implements TindakanMedis {
    private final int id;
    private String spesialis;

    public static int jumlahDokter = 0;

    public Dokter(int id, String nama, String spesialis, String noTelp, String email) {
        super(nama, noTelp, email);
        this.id = id;
        this.spesialis = spesialis;
        jumlahDokter++; 
    }

    public int getId() { return id; }
    public String getSpesialis() { return spesialis; }
    public void setSpesialis(String spesialis) { this.spesialis = spesialis; }

    public static void tampilkanJumlahDokter() {
        System.out.println("Jumlah dokter terdaftar: " + jumlahDokter);
    }

    @Override
    public String toString() {
        return "ID Dokter: " + id + ", " + super.nama + ", Spesialis: " + spesialis;
    }

    @Override
    public void tampilkanProfil() {
        System.out.println("Profil Dokter: " + toString());
    }

    @Override
    public void beriDiagnosis(String diagnosis) {
        if (diagnosis == null || diagnosis.isBlank()) {
            System.err.println("Error: Diagnosis tidak boleh kosong.");
            return;
        }
        System.out.println("Dokter " + nama + " memberikan diagnosis: " + diagnosis);
    }

    @Override
    public void beriResep(String obat) {
        if (obat == null || obat.isBlank()) {
            System.err.println("Error: Obat tidak boleh kosong.");
            return;
        }
        System.out.println("Dokter " + nama + " meresepkan obat: " + obat);
    }
}
