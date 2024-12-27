// package BillGeneratorApp;

public class Main {
    public static void main(String[] args) {
//        Pizza obj=new Pizza(true);
//        obj.orderpizza();
//        obj.setExtratopings();
//        obj.addextrachesse();
//        obj.packaging(false);
//        obj.Totalbill();

        DuplexPizza obj2=new DuplexPizza(true);
        obj2.packaging(true);
        obj2.duplexbill();
    }
}
