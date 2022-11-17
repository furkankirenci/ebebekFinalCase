import java.util.Scanner;

public class Add {

    public static void phone(ProductList pro1){
        Scanner scan = new Scanner(System.in);
        System.out.println("Urun eklenecektir");
        System.out.print("Urunun adi : ");
        String name = scan.nextLine();
        System.out.print("Urunun rengi : ");
        String color = scan.nextLine();
        System.out.print("Urun marka kodu : ");
        int brandID = scan.nextInt();
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
        Phone p1 = new Phone(5,name,brandID,price,discount,stock,ram,size,battery,color,memory);
        Phone[] phones = ProductList.productList().getAllPhones();
        int n = phones.length;
        System.out.println("size phones : " + phones.length);
        phones = Add.addPhone(n, phones, p1);
        System.out.println("size phones : " + phones.length);
//        ProductList.productList().setAllPhones(phones);
        pro1.setAllPhones(phones);

//        Phone.allPhones(addedPhones);
//        p1.getAllPhones();


        for (Phone p : pro1.getAllPhones()) {
            System.out.println(p.getName());
            System.out.println("-----------");
        }
    }





    public static Phone[] addPhone(int n, Phone[] phones, Phone p1){
        Phone phone = p1;
        int i;

        Phone[] newarr = new Phone[n+1];
        for (i = 0; i < n; i++)
            newarr[i] = phones[i];
        newarr[n] = p1;
        for (Phone p : newarr){
            System.out.println(p.getName());
        }
        System.out.println("===============================");
        System.out.println("--Urun ekleme Basarili--");
        return newarr;
    }


}
