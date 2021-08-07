package ru.gb_cource2.lesson1;

public class Robot  implements FeaturesI{
    private String name;
    private int    runValue;
    private int    jumpValue;
    private final static int RUN_LIMIT  = 130;
    private final static int JUMP_LIMIT = 20;

    public Robot(String name,int runValue,int jumpValue) {
        this.name      = name;
        this.jumpValue = jumpValue;
        this.runValue  = runValue;
    }

    public boolean run(Treadmill treadmill) {
        boolean result = treadmill.run(RUN_LIMIT,runValue);
        System.out.println(String.format("Robot name: %s run obstacle: %s result: %s",name,treadmill.getName(),result));
        return result;
    }

    @Override
    public boolean jump(Wall wall) {
        boolean result = wall.jump(JUMP_LIMIT,jumpValue);
        System.out.println(String.format("Robot name: %s obstacle: %s jump result: %s",name,wall.getName(),result));
        return result;
    }
}
