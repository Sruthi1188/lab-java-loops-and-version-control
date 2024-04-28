public class Task3 {
    public static void main(String[] args) {
        double x = 2;
        double y = 4;
        calculateFunction(x, y);
    }

    public static void calculateFunction(double x, double y) {
        double solution = (x * x) + ((((4 * y) / 5) - x) * (((4 * y) / 5) - x));
        System.out.println(solution);
    }
}
