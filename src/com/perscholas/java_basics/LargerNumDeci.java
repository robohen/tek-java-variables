package variables.src.com.perscholas.java_basics;

public class LargerNumDeci {
    public static void main(String[] args) {
        // Declare and initialize two integer variables
        int num1 = 10;
        int num2 = 5;

        int largerNumber = Math.max(num1, num2);
        int smallerNumber = Math.min(num1, num2);

        // Divide the larger number by the smaller number and store the result
        int divisionResult = largerNumber / smallerNumber;

        // Print out the result
        System.out.println("Division result: " + divisionResult);

        // Change the larger number to a decimal
        double decimalNumber = 10.0;

        // Corrected division using decimal number
        double correctedResult = decimalNumber / smallerNumber;
        System.out.println("Corrected division result: " + correctedResult);
    }
}
