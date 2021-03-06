package exceptions;

/**
 * @author Cristian
 */
public class ThrowsSyntax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(circleArea(-1.5));
        } catch (Exception e) {
            System.out.println("Cannot calculate area: " + e.getMessage());
        }
    }

    static double circleArea(double radius) throws Exception {
        if (radius < 0) {
            throw new Exception("radius should be positive");
        }
        return Math.PI * radius * radius;
    }

}
