public class Lingkaran implements BangunDatar{
    double r;

    public double kelilinglingkaran(){
        double keliling = (2*22*r)/7;
        return keliling;
    }
    public double luasLingkaran(){
        double luas = (22*(Math.pow(r, 2)/7));
        return luas;
    }

    @Override
    public void gambar(String namaGambar) {
        System.out.println("ini adalah "+namaGambar);
        
    }

    @Override
    public void karakteristik(String isiKarakteristik) {
        System.out.println("salah satu karakteristik lingkaran adalah "+isiKarakteristik);
    }

    @Override
    public void keliling(String nama) {
        System.out.println("keliling dari "+nama+"="+kelilinglingkaran());
    }
    @Override
    public void luas(String nama) {
        System.out.println("luas dari "+nama+" = "+luasLingkaran());
        
    } 
}
