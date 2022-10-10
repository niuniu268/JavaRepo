public class BasketballCoach extends Person implements Basketball{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println(" teach to play basketball");
    }
}
