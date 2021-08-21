package ru.gb_cource2.lesson4;

import java.util.HashSet;
import java.util.Set;

public class TelSearch {
    public static void main(String[] args) {
       Set<TelGuide> telGuids = new HashSet<>();
       telGuids.add(new TelGuide("Petrov"));
       telGuids.add(new TelGuide("Sidorov"));
       addTel(telGuids,"Petrov","111-11-11");
       addTel(telGuids,"Petrov","111-11-22");
       addTel(telGuids,"Petrov","111-11-22");
       addTel(telGuids,"Sidorov","222-22-11");
       addTel(telGuids,"Petrov","111-11-33");
        //данные справочника
       for(TelGuide telGuide : telGuids){
         System.out.printf(String.format("ФИО: %s телефоны: %s\n",telGuide.getName(),telGuide.get()));
       }

    }

    private static void addTel(Set<TelGuide> telGuids,String name, String tel) {
     if(name == null || tel == null) return;
     for(TelGuide telGuide : telGuids){
        if(telGuide.getName().toLowerCase().equals(name.toLowerCase())){telGuide.add(tel);break;}
     }
    }
}
