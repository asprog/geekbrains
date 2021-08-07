package ru.gb_cource1.lesson7;

import ru.gb_cource1.lesson6.Animal;

public class Cat extends Animal {
    private int obstacleLenRun;
    private int obstacleLenSwim;
    private boolean satiety;
    /*
    * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать
    *  (хватило еды), сытость = true.
    * */
    private static int count;
    public Cat(String name) {
      super(name);
      this.satiety = false;
      this.count++;
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



    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
