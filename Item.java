public class Item {
    //atribut milik dari object Item.
    private double itemPrice;
    private String itemName;
    private String itemCode;
    private int itemStock;
    private double Jumlah;
    private double bayar;

    //Default constructor 
    public Item(){}

    public Item(String name, String code){
        this.itemName = name;
        this.itemCode = code;
    }

    public Item(double price, String code, String name){

    }

    public Item(String name, double price, String code){

    }

    //Konstruktor: dijalankan saat proses instansiasi. 
    public Item(String code, String name, double price, double Jumlah) {
        this.itemCode = code;
        this.itemName = name;
        this.itemPrice = price;
        this.Jumlah = Jumlah;
    }

    public Item(double bayar){
        this.bayar = bayar;
    }

    public int updateStock(int stockUpdate){
        this.itemStock += stockUpdate;
        return itemStock;
    }

    public double getPrice() {
        return itemPrice;
    }

    public String getCode(){
        return itemCode;
    }

    public String getName(){
        return itemName;
    }

    public int getStock(){
        return itemStock;
    }
    public double getQuantity(){
        return Jumlah;
    }

    public double getbayar(){
        return bayar;
    }
    
}