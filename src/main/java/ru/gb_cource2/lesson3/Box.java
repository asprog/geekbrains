package ru.gb_cource2.lesson3;

import java.util.ArrayList;

public class Box<T extends Fruit>{
  private ArrayList<T> fruits = new ArrayList<>();

  public void addFruit(ArrayList<T> fruits){
   this.fruits = fruits;
  }
  public ArrayList<T> getFruits() {
    return fruits;
  }

  public boolean compare(Box<? extends Fruit> otherBox) {
    return this.getWeight() > otherBox.getWeight();
  }
  public Float getWeight(){
   float result = 0.0f;
   if(fruits.isEmpty()) return result;
   return fruits.size() * fruits.get(0).getWeight();
  }
 public void moveFruits(ArrayList<T> fruits){
     fruits = new ArrayList<>(fruits);
 }
}
