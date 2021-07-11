public class Segitiga {
    double tinggi;
    double alas;
    int sisi;
    double hasil;

    public Segitiga() {

    }

    public Segitiga(int tinggi,int alas,int sisi ) {
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisi = sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void getKeliling(){
        System.out.println("Keliling Segitiga: ");
        System.out.println((hasil= alas+sisi+tinggi));
    }

    public void getLuas(){
        System.out.println("Luas Segitiga: ");
        System.out.println(((hasil= alas*tinggi)/2));
    }

    public double luas(){
        // System.out.println("Luas Segitiga: ");
        double luas= (alas*tinggi)/2;
        return luas;
    }

    // public double sisiMiring(){
    //     double sisiMiring = Math.sqrt(Math.pow(alas, 2)+Math.pow(tinggi, 2));
    //     // System.out.println("Sisi Miring: ");
    //     // System.out.println((Math.sqrt(Math.pow(this.alas, 2)+Math.pow(this.tinggi, 2))));
    //     return sisiMiring;
    // }

}
