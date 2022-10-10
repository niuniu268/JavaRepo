public class Animals {
    private String color;
    private int age;

    public Animals() {
    }

    public Animals(String color, int age) {
        this.color = color;
        this.age = age;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
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
        return "Animals{color = " + color + ", age = " + age + "}";
    }

    public  void eat(String sth){
        System.out.print("eat something");
    }


}
