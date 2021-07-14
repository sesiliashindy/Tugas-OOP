import service.StudentService;
import java.util.Scanner;

public class Student extends Person implements StudentService {
    String studentCode;
    int roomCode;
    // String courseName;
    private int sks;
    int jumlah=0;

    public int getSks() {
        return sks;
    }

    // public void setSks(int sks) {
    //     this.sks = sks;
    // }

    // public int countSks(String courseName){
    //     return sks+=30;
    // }

    // public void jumlahSks() {
    //     System.out.println("Total SKS: " + jumlah);
    // }

    @Override
    public void studentRegistration() {
       System.out.println("Nama Lengkap: "+getFullName());
       System.out.println("Nomor Mahasiswa:  "+studentCode);
       System.out.println("Kota domisili: "+getDomisili());
    }

    @Override
    public void learningPlan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Jumlah Matkul= ");
            int n = input.nextInt();
            String matkul[] = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Input Matakuliah= ");
                matkul [i] = input.next();
                // countSks(matkul[i]);
            }

        for (int i = 0; i < n; i++) {
            System.out.println("Matakuliah yang diambil:"+matkul[i]);
        }
        // System.out.println("nama matkul"+" "+courseName);

        Integer sks[] = new Integer[n]; 
        for (int i = 0; i < n; i++) {
            System.out.println("Jumlah sks: ");
            sks[i] = input.nextInt();
            jumlah = jumlah+sks[i];
        }
        System.out.println("Total sks: "+jumlah);

        System.out.println("Input Kode Ruangan(number)= ");
        roomCode = input.nextInt();

        System.out.println("ruangan kuliah"+" "+roomCode);
        // jumlahSks();

        if (jumlah>=144) {
            System.out.println(getFullName()+" "+ "S.Si");
        } else {
            System.out.println("Mahasiswa");
        }
        input.close(); 
    }    
}
