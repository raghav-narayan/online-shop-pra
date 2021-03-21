package untitled;
import java.util.ArrayList;
class ProductDatabase
{
    private ArrayList<Product> database;
    ProductDatabase(ArrayList<Product> a)
    {
        database=a;
    }
    ProductDatabase(){
        this.database=new ArrayList<Product>();
    }
    void put(Product a)
    {
       database.add(a);
    }
    Product get(int a)
    {
        int i=0;
        int c=0;
        for(i=0;i<database.size();i++){
            if(database.get(i).getCode()==a)
                c=i;
        }
        return(database.get(c));
    }
    boolean check(int choice){
        boolean chk=false;
        for(int i=0;i<database.size();i++){
            if(database.get(i).getCode()==choice)chk=true;
        }
        return chk;
    }
    ArrayList<Product> getProducts(){
        final ArrayList<Product> database = this.database;
        return database;
    }


}
