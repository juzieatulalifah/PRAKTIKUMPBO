package model;

public class Dokter {
    private int id;
    private String nama;
    private String spesialis;
    private String noTelp;
    private String email;

    public Dokter(int id, String nama, String spesialis, String noTelp, String email) {
        this.id = id;
        this.nama = nama;
        this.spesialis = spesialis;
        this.noTelp = noTelp;
        this.email = email;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Spesialis: " + spesialis + ", No Telp: " + noTelp + ", Email: " + email;
    }
}
