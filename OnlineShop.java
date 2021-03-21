package untitled;

import java.util.ArrayList;

public class OnlineShop implements PaymentSystem
{
    private ProductDatabase ProductDB;
    private ArrayList<Product> cart=new ArrayList<Product>();
    private RecommenderSystem recommender;
    public OnlineShop(ProductDatabase pdb, ArrayList<PurchaseHistory> p)
    {
        this.recommender = new RecommenderSystem(p,pdb);
        this.ProductDB = pdb;
    }
    ArrayList<Product> getRecommendedProducts()
    {
        ArrayList<Product> r = new ArrayList<Product>();
        r=recommender.productRecommenderAlgorithm(cart,2);
        return r;
    }
    boolean addToCart(Product p)
    {
        boolean k=false;
        cart.add(p);
        k=true;
        return k;
    }
    ArrayList<Product> getProductListing()
    {
        ArrayList<Product> r = new ArrayList<Product>();
        r=ProductDB.getProducts();
        return r;
    }
    ArrayList<Product> getShoppingCart()
    {
        return this.cart;
    }
    public Double amountOwing()
    {
        Double amount=0.0;
        for(int i=0;i<cart.size();i++)
            amount+=cart.get(i).getPrice();
        final Double amount1 = amount;
        return amount1;
    }
    public void completeTransaction()
    {
        PurchaseHistory p = new PurchaseHistory(cart);
        recommender.getPurchaseHistories().add(p);
        ArrayList<Product> rec = new ArrayList<Product>();
        //rec=recommender.getPurchaseHistories();
        rec=recommender.productRecommenderAlgorithm(cart,1);
        //System.out.println(rec.size());
        System.out.println("RECOMMENDED ITEMS: ");
        for(int i=0;i<rec.size();i++)
            System.out.println(rec.get(i).tstring());
        cart.clear();
    }
}
