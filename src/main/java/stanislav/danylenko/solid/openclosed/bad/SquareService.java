package stanislav.danylenko.solid.openclosed.bad;

public final class SquareService {

    private SquareService() {}

    public static double calculateSquare(Figure figure) {
        if (figure instanceof Square square) {
            return square.getA() * square.getA();
        } else if (figure instanceof Circle circle) {
            return circle.getRadius() * circle.getRadius() * Math.PI;
        }
        // if we add a new Figure impl then we need to modify this class
        return 0;
    }

}
