import java.util.Scanner;

public class Delete {
    public static void deleteProduct(PatikaStore patikaStore) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Telefon Sil");
        System.out.println("2 - Notebook Sil");
        System.out.print("Seciminiz urun nedir : ");
        int selected = scan.nextInt();
        switch (selected) {
            case 1:
                Delete.phone(patikaStore);
                break;
            case 2:
                Delete.notebook(patikaStore);
                break;
        }
    }

    //telefon silme
    public static void phone(PatikaStore patikaStore) {
        Scanner scanner = new Scanner(System.in);
        Print.printPhones(patikaStore);
        System.out.println("Silmek istediginiz telefonun ID numarasi nedir : ");
        int selected = scanner.nextInt();
        int id;

        for (Phone p : patikaStore.getAllPhones()) {
            //silinen cihazın ID yi sıfırlama
            if (selected == p.getId()) {
                p.setId(0);
                break;
            }
        }
    }

    //Notebook silme
    public static void notebook(PatikaStore patikaStore) {
        Scanner scanner = new Scanner(System.in);
        Print.printNotebooks(patikaStore);
        System.out.println("Silmek istediginiz notebookun ID numarasi nedir : ");
        int selected = scanner.nextInt();
        int id;

        for (Notebook n : patikaStore.getAllNotebooks()) {
            //silinen cihazın ID yi sıfırlama
            if (selected == n.getId()) {
                n.setId(0);
                break;
            }
        }
    }


}
