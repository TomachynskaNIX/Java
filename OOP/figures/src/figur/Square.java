package figur;

public class Square extends Figure{
    private int a;
    private String name = "Square";
    Square(int a) {
        this.a = a;
    }
    public int getA() { return a; }

    public String getName() {
        return name;
    }

    double getArea() {
        double s = a*a;
        return s;
    }
}
