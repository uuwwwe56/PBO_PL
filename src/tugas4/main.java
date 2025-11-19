package tugas4;

public class main {
    public static void main(String[] args) {
  
        System.out.println("LUAS & KELILING PERSEGI");
        Persegi p = new Persegi();
        p.setSisi(5);
        System.out.println("Luas Persegi : " +p.GetLuas());
        System.out.println("Keliling Persegi : "+p.GetKeliling());
      
        System.out.println("\nLUAS & KELILING LINGKARAN");
        Lingkaran L = new Lingkaran();
        L.setR(5);
        System.out.println("Luas Lingkaran : " +L.GetLuas());
        System.out.println("Keliling Lingkaran : "+L.GetKeliling());
        
        System.out.println("\nLUAS & KELILING LINGKARAN");
        PersegiPanjang PP = new PersegiPanjang();
        PP.setL(9);
        PP.setP(2);
        System.out.println("Luas Persegi Panjang : " +PP.GetLuas());
        System.out.println("Keliling Persegi Panjang : "+PP.GetKeliling());
        
        System.out.println("\nLUAS & KELILING SEGITIGA");
        Segitiga s = new Segitiga();
        s.setA(6);
        s.setT(9);
        System.out.println("Luas Segitiga : " +s.GetLuas());
        System.out.println("Keliling Segitiga : "+s.GetKeliling());
    
        
    
    
    
    
    }
}
