package model;

public class Dokter {
    public int id;
    public String nama;
    public String spesialis;
    public String noTelp;
    public String email;

    public Dokter(int id, String nama, String spesialis, String noTelp, String email) {
        this.id = id;
        this.nama = nama;
        this.spesialis = spesialis;
        this.noTelp = noTelp;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Spesialis: " + spesialis +
               ", No Telp: " + noTelp + ", Email: " + email;
    }
}
