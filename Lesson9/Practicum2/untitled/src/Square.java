public class Square extends Parallelogram {
    Square(double width){
        super(width);
    }
    @Override
    public double getArea() {
        return  this.width * this.width;
    }
}
