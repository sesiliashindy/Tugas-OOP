public class Segitiga implements BangunDatar {
    double tinggi;
    double alas;
    double sisi;

    public double kelilingSegitiga(){
        double kelilingSegitiga = alas+sisi+tinggi;
        return kelilingSegitiga;
    }

    public double luasSegitiga(){
        double luasSegitiga = (alas*tinggi)/2;
        return luasSegitiga;
    }

    @Override
    public void gambar(String namaGambar) {
        System.out.println("ini adalah "+namaGambar);
    }

    @Override
    public void karakteristik(String isiKarakteristik) {
        System.out.println("salah satu karakteristik segitiga adalah "+isiKarakteristik);
    }

    @Override
    public void keliling(String nama) {
        System.out.println("keliling dari "+nama+"="+kelilingSegitiga());
        
    }

    @Override
    public void luas(String nama) {
        System.out.println("luas dari "+nama+" = "+luasSegitiga());
    }

    // public void tes(){
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println("Karakteristik dari segitiga yang ke "+i);
    //     }
    // }
}
