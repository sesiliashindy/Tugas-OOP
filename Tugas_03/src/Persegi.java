public class Persegi implements BangunDatar {
    int sisi;

    public int kelilingPersegi(){
        int kelilingPersegi = 4*sisi;
        return kelilingPersegi;
    }

    public int luasPersegi(){
        int luas = sisi*sisi;
        return luas;
    }

    @Override
    public void gambar(String namaGambar) {
        System.out.println("ini adalah "+namaGambar);
        
    }

    @Override
    public void karakteristik(String isiKarakteristik) {
        System.out.println("salah satu karakteristik persegi adalah "+isiKarakteristik);
        
    }

    @Override
    public void keliling(String nama) {
        System.out.println("keliling dari "+nama+"="+kelilingPersegi());
        
    }

    @Override
    public void luas(String nama) {
        System.out.println("luas dari "+nama+" = "+luasPersegi());
        
    }
}
