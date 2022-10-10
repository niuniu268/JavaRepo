public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Animals animal, String sth){

        if(animal instanceof Dogs d){
            System.out.println(this.getName() + " uses" + sth + "to take case " + d );
            d.eat(sth);
        } else if (animal instanceof Cats c) {
            System.out.println(this.getName() + " uses" + sth + "to take case " + c );
            c.eat(sth);

        }


    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
