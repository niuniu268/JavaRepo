public class Main {
    public static void main(String[] args) {


        Person p = new Person("first",33);
        Dogs dog = new Dogs( "black", 2);
        Cats cat = new Cats( "white", 3);
        String food = new String("food");
        p.keepPet(dog,food);


    }
}