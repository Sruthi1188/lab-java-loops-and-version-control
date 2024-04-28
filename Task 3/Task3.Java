public class Task3 {
    public static void main(String[] args) {

        double x= 2;
        double y= 4;
        calaculate_function(x,y);


    }
    public static <args> void calaculate_function(double x, double y) {
        double solution = (x * x) + (((4 * y / 5) - x) * ((4 * y / 5) - x));
        System.out.println(solution);
    }
}
