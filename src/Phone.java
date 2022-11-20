public class Phone extends Product {
    private int battery;
    private String color;


    public Phone(int id, String name, int brandID, int price, int discount, int stock, int ram, double size, int battery, String color, int memory) {
        super(id, name, brandID, price, discount, stock, ram, size, memory);
        this.battery = battery;
        this.color = color;
    }

    //add new phone
    public static Phone[] phones() {
        Phone[] phones = new Phone[6];
        phones[0] = new Phone(1001, "Xiaomi RedMi Note 6", 8, 5000, 10, 100, 8, 5, 4000, "mavi", 64);
        phones[1] = new Phone(1002, "Lenovo A6000", 2, 7000, 10, 100, 8, 5, 4000, "siyah", 128);
        phones[2] = new Phone(1003, "Huawei P20", 4, 2000, 15, 100, 3, 5.5, 4000, "siyah", 64);
        phones[3] = new Phone(1004, "Huawei P40", 4, 8000, 15, 100, 3, 5.5, 4000, "mavi", 32);
        phones[4] = new Phone(1005, "Samsung Galaxy S20", 1, 2000, 15, 100, 3, 5.5, 4000, "kirmizi", 64);
        phones[5] = new Phone(1006, "Iphone 11", 3, 15000, 10, 100, 12, 7.3, 6000, "mavi", 264);
        return phones;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
