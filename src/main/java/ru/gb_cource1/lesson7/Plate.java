package ru.gb_cource1.lesson7;

public class Plate {
  private int mealInPlate;


    public Plate(int mealInPlate) {
     this.mealInPlate = mealInPlate;
    }

    /*2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества
         еды (например, в миске 10 еды, а кот пытается покушать 15-20).
       */
   public boolean eat(final int meal){
      if(this.mealInPlate >= meal){
          this.mealInPlate -= meal;
          return true;
      }
      return false;
   }
}
