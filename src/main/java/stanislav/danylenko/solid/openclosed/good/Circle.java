package stanislav.danylenko.solid.openclosed.good;

public record Circle(int radius) implements Figure {

    @Override
    public double square() {
        return radius * radius * Math.PI;

    }
}
