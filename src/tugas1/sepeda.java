package tugas1;

public class sepeda {
    String merk;
    int jarakTempuh;

    
     void view(){
        System.out.println("Object "+merk+" dibuat dengan jarak tempuh,"+jarakTempuh+"km");
    }
    
    void Maju(){
        jarakTempuh+=10;
        System.out.println("Bergerak Maju 10km");
        tampilan();
    }
    
    void Mundur(){
        jarakTempuh-=5;
        if (jarakTempuh<0) {
            jarakTempuh=0;
        }
        System.out.println("Bergerak Mundur 5km");
        tampilan();
    }
    
    void Berhenti(){
         System.out.println("Object sepeda "+merk+", Jarak tempuh akhir "+jarakTempuh+"km");
    }
    
    void tampilan(){
        System.out.println("Object sepeda "+merk+", Jarak tempuh "+jarakTempuh+"km");
    }
}

//    public sepeda(String merk) {
//        this.merk=merk;
//        this.jarakTempuh=0;
//        System.out.println("Object "+merk+" dibuat,dengan jarak tempuh awal "+jarakTempuh+"km");
//    }