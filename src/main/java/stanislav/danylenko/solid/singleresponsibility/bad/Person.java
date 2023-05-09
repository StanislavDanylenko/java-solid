package stanislav.danylenko.solid.singleresponsibility.bad;

public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean validate() {
        return age > 18;
    }

    public void register() {
        // some logic
    }

    public Person findPerson(String name) {
        // some logic
        return null;
    }
}
