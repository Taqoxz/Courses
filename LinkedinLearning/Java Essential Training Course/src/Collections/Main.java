package Collections;

import Collections.model.Shirt;
import Collections.model.ClothingItem;
import Collections.model.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Shirt> shirtRack = new ArrayList<Shirt>();
        Shirt shirt1 = new Shirt("M",20.90,"Squares");
        Shirt shirt2 = new Shirt("S",29.90,"Triangles");
        shirtRack.add(shirt1);
        shirtRack.add(shirt2);
        for (Shirt row: shirtRack) {
            System.out.println(row);
        }
        Map<Integer,Shirt> shirtRackNumbered = new HashMap<Integer,Shirt>();
        Shirt shirt3 = new Shirt("S",39.99,"Circles");
        Shirt shirt4 = new Shirt("S",49.99,"Paisley");
        Shirt shirt5 = new Shirt("L",45.99,"Herringbone");
        shirtRackNumbered.put(1,shirt1);
        shirtRackNumbered.put(2,shirt2);
        shirtRackNumbered.put(3,shirt3);
        shirtRackNumbered.put(4,shirt4);
        shirtRackNumbered.put(5,shirt5);
        System.out.println(shirtRackNumbered.get(5));
        shirtRackNumbered.remove(1);
        shirtRackNumbered.remove(2);
        System.out.println(shirtRackNumbered);

        Integer i = new Integer(1);
    }
}
