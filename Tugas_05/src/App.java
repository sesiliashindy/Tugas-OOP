import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] paket1 = { "1 Ayam Goreng", "2 Kentang Goreng", "1 Minuman", "1 Burger" };
        String[] paket2 = { "3 Ayam Goreng", "2 Minuman", "1 Kentang Goreng"};
        String[] paket3 = { "2 Ayamn Goreng", "2 Kentang Goreng", "2 Burger"};
        String[] paketMenu = { "Paket A", "Paket B","Paket C", "Ayam Goreng", "Kentang Goreng", "Burger","Minuman"};
        Integer[] harga = { 80000,130000,180000,20000,15000,35000,25000};
        List<String> paketA = new ArrayList<>(Arrays.asList(paket1));
        List<String> paketB = new ArrayList<>(Arrays.asList(paket2));
        List<String> paketC = new ArrayList<>(Arrays.asList(paket3));
        List<String> paketPilihan = new ArrayList<>(Arrays.asList(paketMenu));
        List<Integer> hargaMenu = new ArrayList<>(Arrays.asList(harga));
        // for (String e : paketA) {
        //     System.out.println(e);
        //   }
        
        DetailMenu detailmenu = new DetailMenu();
        Boolean repeat;
        Scanner input = new Scanner(System.in);
        

        do{
        System.out.println("\tMENU PILIHAN\t");
        System.out.println("______________________________________________");
        System.out.println("1. Paket A.................. Rp.80.000,-");
        System.out.println(paketA);
        System.out.println("2. Paket B.................. Rp.130.000,-");
        System.out.println(paketB);
        System.out.println("3. Paket C.................. Rp.180.000,-");
        System.out.println(paketC);
        System.out.println("4. Ayam Goreng.............. Rp.20.000,-/pcs");
        System.out.println("5. Minuman.................. Rp.15.000,-/pcs");
        System.out.println("6. Burger................... Rp.35.000,-/pcs");
        System.out.println("7. Kentang Goreng........... Rp.25.000,-/pcs");
        System.out.println("8. Manual");
        System.out.println("9. EXIT");
        System.out.println("______________________________________________");
        System.out.println("Input Nomor Menu ");
        int number = input.nextInt();
        input.nextLine();
        switch (number) {
            case 1:
                detailmenu.setNamaBarang("Paket A");
                System.out.println("Jumlah Paket A yang dipesan: ");
                int inputA = input.nextInt();
                List<Integer> amountA = new ArrayList<>();
                amountA.add(inputA);
                detailmenu.setJumlah(inputA);
                detailmenu.setHarga(hargaMenu.get(0));
                System.out.println("\tDetail Pembelanjaan\t");
                System.out.println("______________________________________________");
                detailmenu.receiptPembayaran();
                System.out.println("______________________________________________");
            
                // System.out.println("Total Harga: "+"Rp."+detailmenu.getTotalHarga());
                
                // detailmenu.getTotalHarga();
                // System.out.println(hargaMenu.get(1));

                break;
            case 2:
                detailmenu.setNamaBarang("Paket B");
                System.out.println("Jumlah Paket B yang dipesan: ");
                int inputB = input.nextInt();
                List<Integer> amountB = new ArrayList<>();
                amountB.add(inputB);
                detailmenu.setJumlah(inputB);
                detailmenu.setHarga(hargaMenu.get(1));
                System.out.println("______________________________________________");
                detailmenu.receiptPembayaran();
                System.out.println("______________________________________________");
                // System.out.println("Total Harga: "+"Rp."+detailmenu.getTotalHarga());

                break;
            case 3:
                detailmenu.setNamaBarang("Paket C");
                System.out.println("Jumlah Paket C yang dipesan: ");
                int inputC = input.nextInt();
                List<Integer> amountC = new ArrayList<>();
                amountC.add(inputC);
                detailmenu.setJumlah(inputC);
                detailmenu.setHarga(hargaMenu.get(2));
                System.out.println("______________________________________________");
                detailmenu.receiptPembayaran();
                System.out.println("______________________________________________");
                // System.out.println("Total Harga: "+"Rp."+detailmenu.getTotalHarga());
                break;
            case 4:
                detailmenu.setNamaBarang("Ayam Goreng");
                System.out.println("Jumlah Ayam Goreng yang dipesan: ");
                int inputAyam = input.nextInt();
                List<Integer> ayam = new ArrayList<>();
                ayam.add(inputAyam);
                detailmenu.setJumlah(inputAyam);
                detailmenu.setHarga(hargaMenu.get(3));
                System.out.println("______________________________________________");
                detailmenu.receiptPembayaran();
                System.out.println("______________________________________________");
                break;
            case 5:
                detailmenu.setNamaBarang("Minuman");
                System.out.println("Jumlah Minuman yang dipesan: ");
                int inputAMinuman= input.nextInt();
                List<Integer> minuman = new ArrayList<>();
                minuman.add(inputAMinuman);
                detailmenu.setJumlah(inputAMinuman);
                detailmenu.setHarga(hargaMenu.get(4));
                System.out.println("______________________________________________");
                detailmenu.receiptPembayaran();
                System.out.println("______________________________________________");
                break;
            case 6:
                detailmenu.setNamaBarang("Burger");
                System.out.println("Jumlah Burger yang dipesan: ");
                int inputBurger = input.nextInt();
                detailmenu.setJumlah(inputBurger);
                detailmenu.setHarga(hargaMenu.get(5));
                System.out.println("______________________________________________");
                detailmenu.receiptPembayaran();
                System.out.println("______________________________________________");
                
                break;
            case 7:
                detailmenu.setNamaBarang("Kentang Goreng");
                System.out.println("Jumlah Kentang Goreng yang dipesan: ");
                int inputKentang = input.nextInt();
                detailmenu.setJumlah(inputKentang);
                detailmenu.setHarga(hargaMenu.get(2));
                System.out.println("______________________________________________");
                detailmenu.receiptPembayaran();
                System.out.println("______________________________________________");
                break;
            case 8:
                List<String> menuList = new ArrayList<>();
                List<Integer> amount = new ArrayList<>();
                List<Integer> harga1 = new ArrayList<>();
                Boolean repeat1 = true;
                do {
                    System.out.println("Nama Pesanan: ");
                    String inputMenu = input.nextLine();
                    if (paketPilihan.contains(inputMenu)) {
                        // detailmenu.setNamaBarang(inputMenu);
                        menuList.add(inputMenu);
                        detailmenu.setListMenu(menuList);
                        detailmenu.setNamaBarang(inputMenu);
                        // System.out.println("ada Menu");
                    } else {
                        System.out.println("Menu Tidak Ada");
                    }
                    System.out.println("Jumlah yang dipesan: ");
                    int inputAmount = input.nextInt();
                    input.nextLine();
                    amount.add(inputAmount);
                    detailmenu.setQuantity(amount);
                    detailmenu.setJumlah(inputAmount);
                    // paketPilihan.indexOf(inputMenu);
                    harga1.add(hargaMenu.get(paketPilihan.indexOf(inputMenu)));
                    detailmenu.setPrice(harga1);
                    detailmenu.setJumlah(inputAmount);
                    System.out.println("Ingin menambah pesanan?(Y/N)");
                    String input1 = input.nextLine();
                    if (input1.equalsIgnoreCase("Y")) {
                        repeat1 = true;
                    } else {
                        repeat = false;
                        System.out.println("______________________________________________");
                        detailmenu.manual();
                        System.out.println("______________________________________________");
                    }
                } while (repeat1);
                break;      
            case 9:
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
