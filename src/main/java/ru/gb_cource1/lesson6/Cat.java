package ru.gb_cource1.lesson6;

public class Cat extends Animal{
    private int obstacleLenRun;
    private int obstacleLenSwim;
    private static int count;
    public Cat(String name) {
      super(name);
      count++;
    }

    @Override
    public void run(final int obstacleLen) {
        this.obstacleLenRun = obstacleLen<=200?obstacleLen:200;
    }

    @Override
    public void swim(final int obstacleLen) {
        this.obstacleLenSwim = 0;
    }

    public void print(){
      System.out.println(String.format("name:%s-> пробежал %dм,проплыл %dм",name,obstacleLenRun,obstacleLenSwim));
    }

    @Override
    public int getCount() {
        return count;
    }
}
