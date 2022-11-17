public abstract class Product {
    private int id;
    private String name;
    private int brandID;
    private Brand brand;
    private int price;
    private int discount;
    private int stock;
    private int ram;
    private double size;
    private int memory;


    public Product(int id, String name, int brandID, int price, int discount, int stock, int ram, double size, int memory) {
        this.id = id;
        this.name = name;
        this.brandID = brandID;
        this.brand = Brand.getBrandByID(brandID);
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.ram = ram;
        this.size = size;
        this.memory = memory;
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
