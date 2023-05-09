package stanislav.danylenko.solid.liskovsubstitution.good;

public class Master {

    private final int hoursPerCar;

    public Master(int hoursPerCar) {
        this.hoursPerCar = hoursPerCar;
    }

    public int calculateNeededTime(int countOfCars) {
        return hoursPerCar * countOfCars;
    }

}
