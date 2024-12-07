public abstract class Parallelogram implements Figure {
    protected double width;
    protected double height;

    public Parallelogram(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Parallelogram(double width) {
        this.width = width;
    }
}
