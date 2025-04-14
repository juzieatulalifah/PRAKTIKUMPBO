package model;

public class Dokter extends Orang {
    private int id;
    private String spesialis;

    public Dokter(int id, String nama, String spesialis, String noTelp, String email) {
        super(nama, noTelp, email);
        this.id = id;
        this.spesialis = spesialis;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getSpesialis() { return spesialis; }
    public void setSpesialis(String spesialis) { this.spesialis = spesialis; }

    @Override
    public String toString() {
        return "ID Dokter: " + id + ", " + super.toString() + ", Spesialis: " + spesialis;
    }
}
