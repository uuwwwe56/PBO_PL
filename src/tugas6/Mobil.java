package tugas6;

public class Mobil {
 private String merek;
    private String noPlat;
    private int tahunKeluaran;

    public Mobil(String merek, String noPlat, int tahunKeluaran) {
        this.merek = merek;
        this.noPlat = noPlat;
        this.tahunKeluaran = tahunKeluaran;
    }

    // Getter untuk atribut
    public String getMerek() {
        return merek;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public int getTahunKeluaran() {
        return tahunKeluaran;    
 }
}