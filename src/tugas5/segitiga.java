package tugas5;

public class segitiga implements BangunDatar{
 private float a,t;

    public void setA(float a) {
        this.a = a;
    }

    public void setT(float t) {
        this.t = t;
    }

    @Override
    public float Luas() {
      return 0.5f *a*t;
    }

    @Override
    public float Keliling() {
        return 3 *a;
    }

        
}
