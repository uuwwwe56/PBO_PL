package tugas5;

public class PersegiPanjang implements BangunDatar{
    float p,l;

    public void setP(float p) {
        this.p = p;
    }

    public void setL(float l) {
        this.l = l;
    }
    
    

    @Override
    public float Luas() {
        return p*l;
    }

    @Override
    public float Keliling() {
       return 2*(p+l);
    }
    
    
}
