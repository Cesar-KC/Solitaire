package testing; //allows us to test other code files in same package

import org.junit.jupiter.api.Test; // test methods
import static org.junit.jupiter.api.Assertions.*; // import assertions to check conditions, we need to verify

class ReceiptTest {

	// This test should verify that value of subtotal function is equal to 30.
    @Test
    void testCalculateSubtotal() {
        double result = Receipt.calculateSubtotal(3, 10.0);
        assertEquals(30.0, result);
    }

    // This test should verify that value of Total function is equal to subtotal plus value of the taxes.
    @Test
    void testCalculateTotal() {
        double subtotal = 100.0;
        double expected = 100.0 + (100.0 * Receipt.SALES_TAX_RATE);

        double result = Receipt.calculateTotal(subtotal);

        assertEquals(expected, result);
    }
}
