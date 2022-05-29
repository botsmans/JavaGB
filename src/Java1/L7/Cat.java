package Java1.L7;

public class Cat {
    private String name;
    private boolean hungry = true;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        plate.setFood(plate.getFood() - 11, this);
    }

    public String getName() {
        return name;
    }

    public void setHungry() {
        this.hungry = false;
    }
}
