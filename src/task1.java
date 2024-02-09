import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double price = 0;
        double shippingCost;
        double totalCost;

        System.out.println("Enter your price: ");

        if(in.hasNextDouble()){
            price = in.nextDouble();
            in.nextLine();
        }

        shippingCost = price * .02;
        totalCost = price + shippingCost;

        if (price >= 100) {
            System.out.println("Shipping is free. Yay!");
        } else if (price < 100) {
            System.out.println("Your shipping cost is: $" + shippingCost);
        }

        System.out.println("Your total cost is: $" + totalCost);
    }
}
