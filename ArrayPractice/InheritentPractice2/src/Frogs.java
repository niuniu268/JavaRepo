public class Frogs extends Animals{
    public Frogs() {
    }

    public Frogs(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" eats bugs");
    }

    @Override
    public void drink() {
        System.out.println(this.getName()+" drink water");


    }
}
