package tugas3;
import java.util.Scanner;

public class Persegi extends BangunDatar{
    float sisi;
    
    @Override
  public float luas(){
        Scanner input= new Scanner(System.in);
        System.out.println("\n LUAS PERSEGI");
        System.out.print("Masukan sisi persegi : ");
        sisi=input.nextFloat();
        float hasil=sisi*sisi;
         System.out.println("Luas persegi dengan sisi = "+sisi+" adalah "+hasil);
      return hasil;
  }
    
    @Override
    public float keliling(){
        System.out.println("\n KELILING PERSEGI");
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan sisi Persegi : ");
        sisi=input.nextFloat();    

        float hasil=4*sisi;
        System.out.println("Keliling persegi dengan sisi = "+sisi+" adalah "+hasil);
        return hasil;
    }
}
