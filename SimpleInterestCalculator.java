import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("PRINCIPAL: ");
        double principal = scanner.nextDouble();

        System.out.print("RATE OF INTEREST: ");
        double rate = scanner.nextDouble();

        System.out.print("TIME PERIOD in years: ");
        double time = scanner.nextDouble();


        double simpleInterest = (principal * rate * time) / 100;


        System.out.println("SIMPLE INTEREST: " + simpleInterest);

        scanner.close();
    }
}

