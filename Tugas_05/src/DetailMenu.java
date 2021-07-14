import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DetailMenu implements ReceiptService {
    private String namaBarang;
    private int jumlah;
    private int harga;
    private int bayar;
    private List<String> listMenu;
    private List<Integer> quantity;
    private List<Integer> price;

    public void setListMenu(List<String> listMenu){
        this.listMenu = listMenu;
    }

    public void setQuantity(List<Integer> quanity){
        this.quantity = quanity;
    }

    public void setPrice(List<Integer> price){
        this.price = price;
    }

    public int getBayar() {
        return bayar;
    }
    public void setBayar(int bayar) {
        this.bayar = bayar;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotalHarga(){
        int getTotalHarga = jumlah*harga;
        return getTotalHarga;
    }


    public int getTotalPajak(){
        int getTotalPajak = (harga*10)/100;
        return getTotalPajak;
    }

    public int getTotal(){
        int getTotal = (jumlah*harga)+(harga*10)/100;
        return getTotal;
    }

    public void manual(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Date Time now : " + dateTime);
        String formattedDate = dateTime.format(formatter);
        System.out.println(formattedDate);
        for (int i=0; i<listMenu.size(); i++) {
            System.out.println((i+1)+"\t"+listMenu.get(i)+"\t"+quantity.get(i)+"\t"+price.get(i));
        }
        System.out.println("Total Harga: \t"+"Rp."+getTotalHarga());
        System.out.println("Total Pajak: \t"+"Rp."+getTotalPajak());
        System.out.println("Total = \t"+"Rp."+getTotal());
    }

    @Override
    public void receiptPembayaran() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Date Time now : " + dateTime);
        String formattedDate = dateTime.format(formatter);
        System.out.println(formattedDate);
        System.out.println(getNamaBarang());
        // System.out.println(listMenu);
        // for (String listMenu1 : listMenu) {
        //     System.out.println("Nama Pesanan\t"+"x"+listMenu1);
        // }
        // for (int quantity1 : quantity) {
        //     System.out.println("Jumlah Pesanan\t"+"x"+quantity1);
        // }
        System.out.println("Total Harga: \t"+"Rp."+getTotalHarga());
        System.out.println("Total Pajak: \t"+"Rp."+getTotalPajak());
        System.out.println("Total = \t"+"Rp."+getTotal());
    }
}
