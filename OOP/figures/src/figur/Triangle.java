package figur;

public class Triangle extends Figure{
    private int a, b, c;
    private String name = "Triangle";
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String getName() {
        return name;
    }

    public int getA() { return a; }
    public int getB() { return b; }
    public int getC() { return c; }

    double getArea() {
        if (((a+b)<c) || ((b+c)<a) || ((a+c)<b))
            return 0.0;
        double p = (a+b+c)/2;
        double s;

        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
