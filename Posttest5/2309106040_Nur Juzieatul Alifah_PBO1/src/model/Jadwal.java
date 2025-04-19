package model;

public final class Jadwal { 
    private int id;
    private int dokterId;
    private String hari;
    private String jam;

    public Jadwal(int id, int dokterId, String hari, String jam) {
        this.id = id;
        this.dokterId = dokterId;
        this.hari = hari;
        this.jam = jam;
    }

    // Getter dan Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getDokterId() { return dokterId; }
    public void setDokterId(int dokterId) { this.dokterId = dokterId; }
    public String getHari() { return hari; }
    public void setHari(String hari) { this.hari = hari; }
    public String getJam() { return jam; }
    public void setJam(String jam) { this.jam = jam; }

    @Override
    public String toString() {
        return "ID Jadwal: " + id + ", ID Dokter: " + dokterId + ", Hari: " + hari + ", Jam: " + jam;
    }
}
