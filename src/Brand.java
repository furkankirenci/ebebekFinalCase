public class Brand {
    private String name;
    private int id;

    public Brand(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //Markaların isim ve ID bilgilerinin girilmesi
    public static Brand[] brands() {
        Brand[] brandList = new Brand[9];
        brandList[0] = new Brand("Samsung", 1);
        brandList[1] = new Brand("Lenovo", 2);
        brandList[2] = new Brand("Apple", 3);
        brandList[3] = new Brand("Huawei", 4);
        brandList[4] = new Brand("Casper", 5);
        brandList[5] = new Brand("Asus", 6);
        brandList[6] = new Brand("HP", 7);
        brandList[7] = new Brand("Xiaomi", 8);
        brandList[8] = new Brand("Monster", 9);
        return brandList;
    }

    //seçilen ID'ye sahip markayı döndürme
    public static Brand getBrandByID(int id) {
        for (Brand b : Brand.brands()) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
