package tugas4;

public class Segitiga extends BangunDatar{
    private float a,t;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }
    
    
    @Override
    public float luas() {
       return 0.5f * a * t;
    }

    @Override
    public float keliling() {
        return 3 *a;
    }
    
    
}
