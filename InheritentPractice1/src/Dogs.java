public class Dogs extends Animals{
    public Dogs() {
    }

    public Dogs(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String sth) {
        System.out.println(this.getAge()+this.getColor()+ " dog eats" + sth);
    }

    public void lookHome(){
        System.out.println(" dag takes care home");
    }

    public String toString() {
        return "Dogs{}";
    }
}
