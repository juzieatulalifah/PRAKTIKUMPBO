package model;

public class RekamMedis {
    private int id;
    private int pasienId;
    private int dokterId;
    private String diagnosis;
    private String obat;
    private String catatan;


    public RekamMedis(int id, int pasienId, int dokterId, String diagnosis, String obat, String catatan) {
        this.id = id;
        this.pasienId = pasienId;
        this.dokterId = dokterId;
        this.diagnosis = diagnosis;
        this.obat = obat;
        this.catatan = catatan;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPasienId() {
        return pasienId;
    }

    public void setPasienId(int pasienId) {
        this.pasienId = pasienId;
    }

    public int getDokterId() {
        return dokterId;
    }

    public void setDokterId(int dokterId) {
        this.dokterId = dokterId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getObat() {
        return obat;
    }

    public void setObat(String obat) {
        this.obat = obat;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Pasien ID: " + pasienId + ", Dokter ID: " + dokterId +
               ", Diagnosis: " + diagnosis + ", Obat: " + obat + ", Catatan: " + catatan;
    }
}