public class Rectangle extends Parallelogram {
    Rectangle(double width, double height){
        super(width, height);
    }
    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
