import java.util.Scanner;

public class Main {

    private static double customerChange;

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);

        double priceInLeva = Math.round(userInput.nextFloat()*100.0)/100.0;
        double customerPaid = Math.round(userInput.nextFloat());
        customerChange = Math.round((customerPaid - priceInLeva)*100.0)/100.0;


        changeFunction(1);
        changeFunction(0.5);
        changeFunction(0.2);
        changeFunction(0.1);
        changeFunction(0.05);
        changeFunction(0.02);
        changeFunction(0.01);
    }

    public static double changeFunction(double coins) {

        int counter = 0;

        while (coins <= (customerChange)) {
            counter++;
            customerChange = Math.round((customerChange - coins)*100.0)/100.0;
        }

        if (counter > 0) {
            if (coins == 1) {
                System.out.println(counter + " x 1 lev");
            } else if (coins == 0.5) {
                System.out.println(counter + " x 50 stotinki");
            } else if (coins == 0.2) {
                System.out.println(counter + " x 20 stotinki");
            } else if (coins == 0.1) {
                System.out.println(counter + " x 10 stotinki");
            } else if (coins == 0.05) {
                System.out.println(counter + " x 5 stotinki");
            } else if (coins == 0.02) {
                System.out.println(counter + " x 2 stotinki");
            } else if (coins == 0.01) {
                System.out.println(counter + " x 1 stotinka");
            }

        }

        return customerChange;
    }
}
