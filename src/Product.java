public abstract class Product {
    private int id;
    private String name;
    private int brandID;
    private Brand brandName;
    private int price;
    private int discount;
    private int stock;
    private int ram;


    public Product(int id, String name, int brandID, int price, int discount, int stock, int ram) {
        this.id = id;
        this.name = name;
        this.brandID = brandID;
        this.brandName = Brand.getBrandByID(brandID);
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public Brand getBrandName() {
        return brandName;
    }

    public void setBrandName(Brand brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getRam(){
        return ram;
    }

    public void setRam(int ram){
        this.ram = ram;
    }
}
