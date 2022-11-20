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
        return allPhones;
    }

    public void setAllPhones(Phone[] allPhones) {
        this.allPhones = allPhones;
    }

    public Notebook[] getAllNotebooks() {
        return allNotebooks;
    }

    public void setAllNotebooks(Notebook[] allNotebooks) {
        this.allNotebooks = allNotebooks;
    }
}
