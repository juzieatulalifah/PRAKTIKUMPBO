package model;

public class Jadwal {
    public int id;
    public int dokterId;
    public String hari;
    public String jam;

    public Jadwal(int id, int dokterId, String hari, String jam) {
        this.id = id;
        this.dokterId = dokterId;
        this.hari = hari;
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "ID Jadwal: " + id + ", ID Dokter: " + dokterId +
               ", Hari: " + hari + ", Jam: " + jam;
    }
}