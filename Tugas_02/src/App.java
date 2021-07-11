import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Segitiga segitiga = new Segitiga();
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        Prisma prisma = new Prisma();
        Kubus kubus = new Kubus();
        Bola bola = new Bola();
        Boolean repeat;
        Scanner input = new Scanner(System.in);

        do{
        System.out.println("Masukkan Pilihan Anda: ");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Lingkaran");
        System.out.println("4. Prisma");
        System.out.println("5. Kubus");
        System.out.println("6. Bola");
        System.out.println("7. Exit");
        int number = input.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Nilai Alas Segitiga= ");
                    int inputAlas = input.nextInt();
                    segitiga.setAlas(inputAlas);
                    System.out.println("Nilai Tinggi Segitiga= ");
                    int inputTinggi = input.nextInt();
                    segitiga.setTinggi(inputTinggi);
                    System.out.println("Nilai Sisi Segitiga= ");
                    int inputSisiSegitiga = input.nextInt();
                    segitiga.setSisi(inputSisiSegitiga);
                    
                    segitiga.getKeliling();
                    segitiga.getLuas();
                    break;
                case 2:
                    System.out.println("Nilai Sisi Persegi= ");
                    int inputSisiPersegi = input.nextInt();
                    persegi.sisi = inputSisiPersegi;
                    
                    persegi.getKeliling();
                    persegi.getLuas();
                    break;
                case 3:
                    System.out.println("Nilai Jari-jari= ");
                    int inputJari = input.nextInt();
                    lingkaran.setR(inputJari);
                    
                    lingkaran.getKeliling();
                    lingkaran.getLuas();

                    break;
                case 4:
                    System.out.println("Nilai Alas Prisma= ");
                    int inputAlasPrisma = input.nextInt();
                    prisma.setAlas(inputAlasPrisma);
                    System.out.println("Nilai Tinggi Alas Prisma= ");
                    int inputTinggiAlas = input.nextInt();
                    prisma.setTinggi(inputTinggiAlas);
                    System.out.println("Nilai Tinggi Prisma= ");
                    int inputTinggiPrisma = input.nextInt();
                    prisma.setTinggiPrisma(inputTinggiPrisma);

                    prisma.getVolume();
                    break;
                case 5:
                    System.out.println("Nilai Sisi Kubus= ");
                    int inputKubus = input.nextInt();
                    kubus.sisi = inputKubus;
                    kubus.getVolume();
                    break;
                case 6:
                    System.out.println("Nilai Jari-jari Bola= ");
                    int inputrBola = input.nextInt();
                    bola.setR(inputrBola);

                    bola.getVolume();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invali3d Number");
                    break;
            } 
            System.out.println("Apakah anda ingin menginput ulang (Y/N)? ");
            String n = input.next();
            if (n.equalsIgnoreCase("Y")) {
                repeat = true;
            } else {
                repeat = false;
            } 

        } while (repeat); 
        input.close(); 
    }
}
