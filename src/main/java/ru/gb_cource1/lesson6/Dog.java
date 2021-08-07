package ru.gb_cource1.lesson6;

public class Dog extends Animal{
    private int obstacleLenRun;
    private int obstacleLenSwim;
    private static int count;
    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(final int obstacleLen) {
        this.obstacleLenRun = obstacleLen<=500?obstacleLen:500;
    }

    @Override
    public void swim(final int obstacleLen) {
        this.obstacleLenSwim = obstacleLen<=10?obstacleLen:10;
    }

    public void print(){
        System.out.println(String.format("name:%s-> пробежал %dм,проплыл %dм",name,obstacleLenRun,obstacleLenSwim));
    }

    @Override
    public int getCount() {
        return count;
    }
}
