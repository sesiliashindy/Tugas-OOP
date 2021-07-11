public class Persegi {
    int sisi;
    
    public Persegi(int sisi){
        this.sisi = sisi;
    }

    public Persegi() {
    }

    public void getKeliling(){
        System.out.println("Keliling Persegi: ");
        System.out.println(4*sisi);
    }

    public void getLuas(){
        System.out.println("Luas Persegi: ");
        System.out.println(sisi*sisi);
    }

}
