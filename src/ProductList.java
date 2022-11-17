public class ProductList {
    private Phone[] allPhones;
    private Notebook[] allNotebooks;


    public ProductList(Phone[] allPhones, Notebook[] allNotebooks) {
        this.allPhones = allPhones;
        this.allNotebooks = allNotebooks;
    }

    public static ProductList productList(){
        ProductList productList1 = new ProductList(Phone.phones(),Notebook.notebooks());
        return productList1;
    }



    public Phone[] getAllPhones() {
        System.out.println("gettere p girdi");
        return allPhones;
    }

    public void setAllPhones(Phone[] allPhones) {
        System.out.println("settere p girdi");
        this.allPhones = allPhones;
    }

    public Notebook[] getAllNotebooks() {
        System.out.println("gettere n girdi");

        return allNotebooks;
    }

    public void setAllNotebooks(Notebook[] allNotebooks) {
        System.out.println("settere n girdi");
        this.allNotebooks = allNotebooks;
    }
}
