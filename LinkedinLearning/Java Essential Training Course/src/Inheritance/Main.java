package Inheritance;

import Inheritance.model.ClothingItem;
import Inheritance.model.Product;
import Inheritance.model.Shirt;

public class Main {
    public static void main(String[] args) {
        Shirt shirt = new Shirt("S",20.00,"Paisley");
        System.out.println(shirt);
//        ClothingItem item = new ClothingItem("Hat","M",30.30);
//        displayProduct(item);

        ClothingItem reallyAShirt = new Shirt("L",59.90,"Scale");
        displayProduct(reallyAShirt);

        Shirt nowThisIsReallyAShirt = (Shirt) reallyAShirt;
        System.out.println("This is the casted object to get only the pattern and it is: "+nowThisIsReallyAShirt.getPattern());

    }

    private static void displayProduct(Product product){
        String output =product.getClass().getSimpleName()+
                " type='" + product.getType() + '\'' +
                ", size='" + product.getSize() + '\'' +
                ", price=" + product.getPrice() +
                '}';
        System.out.println(output);
    }
}
