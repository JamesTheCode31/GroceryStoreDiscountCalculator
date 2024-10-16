/*
James Arnold S. Nieves
October 2, 2024
Grocery Store DiscountCalculator
*/
import java.util.Scanner;

public class GroceryStoreDiscountCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ask the user to put a purchase amount
        System.out.print("Enter the total purchase amount (in PHP): ");
        double totalAmount = scanner.nextDouble();
        
        double discount = 0;
        double finalPrice = totalAmount;

        // calculate the purchase with discount 
        if (totalAmount < 1000) {
            discount = 0;
        } else if (totalAmount >= 1000 && totalAmount <= 5000) {
            discount = totalAmount * 0.05; // 5% discount
        } else if (totalAmount >= 5001 && totalAmount <= 10000) {
            discount = totalAmount * 0.10; // 10% discount
        } else {
            discount = totalAmount * 0.15; // 15% discount
        }

        // calculate the final price
        finalPrice = totalAmount - discount;

        // show the result of final price with discount
        System.out.printf("Discount applied: %.0f%%\n", (discount / totalAmount) * 100);
        System.out.printf("Final price after discount: PHP %.2f\n", finalPrice);
        
        
        scanner.close();
    }
}
