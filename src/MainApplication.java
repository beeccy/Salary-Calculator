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

//        SalaryBeforeTax(hoursWorked, hourlyPay, lunchBreak);
//        double timeCalculated = SalaryAfterTax(hourlySalary, taxPercentage);

        double calculatedPay = calculatePay(hoursWorked, hourlyPay, lunchBreak);
        SalaryAfterTax(calculatedPay, taxPercentage);
    }

    /* This calculates time correctly */
    public static double calculatePay(double hours, double pay, double lunch) {
        double toAvoidDesimals = 100;

        double workHours = hours * toAvoidDesimals;

        double timeCalculated = ((workHours - lunch) * pay) / toAvoidDesimals;

        return timeCalculated;
    }

    public static double SalaryAfterTax(double x, double y) {
        
    }

    public static void Print(double printNumber) {
        System.out.println(printNumber);
    }
}
