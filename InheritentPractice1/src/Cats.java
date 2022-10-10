public class Cats extends Animals{

    public Cats() {
    }

    public Cats(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String sth) {
        System.out.println(this.getAge()+this.getColor()+"cat eats "+ sth);
    }

    public void catchMouse(){
        System.out.println("Cat catches mouse");
    }
}
