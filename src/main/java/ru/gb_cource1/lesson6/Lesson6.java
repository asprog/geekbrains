package ru.gb_cource1.lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Lesson6 lesson = new Lesson6();
        lesson.addAnimals();
    }

    private void addAnimals(){
        Animal cat = new Cat("Мурзик");
        Animal dog = new Dog("Бобик");

        cat.run(100);
        cat.swim(150);
        dog.run(200);
        dog.swim(250);
        cat.print();
        dog.print();
        countAnimal(cat,dog);
    }
    private void countAnimal(Animal cat, Animal dog){
     System.out.println("animals: " + Animal.count + ",cats: " + cat.getCount() + ",dogs: " + dog.getCount());
    }

}
