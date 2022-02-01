package figur;

public class Circle extends Figure{
    private int r;
    private String name = "Circle";
    Circle(int r) {
        this.r = r;
    }
    public int getR() { return r; }
    public String getName() {
        return name;
    }
    double getArea() {
        return pi*r*r;
    }
}
