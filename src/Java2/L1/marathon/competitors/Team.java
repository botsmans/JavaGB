package Java2.L1.marathon.competitors;

public class Team {
    String name;
    Competitor[] competitors;

    public Team(String name, Competitor... competitors) {
        this.name = name;
        this.competitors = competitors;

    }
}
