package stanislav.danylenko.solid.liskovsubstitution.good;

// This class can work with cars and with bikes
public class Student extends Master {

    private final int hoursPerBike;

    public Student(int hoursPerBike) {
        super(hoursPerBike * 2);
        this.hoursPerBike = hoursPerBike;
    }

    public int calculateNeededTimeForBike(int countOfBikes) {
        return hoursPerBike * countOfBikes;
    }
}
