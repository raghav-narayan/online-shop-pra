package untitled;

public class RecommendedItem {
    private Product product;
    private int freq;
    public RecommendedItem(Product p,int a){
        this.product=p;
        this.freq=a;
    }
    public RecommendedItem(){}
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getFreq() {
        return freq;
    }
    public void setFreq(int freq) {
        this.freq = freq;
    }
}
