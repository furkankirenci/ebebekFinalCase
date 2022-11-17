public class Notebook extends Product{
    public Notebook(int id, String name, int brandID, int price, int discount, int stock, int ram, double size, int memory) {
        super(id, name, brandID, price, discount, stock, ram, size,memory);
    }
    public static Notebook[] notebooks(){
        Notebook[] notebooks = new Notebook[7];
        notebooks[0] = new Notebook(2001,"Lenovo ideaped",2,8000,0,200,8,14.4,512);
        notebooks[1] = new Notebook(2002,"Asus V5",6,8000,0,200,8,14.4,512);
        notebooks[2] = new Notebook(2003,"Monster Abra V5",9,8000,0,200,8,14.4,512);
        notebooks[3] = new Notebook(2004,"Casper Notebook",5,8000,0,200,8,14.4,512);
        notebooks[4] = new Notebook(2005,"Apple MacBook",3,8000,0,200,8,14.4,512);
        notebooks[5] = new Notebook(2006,"Huawei MacBook",4,8000,0,200,8,14.4,512);
        notebooks[6] = new Notebook(2007,"Huawei PC",4,8000,0,200,8,14.4,512);
        return notebooks;
    }
}
