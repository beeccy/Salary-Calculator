import java.util.Scanner;

/**
 * Created by beeccy on 02/12/15.
 */
public class MainApplication {
    public static void main(String[] args) {
        double percentage = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hourly pay: ");
        double hourlyPay = scanner.nextDouble();
        System.out.println("Hours worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.println("Lunch break: ");
        double lunchBreak = scanner.nextDouble();
        System.out.println("How many days? ");
        double daysTotal = scanner.nextDouble();
        System.out.println("Tax percentage (written 0.xx): ");
        double taxPercentage = percentage - scanner.nextDouble();

        double calculatedPay = calculatePay(hoursWorked, hourlyPay, lunchBreak, daysTotal);
        double finishedSalary = SalaryAfterTax(calculatedPay, taxPercentage);

        String americanDollar = "$";
        String japaneseYen = "¥";
        String britishPounds = "£";
        String euro = "€";
        String norwegianCrown = " kr";

        Print(calculatedPay);
        System.out.println(finishedSalary + norwegianCrown);

        System.out.println(nokToUsd(finishedSalary) + americanDollar);

    }

    private static double nokToUsd(double salaryUSDollars) {
        double currency = ;
        salaryUSDollars = currency * salaryUSDollars;

        return salaryUSDollars;
    }

    /* This calculates time correctly */
    public static double calculatePay(double hours, double pay, double lunch, double days) {
        double toAvoidDesimals = 100;

        double workHours = hours * toAvoidDesimals;

        double timeCalculated = ((workHours - lunch) * pay) * days / toAvoidDesimals;

        return timeCalculated;
    }

    public static double SalaryAfterTax(double salary, double tax) {
        double toAvoidDesimals = 100;

        double calculateSalary = (salary * tax);

        return calculateSalary;
    }

    public static void Print(double printNumber) {
        System.out.println(printNumber);
    }
}
