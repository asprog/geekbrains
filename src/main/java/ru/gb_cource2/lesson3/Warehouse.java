package ru.gb_cource2.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T> {
    private final ArrayList<Apple>  apples     = new ArrayList<>();
    private final ArrayList<Orange> oranges    = new ArrayList<>();
    private       Box<Apple>   appleBox  = new Box();
    private       Box<Apple>   appleBox2 = null;
    private final Box<Orange>  orangeBox = new Box();

    public static void main(String[] args) {

     Warehouse warehouse = new Warehouse();
     warehouse.apples.add(new Apple(1.0f));
     warehouse.apples.add(new Apple(1.0f));
     warehouse.apples.add(new Apple(1.0f));
     warehouse.appleBox.addFruit(warehouse.apples);

     warehouse.oranges.add(new Orange(1.5f));
     warehouse.oranges.add(new Orange(1.5f));
     warehouse.oranges.add(new Orange(1.5f));
     warehouse.oranges.add(new Orange(1.5f));
     warehouse.orangeBox.addFruit(warehouse.oranges);


     System.out.printf("box apple,  kol-vo: %d\n",warehouse.appleBox.getFruits().size());
     System.out.printf("box orange, kol-vo: %d\n"  ,warehouse.orangeBox.getFruits().size());
     System.out.printf("boxes compare: %s\n",
             warehouse.appleBox.compare(warehouse.orangeBox)
             ?"ящик с яблоками тяжелее, чем ящик с апельсинами"
             :"ящик с апельсинами тяжелее, чем ящик с яблоками"
     );
     System.out.printf("move apples from box apple to box apple2 \n");
     warehouse.appleBox2 = warehouse.appleBox;
     warehouse.appleBox = new Box();
     //warehouse.appleBox.getFruits().clear();
     System.out.printf("move apples: box1 apples: %d box2 apples: %d\n",
             warehouse.appleBox.getFruits().size(),
             warehouse.appleBox2.getFruits().size()
     );
    }
}
