public class Dogs extends Animals{
    public Dogs() {
    }

    public Dogs(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getName()+" eats grass");

    }

    @Override
    public void drink() {
        System.out.println(this.getName()+" drink water");

    }
}
