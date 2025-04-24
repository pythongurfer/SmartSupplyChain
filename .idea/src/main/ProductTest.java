import exception.*;
import items.*;

public class ProductTest{
    public static void main(String[] args){
        Product doc = new Document("001", "Passport");
        Product phone = new Electronic("002", "Smartphone");
        Product milk = new Perishable("003", "Milk", 5);

        System.out.println(doc);
        System.out.println(phone);
        System.out.println(milk);

    }
}