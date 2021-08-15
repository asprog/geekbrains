package ru.gb_cource2.lesson3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
public class ChangeTwoItems<T> {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        ChangeTwoItems<Integer> changeTwoItems = new ChangeTwoItems();
        changeTwoItems.addItems(array);
        changeTwoItems.changeItems(array,3,5);
        System.out.printf("%s", Arrays.toString(array));
    }

    private void addItems(Integer[] array){
     /*почему то не могу указать   private void addItems(T[] array){
       хоть и тип array [Ljava.lang.Integer;
     */
     for(int i = 0; i < 10; i++){
       array[i] = i;
     }
    }
    private void changeItems(T[] array,int x, int y) {
        x--;
        y--;
        T buffer = array[y];
        array[y] = array[x];
        array[x] = buffer;
    }

}
