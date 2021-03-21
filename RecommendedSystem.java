package untitled;

import java.util.ArrayList;

public class RecommenderSystem {
    private ArrayList<PurchaseHistory> purchaseHistories;
    private ProductDatabase ProductDB=new ProductDatabase();
    private ArrayList<RecommendedItem> recommend=new ArrayList<RecommendedItem>();

    public RecommenderSystem(ArrayList<PurchaseHistory> p,ProductDatabase pd)
    {
        this.purchaseHistories=p;
        this.ProductDB=pd;
        ArrayList<Product> pds = ProductDB.getProducts();
        for(int i=0;i<pds.size();i++)
        {
            RecommendedItem ri = new RecommendedItem();
            ri.setProduct(pds.get(i));
            ri.setFreq(0);
            this.recommend.add(ri);
        }
    }

    public int getProductFreq(Product b){
        int freq=0;
        for(int i=0;i<recommend.size();i++) {
            if (recommend.get(i).getProduct() == b) {
                freq = recommend.get(i).getFreq();
                break;
            }
        }
        return(freq);
    }

    void updateProductFreq(Product p){
        int freq=0;
        for(int i=0;i<recommend.size();i++) {
            if (recommend.get(i).getProduct() == p) {
                freq = recommend.get(i).getFreq();
                freq+=1;
                recommend.get(i).setFreq(freq);
                break;
            }
        }
    }

    ArrayList<PurchaseHistory> getPurchaseHistories()
    {
        return this.purchaseHistories;
    }
    ArrayList<Product> productRecommenderAlgorithm(ArrayList<Product> cart, int threshold)
    {
        ArrayList<Product> r = new ArrayList<Product>();
        for(int i=0;i<cart.size();i++)
        {
            Product item=cart.get(i);
            for(int j=0;j<purchaseHistories.size();j++)
            {
                PurchaseHistory History=purchaseHistories.get(j);
                ArrayList<Product> hist= History.getPurchases();
                for(int k=0;k<hist.size();k++)
                {
                    //System.out.println(hist.get(k).getCode());
                    if (item.getCode() != hist.get(k).getCode())
                        updateProductFreq(hist.get(k));
                }
            }
            //System.out.println(recommend.size());
            /**for(int g=0;g<recommend.size();g++)
            {
                System.out.println(recommend.get(g).getProduct().getCode()+" "+recommend.get(g).getFreq());
            }**/
            for(int g=0;g<recommend.size();g++)
            {
                if(recommend.get(g).getFreq()>=threshold)
                    if(!r.contains(recommend.get(g).getProduct()))
                        r.add(recommend.get(g).getProduct());
            }
        }
        return r;
    }
}
