package tugas3;
import java.util.Scanner;

public class PersegiPanjang extends BangunDatar{
    float p,l;
    
    @Override
    public float luas() {
         Scanner input=new Scanner(System.in);
         System.out.println("\n LUAS PERSEGI PANJANG");
        System.out.print("Masukan panjang Persegi Panjang : ");
        p=input.nextFloat();    
        System.out.print("Masukan lebar Persegi Panjang : ");
        l=input.nextFloat();    

        float hasil=p*l;
        System.out.println("Luas persegi panjang dengan panjang = "+p+" dan lebar "+l+" adalah "+hasil);
      
        return hasil;
    }

    @Override
    public float keliling() {
    Scanner input=new Scanner(System.in);
    System.out.println("\n KELILING PERSEGI PANJANG");
        System.out.print("Masukan panjang Persegi Panjang : ");
        p=input.nextFloat();    
        System.out.print("Masukan lebar Persegi Panjang : ");
        l=input.nextFloat();    

        float hasil=2*(p+l);
        System.out.println("Keliling persegi panjang dengan panjang = "+p+" dan lebar "+l+" adalah "+hasil);
      
        return hasil;
    }
    
   
    
    
    
    
}
