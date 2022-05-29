package Java1.L7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }


    public void setFood(int food, Cat cat) {
        if (food >= 0) {
            this.food = food;
            cat.setHungry();
            System.out.printf("%n%s ate from %s, become %s", cat.getName(), this, this.getFood());
        } else {
            System.out.printf("%nNot enough food from %s", this);
        }


    }

    public void addFood(int food) {
        this.food = this.getFood() + food;
        System.out.println(this.food+ " food in " + this);
    }
}
