import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello AI Reviewer");
        randomDivision();
    }

    private static void randomDivision() {
        Random random = new Random();
        double x = random.nextDouble(10);
        double y = random.nextDouble(10);

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println(x / y);
    }

}