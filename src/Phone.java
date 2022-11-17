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
        Phone[] phones = new Phone[5];
        phones[0] = new Phone(1001, "Xiaomi RedMi Note 6", 8, 5000, 10, 100, 8, 5, 4000, "Yellow", 64);
        phones[1] = new Phone(1002, "Lenovo A6000", 2, 3000, 10, 100, 8, 5, 4000, "black", 128);
        phones[2] = new Phone(1003, "Huawei P20", 4, 2000, 15, 100, 3, 5.5, 4000, "red", 64);
        phones[3] = new Phone(1003, "Huawei P21", 4, 2000, 15, 100, 3, 5.5, 4000, "red", 64);
        phones[4] = new Phone(1003, "Huawei P22", 4, 2000, 15, 100, 3, 5.5, 4000, "red", 64);
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
