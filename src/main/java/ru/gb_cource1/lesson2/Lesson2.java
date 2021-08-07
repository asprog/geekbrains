package ru.gb_cource1.lesson2;

import java.util.logging.Logger;

public class Lesson2 {
    private static final Logger LOG = Logger.getLogger(Lesson2.class.getName());
    public static void main(String[] args) {
        checkSum(1, 2);
      //LOG.info(String.valueOf(checkSum(1, 2)));
        checkNumber(-1);
        checkNumberSecond(2);
        printString("Hello gb.ru",7);
    }

    /*
    * 1. Написать метод, принимающий на вход
    * два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    * если да – вернуть true, в противном случае – false.
    * */
    private static boolean checkSum(int a, int b){
      int sum = a+b;
      return sum>=10 && sum<=20;
    }
    /*
    * 2. Написать метод, которому в качестве параметра передается целое число,
    *  метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    * Замечание: ноль считаем положительным числом.
    * */
    private static void checkNumber(int i){
     if(i < 0)   LOG.info("число отрицательное");
     else        LOG.info("число положительное");

    }
    /*
    * 3. Написать метод, которому в качестве параметра передается целое число. Метод должен
    * вернуть true, если число отрицательное, и вернуть false если положительное.
    * */
    private static boolean checkNumberSecond(int i){
        return i < 0?true:false;
    }
    /*
    * 4. Написать метод, которому в качестве аргументов передается строка и число,
    *  метод должен отпечатать в консоль указанную строку, указанное количество раз;
    * */
    private static void printString(String str,int count){
      for(int i = 0;i < count;i++) System.out.println(str);
    }
}
