package Java2.L1.marathon.obstacles;

import Java2.L1.marathon.competitors.Competitor;
import Java2.L1.marathon.competitors.Team;

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle... obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (Competitor c: team.getCompetitors()){
            for (Obstacle   o:obstacles){
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }
    }
}
