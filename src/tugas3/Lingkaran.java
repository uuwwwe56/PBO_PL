package tugas3;
import java.util.Scanner;
public class Lingkaran extends BangunDatar{
    float r;
    
    @Override
    public float luas(){
        Scanner input=new Scanner(System.in);
        System.out.println("\n LUAS LINGKARAN");
        System.out.print("Masukan jari-jari Lingkaran : ");
        r=input.nextFloat();
        
        float hasil=(float)(Math.PI*r*r);
        System.out.println("Luas lingkaran dengan sisi = "+r+" adalah "+hasil);
        return hasil;
    }
    
    @Override
    public float keliling(){
        Scanner input=new Scanner(System.in);
        System.out.println("\n KELILING LINGKARAN");
        System.out.print("Masukan jari-jari Lingkaran : ");
        r=input.nextFloat();
        
        float hasil=(float)(2* Math.PI * r);
         System.out.println("Keliling lingkaran dengan sisi = "+r+" adalah "+hasil);
        return hasil;
    } 
}
