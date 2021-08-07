package ru.gb_cource2.lesson1;

public class Cat  implements FeaturesI{
    private String name;
    private int    runValue;
    private int    jumpValue;
    private final static int RUN_LIMIT  = 140;
    private final static int JUMP_LIMIT = 25;

    public Cat(String name, int runValue, int jumpValue) {
        this.name      = name;
        this.runValue  = runValue;
        this.jumpValue = jumpValue;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        boolean result = treadmill.run(RUN_LIMIT,runValue);
        System.out.println(String.format("Cat name: %s obstacle: %s run result: %s",name,treadmill.getName(),result));
        return result;
    }

    @Override
    public boolean jump(Wall wall) {
        boolean result = wall.jump(JUMP_LIMIT,jumpValue);
        System.out.println(String.format("Cat name: %s obstacle: %s jump result: %s",name,wall.getName(),result));
        return result;
    }
}
