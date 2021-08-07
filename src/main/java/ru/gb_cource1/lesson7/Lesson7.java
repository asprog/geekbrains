package ru.gb_cource1.lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Lesson7 lesson = new Lesson7();
        lesson.addAnimals();
    }

    private void addAnimals(){
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Мурзик");
        cats[1] = new Cat("Рыжик");
        cats[2] = new Cat("Пушок");
        cats[3] = new Cat("Васька");
        cats[4] = new Cat("Снежинка");
        Plate plate = new Plate(20);
        for(Cat cat : cats){
            cat.setSatiety(plate.eat(5));
            System.out.println(String.format("кот: %s, голоден: %s",cat.name,cat.isSatiety()?"да":"нет"));
        }

    }


}
