package Java1.L6.animals;

import java.util.Random;

public abstract class Animal {
    static Random random = new Random();
    protected String name;
    String type;
    int runLength;
    int swimLength;
    public Animal(String name){
        this.name = name;
    }
    public abstract void run(int destination);
    public void swim(int distance){
        if (distance<=swimLength){
            System.out.printf("%s проплыло %d%n", name, distance);
        } else {
            System.out.printf("%s утонул", name);
        }
    }


}
