package tugas2;

public class lingkaran {
     double jari;

    public lingkaran(double jari) {
        if(jari<=0){
             System.out.println("Jari-jari tidak boleh nol atau negatif. Diberikan nilai default 1.0");
            this.jari = 1.0;
        }else{
           this.jari=jari;
        }
    }
    
    double luas(){
        double phi=3.14;
        double luas=phi*jari*jari;
        return luas;
    }
    
    void tampil(){
        System.out.println("Jari : "+jari);
        System.out.println("Luas : "+luas());
        System.out.println("---------------");
    }
}
