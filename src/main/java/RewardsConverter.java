import java.util.Scanner;

public class RewardsConverter {

    public static void main(String[] args) {
        RewardsConverter converter = new RewardsConverter();
        converter.run();
    }

    public void run() {
        double cashValue = getInputValue();
        if (cashValue < 0) {
            System.out.println("Invalid input. Exiting.");
            return;
        }
        
        convertAndDisplayMiles(cashValue);
    }

    private double getInputValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        String inputValue = scanner.nextLine();
        
        return parseCashValue(inputValue);
    }

    private double parseCashValue(String inputValue) {
        try {
            return Double.parseDouble(inputValue);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double.");
            return -1;
        }
    }

    private void convertAndDisplayMiles(double cashValue) {
        System.out.println("Converting $" + cashValue + " to miles");
        RewardValue rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + cashValue + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}
// I am sorry but I am not quiet good with Java. I know only C++ and Python
