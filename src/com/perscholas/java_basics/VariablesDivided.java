package variables.src.com.perscholas.java_basics;

public class VariablesDivided {
    public static void main(String[] args) {
        // Declare and initialize integer variables x and y
        int x = 5;
        int y = 6;

        // Calculate y/x and assign it to the variable q
        int q = y / x;

        // Print the value of q
        System.out.println("q after integer division: " + q);

        // Cast y to a double and assign it to q
        q = (int) (double) y;

        // Print the value of q again
        System.out.println("q after casting to double: " + q);
    }
}