package tugas2;

public class Mobil {
    String merk;
    String model;
    int tahun;

    public Mobil(String merk,String model) {
        this.merk=merk;
        this.model=model;
        this.tahun=2025;
    }
    
    public Mobil(String merk,String model,int tahun) {
        this.merk=merk;
        this.model=model;
        this.tahun=tahun;
    }
    
    void tampil(){
        System.out.println("\nMerk : "+merk);
        System.out.println("Model : "+model);
        System.out.println("Tahun : "+tahun);
    }
}
