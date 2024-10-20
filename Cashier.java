import java.util.ArrayList;

public class Cashier {
    private ArrayList<Item> items;

    public Cashier() {
        items = new ArrayList<>();
    }

    public void addItem(double p, String c, String n,double  j) {
        items.add(new Item(c, n, p, j));
        System.out.println("Barang ditambahkan.");
    }

    public void removeItem(String code) {
        for (Item item : items) {
            if (item.getCode() == code) {
                items.remove(item);
                System.out.println("Barang dihapus.");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

    public void displayTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        System.out.println("Total belanja: " + total);
        System.out.println("============================");
        System.out.println();
    }

    public void Struk(){
        System.out.println("Struk Belanja");
        for (Item item : items) {
            System.out.println("========================================");
            System.out.println("Kode Barang : " + item.getCode());
            System.out.println("Nama Barang : " + item.getName());
            System.out.println("Harga Barang : " + item.getPrice());
            System.out.println("Jumlah Barang : " + item.getQuantity());
            System.out.println("=========================================");
            }

    }
    public void Kembalian(double payment){
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
           

        }
         System.out.println("Uang anda : " + payment);
        System.out.println("Total Kembalian: " + (payment - total));
    }
}