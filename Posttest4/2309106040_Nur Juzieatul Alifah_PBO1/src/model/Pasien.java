package model;

public class Pasien extends Orang {
    private int idPasien;
    private int usia;
    private String alamat;

    public Pasien(int idPasien, String nama, int usia, String alamat, String noTelp, String email) {
        super(nama, noTelp, email);
        this.idPasien = idPasien;
        this.usia = usia;
        this.alamat = alamat;
    }

    public int getIdPasien() { return idPasien; }
    public void setIdPasien(int idPasien) { this.idPasien = idPasien; }
    public int getUsia() { return usia; }
    public void setUsia(int usia) { this.usia = usia; }
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    @Override
    public String toString() {
        return "ID Pasien: " + idPasien + ", " + super.toString() + ", Usia: " + usia + ", Alamat: " + alamat;
    }

    // Overloading
    public void tampilkanInfo() {
        System.out.println(this.toString());
    }

    public void tampilkanInfo(boolean singkat) {
        if (singkat) {
            System.out.println("ID Pasien: " + idPasien + ", Nama: " + nama);
        } else {
            tampilkanInfo();
        }
    }
}
