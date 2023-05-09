package stanislav.danylenko.solid.liskovsubstitution.bad;

public class Student extends Master {

    private final int hoursPerBike;

    public Student(int hoursPerBike) {
        super(-1);
        this.hoursPerBike = hoursPerBike;
    }

    // it is bad code, subclass can ce used instead of it's parent class anywhere
    public int calculateNeededTime(int countOfCars) {
        throw new RuntimeException("I do not work with cars");
    }

    public int calculateNeededTimeForBike(int countOfBikes) {
        return hoursPerBike * countOfBikes;
    }
}
