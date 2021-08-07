package ru.gb_cource2.lesson1;
/*
* соревнование между Humans,Robots,Cats
* */
public class Сompetition {
    private static Object[] participants; //участники
    private static Object[] obstacles;    //препятствия
    public static void main(String[] args) {
        participants = new Object[]{
                new Human("Вася", 52, 10),
                new Robot("Вернор", 125, 19),
                new Cat("Барсик", 122, 23)
        };
        obstacles = new Object[]{
                new Treadmill("Дорожка1", 50), //человек +,робот +, кошка +
                new Wall("Стена1", 5), //человек +,робот +, кошка +
                new Wall("Стена2", 9), //человек +,робот +, кошка +
                new Wall("Стена3", 11), //человек -,робот +, кошка +
                new Treadmill("Дорожка2", 120), //робот +, кошка +
                new Wall("Стена4", 5), //робот +, кошка +
                new Wall("Стена5", 18), //робот +, кошка +
                new Wall("Стена6", 22) //робот -, кошка +
        };
        race(); //гонка
    }
     private static void race() {
         boolean humanRunJump = true;
         boolean robotRunJump = true;
         boolean catRunJump   = true;
         for (Object participant : participants) {
             for (Object obstacle : obstacles) {
                 if (participant instanceof Human) {
                     if(!humanRunJump) continue; //уже раньше проиграл, дальше не соревнуется
                     if (obstacle instanceof Treadmill) {
                       if(!((Human)participant).run((Treadmill)obstacle)) humanRunJump = false;
                     }
                     if (obstacle instanceof Wall) {
                       if(!((Human)participant).jump((Wall)obstacle))     humanRunJump = false;
                     }
                 }
                 if (participant instanceof Robot) {
                     if(!robotRunJump) continue; //уже раньше проиграл, дальше не соревнуется
                     if (obstacle instanceof Treadmill) {
                         if(!((Robot)participant).run((Treadmill)obstacle)) robotRunJump = false;
                     }
                     if (obstacle instanceof Wall) {
                         if(!((Robot)participant).jump((Wall)obstacle))     robotRunJump = false;
                     }
                 }
                 if (participant instanceof Cat) {
                     if(!catRunJump) continue; //уже раньше проиграл, дальше не соревнуется
                     if (obstacle instanceof Treadmill) {
                         if(!((Cat)participant).run((Treadmill)obstacle)) catRunJump = false;
                     }
                     if (obstacle instanceof Wall) {
                         if(!((Cat)participant).jump((Wall)obstacle))     catRunJump = false;
                     }
                 }
             }
         }
     }

}
