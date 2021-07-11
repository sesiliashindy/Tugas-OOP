public class Lingkaran {
    int r;
    int d;
    double hasil;
    
    public Lingkaran() {

    }
    public Lingkaran(int r) {
        this.r = r;
    }

    public void setR(int r) {
        this.r = r;
    }
    // public int getD() {
    //     return d;
    // }
    // public void setD(int d) {
    //     this.d = d;
    // }

    public void getKeliling(){
        System.out.println("Keliling Lingkaran: ");
        if (r%7==0) {
            System.out.println(hasil= 2*22*r/7);
        } else {
            System.out.println(hasil= 2*Math.PI*r );
        }
    }
    
    public void getLuas(){
        System.out.println("Luas Lingkaran: ");
        if (r%7==0) {
            System.out.println(hasil= 22*(Math.pow(r, 2)/7));
        } else {
            System.out.println(Math.PI*(Math.pow(r, 2)));
        }
    }

    // public void getDiameter(){
    //     System.out.println(d/2);
    // }
    
}
