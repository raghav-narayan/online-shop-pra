package untitled;

class Soap extends Product{
    private
    String color;
    int weight;
    public Soap(String a, int b, int c, double d){
        super(c,d);
        color=a;
        weight=b;
    }
    public Soap(){};
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
