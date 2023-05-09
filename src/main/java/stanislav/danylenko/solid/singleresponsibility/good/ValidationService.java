package stanislav.danylenko.solid.singleresponsibility.good;

public class ValidationService {

    public boolean validate(Person person) {
        return person.getAge() > 18;
    }

}
