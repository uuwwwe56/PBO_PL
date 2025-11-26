package tugas5;

public class lingkaran implements BangunDatar{
float r;

    public void setR(float r) {
        this.r = r;
    }


     @Override
    public float Luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float Keliling() {
        return (float) (2 * Math.PI * r);
    }
    
}
