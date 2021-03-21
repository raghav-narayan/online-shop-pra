package untitled;

import java.util.ArrayList;

public class PurchaseHistory {
    private ArrayList<Product> purchases;
    PurchaseHistory(ArrayList<Product> a){
        purchases=a;
    }
    PurchaseHistory(){}
    ArrayList<Product> getPurchases(){
        return purchases;
    }

    public String toString() {
        return purchases.toString();
    }
}
