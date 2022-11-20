public class PatikaStore {
    private Phone[] allPhones;
    private Notebook[] allNotebooks;


    public PatikaStore(Phone[] allPhones, Notebook[] allNotebooks) {
        this.allPhones = allPhones;
        this.allNotebooks = allNotebooks;
    }

    public static PatikaStore productList(){
        PatikaStore patikaStore1 = new PatikaStore(Phone.phones(),Notebook.notebooks());
        return patikaStore1;
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
