import java.util.Scanner;

public class Add {

    public static ProductList addProduct(ProductList productList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Telefon Ekle");
        System.out.println("2 - Notebook Ekle");
        System.out.print("Secimiz nedir : ");
        int selected = scan.nextInt();
        switch (selected) {
            case 1:
                Add.phone(productList);
                break;
            case 2:
                Add.notebook(productList);
                break;
        }
        return productList;
    }

    public static ProductList phone(ProductList productList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Urun eklenecektir");
        System.out.print("Urunun adi : ");
        String name = scan.nextLine();
        System.out.print("Urunun rengi : ");
        String color = scan.nextLine();
        System.out.print("Urun marka kodu : ");
        int brandID = scan.nextInt();
        while (brandID < 1 || brandID > Brand.brands().length){
            System.out.println("Marka bulunamadı, tekrar giriniz");
            brandID = scan.nextInt();
        }
        System.out.print("Urunun fiyati : ");
        int price = scan.nextInt();
        System.out.print("Urundeki indirim orani : ");
        int discount = scan.nextInt();
        System.out.print("Urun stok satisi : ");
        int stock = scan.nextInt();
        System.out.print("Urunun Ram boyutu : ");
        int ram = scan.nextInt();
        System.out.print("Urunun boyutu : ");
        double size = scan.nextDouble();
        System.out.print("Urunun pil gucu : ");
        int battery = scan.nextInt();
        System.out.print("Urunun hafizasi : ");
        int memory = scan.nextInt();
        Phone[] phones = productList.getAllPhones();
        int n = phones.length;
        Phone p1 = new Phone(1001 + n, name, brandID, price, discount, stock, ram, size, battery, color, memory);
        phones = Add.addPhone(n, phones, p1);
        productList.setAllPhones(phones);
        return productList;
    }

    public static Phone[] addPhone(int n, Phone[] phones, Phone p1) {
        Phone phone = p1;
        int i;

        Phone[] newarr = new Phone[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = phones[i];
        newarr[n] = p1;
        for (Phone p : newarr) {
            System.out.println(p.getName());
        }
        System.out.println("===============================");
        System.out.println("--Urun ekleme Basarili--");
        return newarr;
    }

    public static void notebook(ProductList productList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Urun eklenecektir");
        System.out.print("Urunun adi : ");
        String name = scan.nextLine();
        System.out.print("Urun marka kodu : ");
        int brandID = scan.nextInt();
        while (brandID < 1 || brandID > Brand.brands().length){
            System.out.println("Marka bulunamadı, tekrar giriniz");
            brandID = scan.nextInt();
        }
        System.out.print("Urunun fiyati : ");
        int price = scan.nextInt();
        System.out.print("Urundeki indirim orani : ");
        int discount = scan.nextInt();
        System.out.print("Urun stok satisi : ");
        int stock = scan.nextInt();
        System.out.print("Urunun Ram boyutu : ");
        int ram = scan.nextInt();
        System.out.print("Urunun boyutu : ");
        double size = scan.nextDouble();
        System.out.print("Urunun hafizasi : ");
        int memory = scan.nextInt();
        Notebook[] notebooks = productList.getAllNotebooks();
        int n = notebooks.length;
        Notebook n1 = new Notebook(2001 + n, name, brandID, price, discount, stock, ram, size, memory);
        notebooks = Add.addNotebook(n, notebooks, n1);
        productList.setAllNotebooks(notebooks);
    }

    public static Notebook[] addNotebook(int n, Notebook[] notebooks, Notebook n1) {
        Notebook notebook = n1;
        int i;

        Notebook[] newarr = new Notebook[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = notebooks[i];
        newarr[n] = n1;
        for (Notebook k : newarr) {
            System.out.println(k.getName());
        }
        System.out.println("===============================");
        System.out.println("--Urun ekleme Basarili--");
        return newarr;
    }


}
