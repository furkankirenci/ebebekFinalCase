import java.util.Arrays;
import java.util.Scanner;

public class Print {
    public static void printPhones(ProductList productList) {
        System.out.println("-----Telefonlar-----");
        Phone[] phones = productList.getAllPhones();
        for (Phone p : phones) {
            System.out.println(p.getName());
        }
    }

    public static void printNotebooks(ProductList productList) {
        System.out.println("-----Notebooklar-----");
        Notebook[] notebooks = productList.getAllNotebooks();
        for (Notebook n : notebooks) {
            System.out.println(n.getName());
        }
    }

    public static void printAll(ProductList productList) {
        printPhones(productList);
        printNotebooks(productList);
    }

//markaları alfabetik sıraya sokma
    public static void printBrand(ProductList productList) {
        Scanner scanner = new Scanner(System.in);
        int add = 0;
        String[] brandList = new String[Brand.brands().length];
        for (Brand brands : Brand.brands()) {
            brandList[add++] = brands.getName();
        }
        Arrays.sort(brandList);
        add = 1;
        for (String brands : brandList) {
            System.out.println(add++ + " - " + brands);
        }
        Print.showProductsWithBrand(brandList, productList);
    }

//Markaya göre ürünleri alfabetik sıralama
    public static void showProductsWithBrand(String[] brandList, ProductList productList) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        System.out.print("Marka Seciniz : ");
        int select = scan.nextInt();
        System.out.println("Secilen Marka "+ brandList[select-1]);
        String selectedBrands = brandList[select-1];
        System.out.println("---telefonlar---");
        Phone[] phones = productList.getAllPhones();
        for (Phone p : phones){
            if (selectedBrands.equals(p.getBrand().getName())){
                System.out.println(p.getName());
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("Uygun Telefon Bulunamadi");
        }
        counter = 0;
        System.out.println("---notebooklar---");
        Notebook[] notebooks = productList.getAllNotebooks();
        for (Notebook n : notebooks){
            if (selectedBrands.equals(n.getBrand().getName())){
                System.out.println(n.getName());
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("Uygun Notebook Bulunamadi");
        }
    }
//Cihaza göre ürün listeleme
    public static void filterDevice(ProductList productList){
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Telefonlar");
        System.out.println("2 - Notebooklar");
        System.out.print("Lutfen Seciniz : ");
        int selectedProduct = scan.nextInt();
        switch (selectedProduct){
            case 1:
                Print.printPhones(productList);
                break;
            case 2:
                Print.printNotebooks(productList);
                break;
        }
    }


}
