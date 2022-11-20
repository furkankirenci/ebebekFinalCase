import java.util.Arrays;
import java.util.Scanner;

public class Print {

    //Telefonları yazdırma
    public static void printPhones(PatikaStore patikaStore) {
        System.out.print("-----Telefonlar-----");
        Phone[] phones = patikaStore.getAllPhones();
        for (Phone p : phones) {
            if (p.getId() != 0){
                System.out.printf("%nID: %1$-7d %2$-20s Marka: %3$-9s Ilk Ucret: %6$-6d Indirim: %5$-5d " +
                                "Son Ucret: %4$-7d RAM: %7$-2d GB\t  Boyut: %9$-4.1f Inc " +
                                "\t Hafiza: %10$-3d GB\t  Pil: %8$-5d mAh \t  Renk: %11$-10s"
                        , p.getId(),p.getName(), p.getBrand().getName(), p.getLastPrice(), p.getDiscount(),p.getPrice(),
                        p.getRam(), p.getBattery(),p.getSize(), p.getMemory(),p.getColor());
            }
        }
        System.out.println();
    }

    //Notebookları yazdırma
    public static void printNotebooks(PatikaStore patikaStore) {
        System.out.print("-----Notebooklar-----");
        Notebook[] notebooks = patikaStore.getAllNotebooks();
        for (Notebook n : notebooks) {
            if (n.getId() != 0)
                System.out.printf("%nID: %1$-7d %2$-20s Marka: %3$-9s Ilk Ucret: %6$-6d Indirim: %5$-5d " +
                                "Son Ucret: %4$-7d RAM: %7$-2d GB \t  Boyut: %8$-4.1f Inc " +
                                "\t Hafiza: %9$-3d GB "
                        , n.getId(),n.getName(), n.getBrand().getName(), n.getLastPrice(), n.getDiscount(),n.getPrice(),
                        n.getRam(),n.getSize(), n.getMemory());

        }
        System.out.println();
    }

    //Tüm ürünleri sıralama
    public static void printAll(PatikaStore patikaStore) {
        printPhones(patikaStore);
        printNotebooks(patikaStore);
    }

    //markaları alfabetik sıraya sokma
    public static void printBrand(PatikaStore patikaStore) {
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
        Print.showProductsWithBrand(brandList, patikaStore);
    }

    //Markaya göre ürünleri alfabetik sıralama
    public static void showProductsWithBrand(String[] brandList, PatikaStore patikaStore) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        System.out.print("Marka Seciniz : ");
        int select = scan.nextInt();
        System.out.println("Secilen Marka " + brandList[select - 1]);
        String selectedBrands = brandList[select - 1];
        System.out.println("---telefonlar---");
        Phone[] phones = patikaStore.getAllPhones();
        for (Phone p : phones) {
            if (selectedBrands.equals(p.getBrand().getName())) {
                System.out.println(p.getName());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Uygun Telefon Bulunamadi");
        }
        counter = 0;
        System.out.println("---notebooklar---");
        Notebook[] notebooks = patikaStore.getAllNotebooks();
        for (Notebook n : notebooks) {
            if (selectedBrands.equals(n.getBrand().getName())) {
                System.out.println(n.getName());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Uygun Notebook Bulunamadi");
        }
    }

    //Cihaza göre ürün listeleme
    public static void filterDevice(PatikaStore patikaStore) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Telefonlar");
        System.out.println("2 - Notebooklar");
        System.out.print("Lutfen Seciniz : ");
        int selectedProduct = scan.nextInt();
        switch (selectedProduct) {
            case 1:
                Print.printPhones(patikaStore);
                break;
            case 2:
                Print.printNotebooks(patikaStore);
                break;
        }
    }


}
