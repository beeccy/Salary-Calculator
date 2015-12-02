/**
 * Created by beeccy on 02/12/15.
 */
public class MainApplication {
    public static void main(String[] args) {
        double hourlyPay = 160;
        double hoursWorked = 8.5;
        double lunchBreak = 0.5;
        double taxPercentage = 0.75;
        double holidayPercentage = 0.78;

        double calculatedPay = calculatePay(hoursWorked, hourlyPay, lunchBreak);
        double finishedSalary = SalaryAfterTax(calculatedPay, taxPercentage, holidayPercentage);

        Print(calculatedPay);
        Print(finishedSalary);
    }

    /* This calculates time correctly */
    public static double calculatePay(double hours, double pay, double lunch) {
        double toAvoidDesimals = 100;

        double workHours = hours * toAvoidDesimals;

        double timeCalculated = ((workHours - lunch) * pay) / toAvoidDesimals;

        return timeCalculated;
    }

    public static double SalaryAfterTax(double salary, double tax, double holiday) {
        double toAvoidDesimals = 100;

        double calculateSalary = (salary * tax) * holiday;

        return calculateSalary;
    }

    public static void Print(double printNumber) {
        System.out.println(printNumber);
    }
}
