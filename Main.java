import java.util.Scanner;

public class Main {

    private static double customerChange;

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);

        double priceInLeva = userInput.nextFloat();
        double customerPaid = userInput.nextFloat();
        customerChange = Math.round((customerPaid - priceInLeva)*100.0)/100.0;
    }

    public double changeFunction(double coins) {

        int counter = 0;

        while (coins <= (customerChange)) {
            counter++;
            customerChange = Math.round((customerChange - 1)*100.0)/100.0;
        }

        if (counter > 0) {
            System.out.println(counter + " x 1 lev");
        }

        return customerChange;

    }

    public void changeFunctionCalling() {
        changeFunction(1);
    }
}
