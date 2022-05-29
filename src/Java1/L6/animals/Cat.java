package Java1.L6.animals;

import java.util.Random;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        type = "Cat";
        runLength = 300 + random.nextInt(100);
        swimLength = 200 + random.nextInt(100);
    }

    @Override
    public void run(int distance) {
        if (distance <= runLength) {
            System.out.printf("The %s %s run %d%n",type, name, distance);
        } else {
            System.out.printf("%s не добежал%n", name);
        }
    }
}
