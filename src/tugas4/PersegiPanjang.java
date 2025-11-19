package tugas4;

public class PersegiPanjang extends BangunDatar{
    private float p,l;

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }

    @Override
    public float luas() {
        return p*l;
    }

    @Override
    public float keliling() {
         
        return 2*(p+l);
    }
    
    
}
