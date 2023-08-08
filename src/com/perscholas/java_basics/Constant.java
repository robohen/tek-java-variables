package variables.src.com.perscholas.java_basics;

public class Constant {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        // Declare a variable and use the named constant in a calculation
        double radius = 5.0;
        double area = PI * radius * radius;

        // Print the calculated area
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
