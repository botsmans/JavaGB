package Java2.L1.marathon.competitors;

public class Team {
    String name;
    Competitor[] competitors;

    public Team(String name, Competitor... competitors) {
        this.name = name;
        this.competitors = competitors;

    }
    public void showWinners(){
        for (Competitor c: competitors){
            if(c.isOnDistance()){
                c.info();
            }
        }
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }
}
