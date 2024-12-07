public class Rombus extends Parallelogram{
    Rombus(double side, double height){
        super(side, height);
    }
    @Override
    public double getArea() {
        return this.width * height;
    }
}
