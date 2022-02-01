package figur;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figure = new Figure[3];
        figure[0] = new Triangle(randomNumberGenerator(),
                randomNumberGenerator(),
                randomNumberGenerator());
        figure[1] = new Circle(randomNumberGenerator());
        figure[2] = new Square(randomNumberGenerator());

        //new array with 10 random figures
        Figure[] figures = new Figure[10];
        for (int i = 0; i < 10; i++) {
            int j = random.nextInt(3);
            figures[i] = figure[j];
        }

        //bubble sort
        for(int i = figures.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++){
                if( figures[j].getArea() > figures[j+1].getArea() ){
                    Figure tmp = figures[j];
                    figures[j] = figures[j+1];
                    figures[j+1] = tmp;
                }
            }
        }

        //output
        for (int i = 0; i < figures.length; i++) {
            int j = random.nextInt(3);
            System.out.println(figures[i].getName() +" : "+ figures[i].getArea());
        }
    }
    public static int randomNumberGenerator() { // generate random coordinate values
        Random random = new Random();
        int randomValue = random.nextInt(100);
        return randomValue;
    }
}
