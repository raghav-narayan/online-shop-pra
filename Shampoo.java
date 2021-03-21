package untitled;

class Shampoo extends Product {
    private
    String color;
    private int weight;
    public Shampoo(String a, int b, int c, double d){
        super(c,d);
        color=a;
        weight=b;
    }
    public Shampoo(){};
    void setColor(String p){
        color=p;
    }
    void setWeight(int p){
        weight=p;
    }
    String tstring(){
        String s = ""+this.getCode()+" "+this.getPrice()+" "+this.color+" "+this.weight;
        return s;
    }
}