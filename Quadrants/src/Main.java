import java.util.Scanner;

public class Main {

    private static int determineQuadrant(double x, double y) {
            if (x > 0 && y > 0) {
                return 1;
            } else if (x > 0 && y < 0) {
                return 4;
            } else if (x < 0 && y > 0) {
                return 2;
            } else if (x < 0 && y < 0) {
                return 3;
            }
            // case of x or y neither even nor odd (i.e., zero), lies on the lines of the grid
            return 0;
    }
    public static void main(String[] args) {
        double x;
        double y;

        var scanner = new Scanner(System.in);
        System.out.print("x > ");
        x = scanner.nextInt();

        System.out.print("y > ");
        y = scanner.nextInt();

        int quadrant = determineQuadrant(x, y);

        if (quadrant == 0) {
            System.out.println("Invalid quadrant");
        } else {
            System.out.printf("You're in quadrant: %d", quadrant);
        }
    }
}