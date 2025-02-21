import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello AI Reviewer");
        randomDivision();
    }

    private static void randomDivision() {
        Random random = new Random();
        double x = random.nextDouble(8);
        double y2 = random.nextDouble(8);

        System.out.println("x: " + x);

        System.out.println("y: " + y2);

        double d = x / y2;
        System.out.println("x / y: " + d);

    }

}