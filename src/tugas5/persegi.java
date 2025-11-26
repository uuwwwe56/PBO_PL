package tugas5;

public class persegi implements BangunDatar{
    private float sisi;

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public float Luas() {
        return sisi*sisi;
    }

    @Override
    public float Keliling() {
        return 4*sisi;
    }

}


