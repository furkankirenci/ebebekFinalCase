public class Phone extends Product{
    private String size;
    private int battery;
    private String color;
    public Phone(int id, String name, int brandID, int price, int discount, int stock, int ram, String size, int battery, String color) {
        super(id, name, brandID, price, discount, stock, ram);
        this.size = size;
        this.battery = battery;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
