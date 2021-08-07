package ru.gb_cource2.lesson1;

public class Treadmill {
    private String name;
    private final int length;

    public Treadmill(String name,int length) {
        this.name   = name;
        this.length = length;
    }
    public boolean run(final int runLimit,final int runValue){
        boolean result = false;
        if(runValue <= runLimit && runValue > length){
          result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }
}
