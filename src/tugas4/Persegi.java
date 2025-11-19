package tugas4;

public class Persegi extends BangunDatar{
    private float sisi;

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
       return sisi*sisi;
    }

    @Override
    public float keliling() {
        return 4 * sisi;
    }
    
    
    
    
    
    
}
