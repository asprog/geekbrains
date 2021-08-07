package ru.gb_cource1.lesson1;

import java.util.logging.Logger;

/*
* 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
* */
public class HomeWorkApp {
    private static final Logger LOG = Logger.getLogger(HomeWorkApp.class.getName());
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    /*
    * 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
       _Orange
       _ Banana
       _ Apple
    * */
    private static void printThreeWords(){
      LOG.info("\nOrange\nBanana\nApple");
    }
    /*
    * 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их
    * любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
    * и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае -
    * “Сумма отрицательная”;
    * */
    private static void checkSumSign(){
      int a = 1;
      int b = -2;
      if(a+b >= 0)  LOG.info("Сумма положительная");
      else          LOG.info("Сумма отрицательная");
    }
 /*
 * 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее
 * любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение
 * “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100
 *  исключительно) - “Зеленый”;
 * */
 private static void printColor(){
   int  value = 101;
   if(value <= 0)                LOG.info("Красный");
   if(value > 0 && value <= 100) LOG.info("Желтый");
   if(value > 100)               LOG.info("Зеленый");
 }
 /*5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
 и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то
 необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
 * */
 private static void compareNumbers(){
   int a = 1;
   int b = -2;
   if(a >= b) LOG.info("a >= b");
   else       LOG.info("a < b");
 }
}
