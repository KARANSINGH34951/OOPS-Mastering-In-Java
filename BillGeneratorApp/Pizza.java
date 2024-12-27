// package BillGeneratorApp;

public class Pizza {
    private int price=0;
    private Boolean veg;
    private int vegPrice=300;
    private int nonVegprice=400;
    private int extrachesse=100;
    private int extratopings=100;
    private int packagebag=10;

    public Pizza(Boolean veg) {
        this.veg = veg;
    }

    public void orderpizza(){
        if(veg==true){
            this.price+=vegPrice;
        }
        else{
            this.price=nonVegprice;
        }
    }

    public void addextrachesse(){
        System.out.println("Added extra chesse"+extrachesse);
        this.price+=extrachesse;
    }

    public void setExtratopings(){
        System.out.println("Added extra topings"+extratopings);
        this.price+=extratopings;
    }

    public void packaging(boolean ispack){
       if(ispack==true){
           System.out.println("Added extra charges of package bags"+packagebag);
           this.price+=packagebag;
       }
    }

    public void Totalbill(){
        System.out.println("Total bill: "+price);
    }

}
