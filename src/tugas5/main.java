package tugas5;

public class main {
    public static void main(String[] args) {
            
        BangunDatar p = new persegi();
       ((persegi)p).setSisi(5);   
        System.out.println("Luas Persegi : "+p.Luas() );
        System.out.println("Keliling Persegi : "+p.Keliling());
        
        BangunDatar pp = new PersegiPanjang();
        ((PersegiPanjang)pp).setP(6);
        ((PersegiPanjang)pp).setL(2);
        
         System.out.println("Luas Persegi Panjang : "+pp.Luas() );
        System.out.println("Keliling Persegi Panjang : "+pp.Keliling());
        
        BangunDatar s = new segitiga();
        ((segitiga)s).setA(8);
        ((segitiga)s).setT(3);
         System.out.println("Luas Segitiga : "+s.Luas() );
        System.out.println("Keliling Segitiga : "+s.Keliling());
        
        BangunDatar l = new lingkaran();
        ((lingkaran)l).setR(6);
        System.out.println("Luas Persegi Panjang : " +l.Luas());
        System.out.println("Keliling Persegi Panjang : "+l.Keliling());
    }
    
}
