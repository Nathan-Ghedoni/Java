
public class Circle {
    //Attributes
    private double radius;
    private double centerX;
    private double centerY;
    
    //Constructors
    public Circle() {
        this.radius = 0.0;
        this.centerX = 0.0;
        this.centerY = 0.0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
        this.centerX = 0.0;
        this.centerY = 0.0;
    }
    
    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.centerX = x;
        this.centerY = y;
    }
    //Methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }
    
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
    
    public double circumference() {
        return Math.PI * 2 * this.radius;
    }
    
    public double diameter() {
        return 2 * this.radius;
    }
    
    

}
