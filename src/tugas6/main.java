package tugas6;

public class main {
    public static void main(String[] args) {
          // Membuat objek Pemilik
        Pemilik pemilik1 = new Pemilik("Budiman", "Cianjur");

        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("BMW", "F 1234 WY", 2010);
        Mobil mobil2 = new Mobil("Vios", "F 1233 WD", 2008);
        Mobil mobil3 = new Mobil("Aila", "F 1222 WW", 2000);

        // Pemilik membeli mobil
        pemilik1.beliMobil(mobil1.getNoPlat());
        pemilik1.beliMobil(mobil2.getNoPlat());
        pemilik1.beliMobil(mobil3.getNoPlat());

        // Menampilkan data pemilik dan mobil
        System.out.println("Pemilik Mobil: " + pemilik1.getNama() + " \nAlamat: " + pemilik1.getAlamat());
        System.out.println("Data Mobil:");
        System.out.println("========================================");
        // Array sementara untuk mencocokkan plat mobil dengan objek
        Mobil[] daftarMobil = {mobil1, mobil2, mobil3};
        String[] platPemilik = pemilik1.getNoPlatMobil();
        
        for (int i = 0; i < pemilik1.getJumlahMobil(); i++) {
            for (Mobil m : daftarMobil) {
                if (m.getNoPlat().equals(platPemilik[i])) {
                    System.out.println("Merk\t\t\t: " + m.getMerek());
                    System.out.println("No\t\t\t: " + m.getNoPlat());
                    System.out.println("Tahun Keluaran\t: " + m.getTahunKeluaran());
                    System.out.println("========================================");
                }
            }
        }
    }
    
}
