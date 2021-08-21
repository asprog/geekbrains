package ru.gb_cource2.lesson4;

import java.util.HashSet;
import java.util.Set;

public class TelGuide {
   private String name;
   private Set<String> tels;

    public TelGuide(String name) {
      if(name == null) return;
      this.name = name;
      this.tels = new HashSet<>();
    }
    public void add(String tel){
      if(tel == null) return;
      tels.add(tel);
    }

    public String getName() {
        return name;
    }

    public Set<String> get(){
      return tels;
    }
}
