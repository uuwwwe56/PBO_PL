package tugas1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
   
        System.out.print("Masukan Merk : ");
        String merk=input.nextLine();
//        sepeda m1=new sepeda(merk); construct
       sepeda m1 = new sepeda();
       m1.merk=merk;
       m1.view();
        
        int pilihan;
        do{
            System.out.println("\nMenu :");
            System.out.println("Bergerak Maju(1)");
            System.out.println("Bergerak Mundur(2)");
            System.out.println("Berhenti(3)");
            System.out.println("Exit(0)");
            
            System.out.print("Pilihan : ");
            pilihan=input.nextInt();
            
            switch (pilihan) {
                case 1:
                    m1.Maju();
                    break;
                case 2:
                    m1.Mundur();
                    break;
                case 3:
                    m1.Berhenti();
                    break;
                case 0:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Pilihan Invalid");
            }
            
        }while(pilihan!=0);
         
        
    }
}
