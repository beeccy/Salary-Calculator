import javax.swing.*;

public class MainApplication {
    public static void main(String[] args) {
        double percentage = 1;

        double hourlyPay = getDouble("What is your hourly pay?");
        double hoursWorked = getDouble("How many hours have you worked?");
        double lunchBreak = getDouble("How long is your lunch break (written 0.xx)?");
        double daysTotal = getDouble("How many days will/have you work(ed)?");
        double taxPercentage = getDouble("What is your tax percentage (written 0.xx)?");

        double calculatedPay = calculatePay(hoursWorked, hourlyPay, lunchBreak, daysTotal);
        double finishedSalary = SalaryAfterTax(calculatedPay, taxPercentage);

        String americanDollar = "$";
        String japaneseYen = "¥";
        String britishPounds = "£";
        String euro = "€";
        String norwegianCrown = " kr";

        JOptionPane.showMessageDialog(null,
                "NOK before tax:\n" + calculatedPay + norwegianCrown + "\n" +
                "\nNOK after tax:\n" + finishedSalary + norwegianCrown + "\n" +
                        "\nNOK to USD:\n" + americanDollar + nokToUsd(finishedSalary) + "\n" +
                        "\nNOK to JPY\n" + japaneseYen + nokToYen(finishedSalary) + "\n" +
                        "\nNOK to GBP\n" + britishPounds + nokToBPounds(finishedSalary) + "\n" +
                        "\nNOK to EUR\n" + euro + nokToEuro(finishedSalary),
                "Your salary",
                1
        );
    }

    private static double getDouble(String doubleValue) {
        double text = Double.parseDouble(
                JOptionPane.showInputDialog(null, doubleValue)
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
        double toAvoidDecimals = 100;

        double workHours = hours * toAvoidDecimals;

        return ((workHours - lunch) * pay) * days / toAvoidDecimals;
    }

    public static double SalaryAfterTax(double salary, double tax) {
        tax = 1 - tax;
        return (salary * tax);
    }
}
