package tugas2;

public class main {
    public static void main(String[] args) {
        
//        CONSTRUCT 1 BUKU
        System.out.println("=====CONSTRUCT 1 BUKU=====");
        new buku().tampil();
        new buku("Bulan").tampil(); //judul
        new buku("Widya",true).tampil(); //pengarang
        new buku(2015).tampil(); //tahun terbit
        new buku("MAtahari","Abdul").tampil(); //judul dan pengarang
        new buku("Doa IBU",2021).tampil(); //judul tahun terbit
        new buku("Yahya",2019).tampil(); //pengarang dan tahun terbit
        new buku("Aku milikmu","Ahmad",2008).tampil(); //judul,pengarang,tahun
        
//        CONSTRUCT 2 Mobil
 System.out.println("\n=====CONSTRUCT 2 MOBIL=====");
        Mobil m1=new Mobil("Ferari","F9 Spider");
        m1.tampil();
        
        Mobil m2=new Mobil("BMW","320i",2024);
        m2.tampil();
        
//         CONSTRUCT 3 Lingkaran
 System.out.println("\n=====CONSTRUCT 3 LINGKARAN=====");
        lingkaran L1 = new lingkaran(0);
       L1.tampil();
       
       lingkaran L2 = new lingkaran(-2);
       L2.tampil();
       
       lingkaran L3 = new lingkaran(6);
       L3.tampil();
    }
 
}
