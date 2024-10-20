import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Cashier cashier = new Cashier();
        //variable "cashier" --> instance of class Cashier 
        Scanner scanner = new Scanner(System.in);
        char inputChar;
        
       do{
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Tampilkan struk pembayaran");
            System.out.println("4. Lakukan pembayaran");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    scanner.nextLine();
                    String addCode = scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String addName = scanner.nextLine();
                    System.out.print("Masukkan harga barang: ");
                    double addPrice = scanner.nextDouble();
                    System.out.print("Masukkan jumlah barang : ");
                    double addQuantity = scanner.nextDouble();
                    
                    cashier.addItem(addPrice, addCode, addName, addQuantity);
                    break;
                case 2:
                    System.out.print("Masukkan kode barang yang akan dihapus: ");
                    String removeCode = scanner.next();
                    cashier.removeItem(removeCode);
                    break;
                case 3:
                    cashier.Struk();
                    cashier.displayTotal();
                    break;
                case 4:
                    System.out.println("Masukkan pembayaran anda (Dalam Rupiah) : ");
                    double payment = scanner.nextDouble();
                    cashier.displayTotal();
                    cashier.Kembalian(payment);
                    break;
                case 5:
                    System.out.println("Terimakasih sudah berbelanja");
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
            System.out.print("Ingin Memilih menu lain (y/n) : ? ");
            inputChar = scanner.next().charAt(0);
        }while(inputChar == 'y' || inputChar == 'Y');
        System.out.println("Terimakasih sudah berbelanja!!");
    }
}