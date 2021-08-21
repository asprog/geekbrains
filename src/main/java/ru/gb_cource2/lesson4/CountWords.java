package ru.gb_cource2.lesson4;

import java.util.*;

public class CountWords {
    public static void main(String[] args) {
      CountWords listWords = new CountWords();
      String[] words = {"A","B","C","D","F","F","A","B","F","F"};
      System.out.printf(String.format("Все элементы: %s \n",Arrays.toString(words)));
      Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
      System.out.printf(String.format("Уникальные элементы: %s \n",uniqueWords));
      Map<String,Integer> countMap = new HashMap<>();
      for(String uWword : uniqueWords){
       int count = 0;
       for(String word : Arrays.asList(words)){
        if(uWword.toLowerCase().equals(word.toLowerCase()))count++;
       }
       countMap.put(uWword,count);
      }
      System.out.printf(String.format("Кол-во уникальных элементов: %s \n",countMap));
    }
}
