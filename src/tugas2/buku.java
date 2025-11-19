package tugas2;

public class buku {
     String judul,pengarang;
    int tahun;

    public buku() {
        this.judul=null;
        this.pengarang=null;
        this.tahun=0;
    }
//judul
    public buku(String judul) {
        this.judul=judul;
        this.pengarang=null;
        this.tahun=0;
    }
    
//     pengarang
    public buku(String pengarang,boolean hanyapengarang) {
        this.judul=null;
        this.pengarang=pengarang;
        this.tahun=0;
    }
    
// tahun terbit
    public buku(int tahunter) {
        this.judul=null;
        this.pengarang=null;
        this.tahun=tahunter;
    }

//     judul dan pengarang
    public buku(String judul,String pengarang) {
        this.judul=judul;
        this.pengarang=pengarang;
        this.tahun=0;
    }
//     judul dan tahun terbit
    public buku(String judul,int tahunterbit) {
        this.judul=judul;
        this.pengarang=null;
        this.tahun=tahunterbit;
    }
//    pengarang dan tahun terbit
    public buku(String pengarang,int tahunter,boolean ispengarang) {
        this.judul=null;
        this.pengarang=pengarang;
        this.tahun=tahunter;
    }
    

    public buku(String judul,String pengarang,int tahunter) {
        this.judul=judul;
        this.pengarang=pengarang;
        this.tahun=tahunter;
    }
//    pengarang dan tahun terbit
  
   
    
    void tampil(){
        System.out.println("");
        System.out.println("Judul : "+judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Tahun terbit : "+tahun);
    }
}
