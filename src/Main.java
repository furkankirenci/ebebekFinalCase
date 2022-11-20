import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isContinue = true;
        ProductList productList = ProductList.productList();


        System.out.println("###PatikaStore'a Hosgeldiniz###");
        while (isContinue == true) {
            System.out.println("=========================================");
            System.out.println("0 - Cikis");
            System.out.println("1 - Tum Urunler");
            System.out.println("2 - Urune Gore Filtreleme");
            System.out.println("3 - Markaya Gore Filtrele");
            System.out.println("4 - Urun Ekle");
            System.out.println("5 - Urun Sil");
            System.out.print("Lutfen Seciniz : ");
            int selected = scan.nextInt();
            System.out.println("-----------------------------------------");
            switch (selected) {
                case 0:
                    isContinue = false;
                    System.out.println("Yeniden Bekleriz");
                    break;
                case 1:
                    Print.printAll(productList);
                    break;
                case 2:
                    Print.filterDevice(productList);
                    break;
                case 3:
                    Print.printBrand(productList);
                    break;
                case 4:
                    Add.addProduct(productList);
                    break;
                case 5:
                    Delete.deleteProduct(productList);
                    break;
                default:
                    System.out.println("Gecersiz deger girdiniz, tekrar giriniz.");
            }
        }
    }
}
