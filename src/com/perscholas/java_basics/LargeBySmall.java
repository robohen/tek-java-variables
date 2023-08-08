package variables.src.com.perscholas.java_basics;

public class LargeBySmall {
    public static void main(String[] args) {
        // Declare and initialize two double variables
        double num1 = 20.0;
        double num2 = 4.0;

        // Find the larger and smaller numbers
        double largerNumber = Math.max(num1, num2);
        double smallerNumber = Math.min(num1, num2);

        // Divide the larger number by the smaller number and store the result
        double divisionResult = largerNumber / smallerNumber;

        // Print out the division result
        System.out.println("Division result: " + divisionResult);

        // Cast the division result to an integer
        int castedResult = (int) divisionResult;

        // Print out the casted result
        System.out.println("Casted result: " + castedResult);
    }
}
