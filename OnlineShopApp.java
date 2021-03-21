package untitled;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShopApp {
    private static Object Scanner;
    private static Exception MyException;

    public static void main(String[]args){
        Shampoo sham1=new Shampoo("white",50,123,55.5);

        Bottle b1=new Bottle();
        b1.setColor("Yellow");
        b1.setWeight(40);
        b1.setCode(234);
        b1.setPrice(85.5);

        Soap so1=new Soap();
        so1.setColor("BLue");
        so1.setWeight(55);
        so1.setCode(345);
        so1.setPrice(65.5);

        Utensil ut1=new Utensil();
        ut1.setColor("Green");
        ut1.setWeight(65);
        ut1.setCode(456);
        ut1.setPrice(75.5);

        ProductDatabase database = new ProductDatabase();
        database.put(sham1);
        database.put(so1);
        database.put(b1);
        database.put(ut1);

        ArrayList<Product> r;
        r=database.getProducts();
        for(int i=0;i<r.size();i++)
        {
         System.out.println(r.get(i).tstring());
        }
        Scanner ip=new Scanner(System.in);


        //ArrayList<Product> list=new ArrayList<Product>();
        //list.add(p);

        //PurchaseHistory his=new PurchaseHistory();

        ArrayList<PurchaseHistory> hiss=new ArrayList<PurchaseHistory>();
        //hiss.add(his);
        int choice=0;
        OnlineShop shop=new OnlineShop(database,hiss);
        System.out.println("Enter the product code to add to cart or press 0 to checkout");
            do {

                try {
                    choice = ip.nextInt();
                    boolean chk=database.check(choice);
                    if(!chk)throw MyException;
                }
                 catch (Exception e) {
                    System.out.println("ProductNotFound");
                    continue;
                }
                if (choice == 0) break;
                Product p = database.get(choice);
                if (shop.addToCart(p))
                    System.out.println("Added to Cart");
            } while (choice != 0);


        ArrayList<Product> res = new ArrayList<Product>();
        res=shop.getShoppingCart();
        for(int i=0;i<res.size();i++)
         System.out.println(res.get(i).tstring());

        Double amt=shop.amountOwing();
        System.out.println("AMOUNT:"+amt);

        shop.completeTransaction();
    }
}
