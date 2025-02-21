import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello AI Reviewer");
        randomDivision();
    }

    private static void randomDivision() {
        Random random = new Random();
        double x = random.nextDouble(8);
        double y = random.nextDouble(8);

        System.out.println("x: " + x);

        System.out.println("y: " + y);

        double d = x / y;
        System.out.println("x / y: " + d);

    }

}