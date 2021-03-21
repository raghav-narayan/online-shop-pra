package untitled;

public abstract class Product {
    private double price;
    private int code;

    public Product(int a, double b) {
        code=a;
        price=b;
    }
    public Product(){};
    double getPrice(){
        final double p = this.price;
        return p;
    }
    void setPrice(double p){
        price=p;
    }
    int getCode(){
        final int p = this.code;
        return p;
    }
    void setCode(int p){
        code=p;
    }
    String tstring(){
        String s = "" + this.price + " " + this.code;
        return s;
    }
}




