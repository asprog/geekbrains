package ru.gb_cource1.lesson7;

public abstract class Animal {
  public String name;
  public abstract void run(final int obstacleLen);
  public abstract void swim(final int obstacleLen);
  public abstract void print();
  public abstract int getCount();
  public Animal(String name) {
    this.name = name;
  }

}
