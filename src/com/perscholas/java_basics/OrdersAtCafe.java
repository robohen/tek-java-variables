package variables.src.com.perscholas.java_basics;

public class OrdersAtCafe {
    public static void main(String[] args) {
        // Product prices
        double coffeePrice = 2.99;
        double cappuccinoPrice = 3.49;
        double espressoPrice = 2.79;

        // Quantities ordered
        int coffeeQuantity = 3;
        int cappuccinoQuantity = 4;
        int espressoQuantity = 2;

        // Calculate subtotals for each product
        double coffeeSubtotal = coffeePrice * coffeeQuantity;
        double cappuccinoSubtotal = cappuccinoPrice * cappuccinoQuantity;
        double espressoSubtotal = espressoPrice * espressoQuantity;

        // Calculate total order subtotal
        double subtotal = coffeeSubtotal + cappuccinoSubtotal + espressoSubtotal;

        // Sales tax rate as a constant
        final double SALES_TAX_RATE = 0.07;

        // Calculate total sale including sales tax
        double totalSale = subtotal * (1 + SALES_TAX_RATE);

        // Format the results to two decimal places
        String formattedSubtotal = String.format("%.2f", subtotal);
        String formattedTotalSale = String.format("%.2f", totalSale);

        // Print the results
        System.out.println("Product Subtotals:");
        System.out.println("Coffee: $" + coffeeSubtotal);
        System.out.println("Cappuccino: $" + cappuccinoSubtotal);
        System.out.println("Espresso: $" + espressoSubtotal);
        System.out.println("Subtotal: $" + formattedSubtotal);
        System.out.println("Total Sale (including tax): $" + formattedTotalSale);
    }
}
