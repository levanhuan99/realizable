package interfaceRealize;

public class Circle extends Shape {
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString(){
        return "A Circle with "+getColor()+" color and "+
                (isFilled() ? "fill":"not filled")+" radius is "+getRadius()
                + ", which is a subclass of "+" and area is"+getArea()
                + super.toString();
    }

    @Override
    public void resize(double percent) {
       this.setRadius(this.radius*percent);
    }
}
