package ru.gb_cource1.lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        setArrayItems_1();
        setArrayItems_2(100);
        setArrayItems_3();
        setSquareArrayItems_4(5);
        setArrayItem_5(5,7);
        setArrayAndSearchMinMaxItem_6();
        checkArrayBalance_7(new int[]{2, 2, 2, 1, 2, 2, 10, 1});
        changeArray_8(new int[]{1, 2, 3},2);
    }
    /*
    * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    * С помощью цикла и условия заменить 0 на 1, 1 на 0;
    * */
    private static void setArrayItems_1(){
      final int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
      for(int i = 0; i < array.length; i++) array[i] = array[i] == 0?1:0;
      for(int item : array) System.out.println(item);
      System.out.println("============");
    }
    /*
    * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    * */
    private static void setArrayItems_2(final int ARRAY_SIZE){
        final int[] array = new int[ARRAY_SIZE];
        for(int i = 0; i < array.length; i++) array[i] = i+1;
        for(int item : array) System.out.println(item);
        System.out.println("============");
    }
    /*
    * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    * */
    private static void setArrayItems_3(){
        final int ARRAY_CONDITION = 6;
        final int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < array.length; i++)  if(array[i] < ARRAY_CONDITION) array[i] = 2 * array[i];
        for(int item : array)                  System.out.println(item);
        System.out.println("============");
    }
    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
    цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
    [0][0], [1][1], [2][2], …, [n][n];*/
    private static void setSquareArrayItems_4(final int ARRAY_SIZE){
        final int[][] array = new int[ARRAY_SIZE][ARRAY_SIZE];
        for(int i = 0; i < array.length; i++){
            array[i][i] = 1; //set - первая диагональ
            array[i][(array.length-1) - i] = 1; //set - вторая диагональ
        }
        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array.length; y++) System.out.print(array[x][y]);
            System.out.println();
        }
        System.out.println("============");
    }
    /*
    * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
    * типа int длиной len, каждая ячейка которого равна initialValue;
    * */
    private static int[] setArrayItem_5(final int len,final int initialValue){
      final int[] array = new int[len];
      for(int i = 0; i < array.length; i++) array[i] = initialValue;
      for(int item : array)                 System.out.println(item);
      System.out.println("============");
      return array;
    }
    /*
    * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    * */
    private static void setArrayAndSearchMinMaxItem_6(){
        final int[] array = new int[]{2, 5, 3, 1, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = array[0];
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(min > array[i]) min = array[i]; //set min
            if(max < array[i]) max = array[i]; //set max
        }
        System.out.println(String.format("min: %s,max: %s",min,max));
        System.out.println("============");
    }
    /*
    * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    **Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
    * */
    private static boolean checkArrayBalance_7(final int[] array){
       boolean balance = false;
       int index = 1;
       while(true){
        int xCount = 0;
        int yCount = 0;
        for(int x = 0; x < index; x++)               xCount += array[x];
        for(int y = array.length-1; y >= index; y--) yCount += array[y];
        //System.out.println(xCount + "," + yCount);
        if(++index == array.length-1){
            balance = (xCount == yCount);
            break;
        }
       }
      System.out.println(balance);
      System.out.println("============");
      return balance;
    }
    /*
    * 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, \
    * или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются
    * циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
    * (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую
    * сторону сдвиг можете выбирать сами.
    * */
    private static void changeArray_8(final int[] array,final int n) {
        if (n == 0) return;
        if (n > 0) { //двигаем вправо
            for (int x = 1; x <= n; x++) {
                int last = array[array.length-1];
                for (int i = array.length -1; i > 0; i--) array[i] = array[i-1];
                array[0] = last;
            }
            for(int item : array) System.out.println(item);
            System.out.println("============");
        }
    }
}
