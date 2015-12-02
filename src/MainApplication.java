import javax.swing.*;

public class MainApplication {
    public static void main(String[] args) {
        double percentage = 1;

        double hourlyPay = JOptionFunction("What is your hourly pay?");
        double hoursWorked = JOptionFunction("How many hours have you worked?");
        double lunchBreak = JOptionFunction("How long is your lunch break (written 0.xx)?");
        double daysTotal = JOptionFunction("How many days will/have you work(ed)?");
        double taxPercentage = JOptionFunction("What is your tax percentage (written 0.xx)?");

        double calculatedPay = calculatePay(hoursWorked, hourlyPay, lunchBreak, daysTotal);
        double finishedSalary = SalaryAfterTax(calculatedPay, taxPercentage);

        String americanDollar = "$";
        String japaneseYen = "¥";
        String britishPounds = "£";
        String euro = "€";
        String norwegianCrown = " kr";

        System.out.println(calculatedPay + norwegianCrown);
        System.out.println(finishedSalary + norwegianCrown);

        System.out.println(americanDollar + nokToUsd(finishedSalary));
        System.out.println(japaneseYen + nokToYen(finishedSalary));
        System.out.println(britishPounds + nokToBPounds(finishedSalary));
        System.out.println(euro + nokToEuro(finishedSalary));
    }

    private static double JOptionFunction(String JOptionText) {
        double text = Double.parseDouble(
                JOptionPane.showInputDialog(null, JOptionText)
        );

        return text;
    }

    private static double nokToUsd(double salaryUSDollars) {
        double currency = 0.12;
        salaryUSDollars = currency * salaryUSDollars;

        return salaryUSDollars;
    }

    private static double nokToYen(double salaryYen) {
        double currency = 14.24;
        salaryYen = currency * salaryYen;

        return salaryYen;
    }

    private static double nokToBPounds(double salaryPounds) {
        double currency = 0.077;
        salaryPounds = currency * salaryPounds;

        return salaryPounds;
    }

    private static double nokToEuro(double salaryEuro) {
        double currency = 0.11;
        salaryEuro = currency * salaryEuro;

        return salaryEuro;
    }

    /* This calculates time correctly */
    public static double calculatePay(double hours, double pay, double lunch, double days) {
        double toAvoidDesimals = 100;

        double workHours = hours * toAvoidDesimals;

        return ((workHours - lunch) * pay) * days / toAvoidDesimals;
    }

    public static double SalaryAfterTax(double salary, double tax) {

        return (salary * tax);
    }
}
