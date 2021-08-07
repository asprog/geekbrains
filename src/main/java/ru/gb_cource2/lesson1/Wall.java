package ru.gb_cource2.lesson1;

public class Wall {
    private String name;
    private final int height;

    public Wall(String name,int height) {
        this.name   = name;
        this.height = height;
    }

    public boolean jump(final int jumpLimit,final int jumpValue){
      boolean result = false;
      if(jumpValue <= jumpLimit && jumpValue > height){
          result = true;
      }
      return result;
    }

    public String getName() {
        return name;
    }
}
