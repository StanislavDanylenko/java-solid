package stanislav.danylenko.solid.openclosed.good;

public final class SquareService {

    private SquareService() {}

    public static double calculateSquare(Figure figure) {
        return figure.square();
    }

}
