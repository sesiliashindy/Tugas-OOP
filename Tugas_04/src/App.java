import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Person person = new Person();
        Student student = new Student();
        
        Scanner input = new Scanner(System.in);

        System.out.println("Nama mahasiswa ");
        System.out.println("Nama depan: ");
        String firstName = input.nextLine();
        student.firstName = firstName;
        System.out.println("Nama belakang: ");
        String lastName = input.nextLine();
        student.lastName = lastName;
        System.out.println("Kota Domisili: ");
        String domisili = input.next();
        student.setDomisili(domisili);
        // person.getFullName();
        // System.out.println(person.getFullName()); 
        
        System.out.println("Nomor Mahasiswa: ");
        String studentCode = input.next();
        student.studentCode = studentCode;
        student.studentRegistration();
        student.learningPlan();
    
        input.close(); 

        // String firstName[] = new String[0];
        // String lastName[] = new String[0];

        // Boolean repeat=true;
        // do{
        //     System.out.println("Masukkan Pilihan Anda: ");
        //     System.out.println("1. Input Data Baru");
        //     System.out.println("2. Daftar Matkul & Total SKS");
        //     System.out.println("3. Status Mahasiswa");
        //     System.out.println("4. Exit");
        //     int number = input.nextInt();
        //         switch (number) {
        //             case 1:
        //                 System.out.println("Nama mahasiswa ");
        //                 System.out.println("Nama depan: ");
        //                 String firstName = input.next();
        //                 person.firstName = firstName;
        //                 System.out.println("Nama belakang: ");
        //                 String lastName = input.next();
        //                 person.lastName = lastName;
        //                 System.out.println("Kota Domisili: ");
        //                 String domisili = input.next();
        //                 person.setDomisili(domisili);
                        
                        

        //                 System.out.println("Input Kode Room= ");
        //                 int roomCode = input.nextInt();
        //                 student.roomCode = roomCode;

                        
                        
        //                 student.jumlahSks();

        //                 // String matkul = input.next();
        //                 // student.courseName = matkul;
        //                 // System.out.println("Input sks= ");
        //                 // int sks = input.nextInt();
        //                 // student.setSks(sks);
        //                 // int sum = Arrays.stream(arr).sum();
                        

        //                 // student.learningPlan();
                        

        //                 break;
        //             case 2:
        //                 // System.out.println("Nama mahasiswa= ");
        //                 // String name1 = input.nextLine();
                        
                        

                        
                       
        //                 break;
        //             case 3:
        //                 System.out.println("Nama mahasiswa= ");
        //                 String name2 = input.nextLine();
        //                 System.out.println("Status Mahasiswa: ");
        //                 student.learningPlan();
                        
        //                 break;
        //             case 4:
        //                 System.exit(0);
        //             default:
        //                 System.out.println("Invali3d Number");
        //                 break;
        //         } 
        //     } while (repeat); 
        //     input.close(); 
    }
}
