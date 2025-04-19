package model;

public class Dokter extends Orang {
    private final int id;
    private String spesialis;

    public Dokter(int id, String nama, String spesialis, String noTelp, String email) {
        super(nama, noTelp, email);
        this.id = id;
        this.spesialis = spesialis;
    }

    public int getId() { return id; }
    public String getSpesialis() { return spesialis; }
    public void setSpesialis(String spesialis) { this.spesialis = spesialis; }

    @Override
    public String toString() {
        return "ID Dokter: " + id + ", " + super.nama + ", Spesialis: " + spesialis;
    }

    @Override
    public void tampilkanProfil() {
        System.out.println("Profil Dokter: " + toString());
    }
}
