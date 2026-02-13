//program from Java applications class
//we will implement two simple tests
package testing;

public class Receipt {

    public static final double SALES_TAX_RATE = 0.04225;

    public static double calculateSubtotal(int quantity, double price) {
        return quantity * price;
    }

    public static double calculateTotal(double subtotal) {
        return subtotal + (subtotal * SALES_TAX_RATE);
    }

    
    public static void main(String[] args) {
        
    }
}

