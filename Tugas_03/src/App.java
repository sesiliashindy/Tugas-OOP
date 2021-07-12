public class App {
    public static void main(String[] args) throws Exception {
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi();
        
        persegi.sisi = 5;
        persegi.gambar("Persegi");
        persegi.karakteristik("Memiliki 4 rusuk yang sama panjang.");
        persegi.keliling("Persegi");
        persegi.luas("Persegi");
        

        System.out.println();
        segitiga.alas = 3;
        segitiga.tinggi = 3;
        segitiga.alas = 3;
        segitiga.gambar("Segitiga");
        segitiga.karakteristik("memiliki ketiga sisi yang sama panjangnya.");
        segitiga.keliling("Segitiga");
        segitiga.luas("Segitiga");

        System.out.println();
        lingkaran.r = 14;
        lingkaran.gambar("Lingkaran");
        lingkaran.karakteristik("Tidak mempunyai titik sudut.");
        lingkaran.keliling("Lingkaran");
        lingkaran.luas("Lingkaran");
    }
}
