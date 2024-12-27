// package BillGeneratorApp;

public class DuplexPizza extends Pizza{
    private int baseprize=600;

    public DuplexPizza(Boolean veg) {
        super(veg);
    }

    @Override
    public void addextrachesse() {

    }

    @Override
    public void setExtratopings() {

    }

    @Override
    public void packaging(boolean ispack) {
        if(ispack==true){
            this.baseprize+=10;
        }
    }

    public void duplexbill(){
        System.out.println(baseprize);
    }
}
