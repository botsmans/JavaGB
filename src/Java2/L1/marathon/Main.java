package Java2.L1.marathon;

import Java2.L1.marathon.competitors.*;
import Java2.L1.marathon.obstacles.*;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors={new Human("Bob"),
        new Cat("Vaska"), new Dog("Tuzik")};
        Obstacle[] obstacles = {new Cross(80), new Wall(2), new Water(10)};

        for (Competitor c:competitors) {
            for (Obstacle o:obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitor c:competitors) {
            c.info();
        }

        Team team = new Team("teamName", new Human("bobi"), new Cat("Mursik"), new Dog("Sharik"), new Human("tomi"));
        Course course = new Course(new Water(5), new Cross(2), new Wall(2));
        course.doIt(team);
        team.showWinners();
    }
}
