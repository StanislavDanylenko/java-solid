package stanislav.danylenko.solid.openclosed.good;

public record Square(int a) implements Figure {

    @Override
    public double square() {
        return a * a;
    }

}
