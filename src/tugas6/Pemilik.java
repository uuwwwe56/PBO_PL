package tugas6;

public class Pemilik {
     private String nama;
    private String alamat;
    private int jumlahMobil;
    private String[] noPlatMobil; // Array untuk menyimpan nomor plat mobil

    public Pemilik(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahMobil = 0;
        this.noPlatMobil = new String[5]; // Maksimal 5 mobil
    }

    // Method untuk menambah mobil
    public void beliMobil(String noPlat) {
        if (jumlahMobil < 5) {
            noPlatMobil[jumlahMobil] = noPlat;
            jumlahMobil++;
//            System.out.println("Mobil dengan plat " + noPlat + " berhasil ditambahkan.");
        } else {
            System.out.println("Maaf, sudah mencapai batas maksimal mobil.");
        }
    }

    // Method untuk menghapus mobil
    public void jualMobil(String noPlat) {
        int index = -1;
        for (int i = 0; i < jumlahMobil; i++) {
            if (noPlatMobil[i].equals(noPlat)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < jumlahMobil - 1; i++) {
                noPlatMobil[i] = noPlatMobil[i + 1];
            }
            noPlatMobil[jumlahMobil - 1] = null;
            jumlahMobil--;
            System.out.println("Mobil dengan plat " + noPlat + " berhasil dijual.");
        } else {
            System.out.println("Nomor plat tidak ditemukan.");
        }
    }

    // Getter untuk atribut
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJumlahMobil() {
        return jumlahMobil;
    }

    public String[] getNoPlatMobil() {
        return noPlatMobil;
    }
}
