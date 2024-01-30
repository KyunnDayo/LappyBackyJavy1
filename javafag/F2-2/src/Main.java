import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double FirstBalance, InterestRate, CompoundRate, ComputedBalance;
        double MonthlyRate, DailyRate, MonthlyBalance, DailyBalance;
        char answer;

        do {
            //Obtaining user input of data
            System.out.print("Please enter exact initial balance (e.g 100.00): ");
            FirstBalance = input.nextFloat();
            System.out.print("Please enter your interest rate in pecent (e.g. 7.50): ");
            InterestRate = input.nextFloat();

            //initial computation for rate
            MonthlyRate = InterestRate / 12;
            DailyRate = InterestRate / 365;
            InterestRate = InterestRate / 100;

            //feedback of input
            System.out.println("\nYour initial balance is: $" + String.format("%.2f", FirstBalance));
            System.out.println("Your interest rate is: " + InterestRate);

            //Initial computation
            double[] StoredBalanceYear = new double[11];
            ComputedBalance = FirstBalance;
            System.out.println("\nWith a monthy rate of: " + String.format("%.2f", MonthlyRate) + "%");
            System.out.println("And a daily rate of: " + String.format("%.2f", MonthlyRate) + "%");

            //monthly and daily balance computation
            MonthlyBalance = (FirstBalance * MonthlyRate) + FirstBalance;
            System.out.println("\nYour monthly profit is: " + String.format("%.2f", MonthlyBalance));
            DailyBalance = (FirstBalance * DailyRate) + FirstBalance;
            System.out.println("Your daily profit is: " + String.format("%.2f", DailyBalance));

            System.out.println("\nYour yearly balance for the next 10 years is as follows: ");

            //10 year Computation
            for (int i = 1; i <= 10; ++i) {
                CompoundRate = ComputedBalance * InterestRate;
                ComputedBalance = CompoundRate + ComputedBalance;
                StoredBalanceYear[i] = ComputedBalance;
                System.out.println("Year " + i + " " + String.format("%.2f", StoredBalanceYear[i]));
            }

            //end menu
            System.out.println("");
            System.out.println("Do you want to do it again?");
            System.out.print("Enter y for yes or n for no.");
            answer = input.next().charAt(0);
        } while ((answer == 'y') || (answer == 'Y'));
    }
}