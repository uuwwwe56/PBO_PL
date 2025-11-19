package tugas3;

public class main {
    public static void main(String[] args) {
//        INHERITANCE

//        BANGUN DATAR
        BangunDatar b=new BangunDatar();
        b.luas();
        b.keliling();
        
//          PERSEGI
        BangunDatar p=new Persegi();
        p.luas();
        p.keliling();
        
//          LINGKARAN
            Lingkaran l1=new Lingkaran();
            l1.luas();
            l1.keliling();
      
//          PERSEGI PANJANG 
            PersegiPanjang pp=new PersegiPanjang();
            pp.luas();
            pp.keliling();
//          SEGITIGA
            Segitiga s1=new Segitiga();
            s1.luas();
            s1.keliling();

    }
}
