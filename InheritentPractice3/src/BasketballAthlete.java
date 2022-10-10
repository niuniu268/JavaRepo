public class BasketballAthlete extends Person implements Basketball {
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("play basketball");
    }
}
