import java.util.Scanner;

public class Delete {
    public static void deleteProduct(ProductList productList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Telefon Sil");
        System.out.println("2 - Notebook Sil");
        System.out.print("Seciminiz urun nedir : ");
        int selected = scan.nextInt();
        switch (selected) {
            case 1:
                Delete.phone(productList);
                break;
            case 2:
                Delete.notebook(productList);
                break;
        }
    }

    //telefon silme
    public static void phone(ProductList productList) {
        Scanner scanner = new Scanner(System.in);
        Print.printPhones(productList);
        System.out.println("Silmek istediginiz telefonun ID numarasi nedir : ");
        int selected = scanner.nextInt();
        int id;

        for (Phone p : productList.getAllPhones()) {
            //silinen cihazın ID yi sıfırlama
            if (selected == p.getId()) {
                p.setId(0);
                break;
            }
        }
    }

    //Notebook silme
    public static void notebook(ProductList productList) {
        Scanner scanner = new Scanner(System.in);
        Print.printNotebooks(productList);
        System.out.println("Silmek istediginiz notebookun ID numarasi nedir : ");
        int selected = scanner.nextInt();
        int id;

        for (Notebook n : productList.getAllNotebooks()) {
            //silinen cihazın ID yi sıfırlama
            if (selected == n.getId()) {
                n.setId(0);
                break;
            }
        }
    }


}
