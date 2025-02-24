package hardsPracticeTask1;

public class MathOperations {

    public static int add(int x, int y) {
        return x + y;
    }
    public static int substract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x) - Math.abs(y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static String convertSecondsToMinutes(int seconds) {
        String s = "минуты = секунды/60 = " + seconds + "/ 60 = "  + seconds / 60;
        return s;
    }

    public static String averageSpeed(double distance, double time) {
        String speed = "скорость=расстояние/время: "  + distance + " / " + time + " = " + distance/ time;
        return speed;
    }

    public static String findHypotenuse(double a, double b) {
        double hypo = Math.sqrt(a) + Math.sqrt(b);
        String g = "гипотенуза = " + hypo;
        return g;

    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total ) * 100;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println("add: " + add(2, 5));
        System.out.println("substract: " + substract(4, 3));
        System.out.println("multiply: " + multiply(5, 15));
        System.out.println("divide: " + divide(9, 3));
        System.out.println("-------------------------------");
        System.out.println("findMax: " + findMax(-55, -66));
        System.out.println("difference: " + difference(200, -15));
        System.out.println("squareArea: " + squareArea(5));
        System.out.println("squarePerimeter: " + squarePerimeter(10));
        System.out.println("convertSecondsToMinutes: " + convertSecondsToMinutes(120));
        System.out.println("averageSpeed " + averageSpeed(650.5, 2.5));
        System.out.println("-----------------------------------");
        System.out.println("Гипотенуза равна: " + findHypotenuse(25, 16));
        System.out.println("Длина окружности равна: " + circleCircumference(4.0));
        System.out.println("Процент = " + calculatePercentage(20.0, 4.0 ));
        System.out.println("celsiusToFahrenheit: " + celsiusToFahrenheit(36.0));
        System.out.println("fahrenheitToCelsius " + fahrenheitToCelsius(96.8));




    }

}
