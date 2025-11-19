package tugas3;
import java.util.Scanner;
public class Segitiga extends BangunDatar{
    float a,t,b,c;
    
    
    @Override
    public float luas() {
      Scanner input=new Scanner(System.in);
      System.out.println("\n LUAS SEGITIGA");
        System.out.print("Masukan alas segitiga : ");
        a=input.nextFloat();    
        System.out.print("Masukan tinggi segitiga : ");
        t=input.nextFloat();    

        float hasil=0.5f * a*t;
        System.out.println("Luas segitiga dengan alas = "+a+" dan tinggi "+t+" adalah "+hasil);
      
        return hasil;
    
   }

    @Override
    public float keliling() {
     Scanner input=new Scanner(System.in);
     System.out.println("\n KELILING SEGITIGA");
        System.out.print("Masukan sisi 1 segitiga : ");
        a=input.nextFloat();    
        System.out.print("Masukan sisi 2 segitiga : ");
        b=input.nextFloat();    
        System.out.print("Masukan sisi 3 segitiga : ");
        c=input.nextFloat();    

        float hasil= a+b+c ;
        System.out.println("Keliling segitiga dengan sisi = " 
    + a + ", " + b + ", dan " + c + " adalah " + hasil);
        return hasil;
    }
    
    
}