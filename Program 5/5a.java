//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.annotation.processing.SupportedSourceVersion;
import java.util.Vector;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name=name;
        this.price =price;
        this.category=category;
    }
    void showProduct(){
        System.out.println("Name:"+ name+" Price: "+ price+" Category:"+category);
    }
}

public class Main {

    Vector<Product> inventory = new Vector();

    void addProduct(String name, double price, String category){
        Product newProduct=new Product(name,price,category);
        inventory.add(newProduct);
        System.out.println(("Added :"+name));
    }

    void removeProduct(String name){
        for(int i=0;i<inventory.size();i++){
            if(inventory.get(i).name.equalsIgnoreCase(name)){
                inventory.remove(i);
                System.out.println("Removed :"+name);
            }
        }
    }

    void Display(){
        System.out.println(" ----Product Inventory----");
        if(inventory.isEmpty()){
            System.out.println("No product available");
        }
        else{
            for(Product p: inventory){
                p.showProduct();
            }
        }
    }
    public static void main(String[] args) {
        Main manager= new Main();
         manager.addProduct("Phone",699,"Electronics");
        manager.addProduct("Apple",99,"Fruit");
        manager.addProduct("Notebook",69,"Statonary");

        manager.Display();
        manager.removeProduct("Phone");

        manager.Display();


    }
    }
