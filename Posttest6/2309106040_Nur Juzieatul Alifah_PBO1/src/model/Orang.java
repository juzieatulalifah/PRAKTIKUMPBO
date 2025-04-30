package model;

public abstract class Orang {
    protected String nama;
    protected String noTelp;
    protected String email;

    public Orang(String nama, String noTelp, String email) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.email = email;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getNoTelp() { return noTelp; }
    public void setNoTelp(String noTelp) { this.noTelp = noTelp; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public abstract void tampilkanProfil();
}
