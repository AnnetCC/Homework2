
import java.util.Scanner;
public class Task1 {
    double celsius, kelvin, fahrenheit, inche, kilometre, pound, mionhr, hour, day, minute, finalscore;
    int percentage;

    public double convertToFahrenheit(double celsius) {
        fahrenheit = (celsius * 9.0) / 5 + 32.0;
        return fahrenheit;
    }

    public double convertToCelsius(double fahrenheit) {
        celsius = (fahrenheit - 32.0) * (5. / 9);
        return celsius;
    }

    public double convertToKelvin(double celsius) {
        kelvin = celsius + 273.16;
        return kelvin;
    }

    public double convertToInches(double metre) {
        inche = metre / 39.37;
        return inche;
    }

    public double convertToKilometres(double mile) {
        kilometre = mile / 1.609;
        return kilometre;
    }

    public double convertToPounds(double kilogram) {
        pound = kilogram / 2.2046;
        return pound;
    }

    public double convertToMiOnHr(double kmonhr) {
        mionhr = kmonhr / 0.6214;
        return mionhr;
    }

    public double convertToHours(double second) {
        hour = second / 3600.0;
        return hour;
    }

    public double convertToMinutes(double second) {
        minute = second / 60.0;
        return minute;
    }

    public double convertToDays(double second) {
        day = second / 86400.0;
        return day;
    }

    public int findPercentage(int mark, int total) {
        percentage = (mark * 100) / total;
        return percentage;
    }

    public double findFinalScore(double correct, double wrong) {
        finalscore = correct - 0.25 * wrong;
        return finalscore;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Task1 task1 = new Task1();
        System.out.println("Fahrenheit= " + task1.convertToFahrenheit(56.0));
        System.out.println("Celsius= " + task1.convertToCelsius(670.0));
        System.out.println("Kelvin= " + task1.convertToKelvin(41.6));
        System.out.println("Inches= " + task1.convertToInches(45.9));
        System.out.println("Miles= " + task1.convertToKilometres(8.1));
        System.out.println("Pounds= " + task1.convertToPounds(432.19));
        System.out.println("Min/Hr= " + task1.convertToMiOnHr(29.76));
        System.out.println("Km/Hr= " + task1.convertToMiOnHr(29.76));
        System.out.println("Days= " + task1.convertToDays(450981.98));
        System.out.println("Hours= " + task1.convertToHours(32.2));
        System.out.println("Minutes= " + task1.convertToMinutes(450.98));
        System.out.println("Final test= " + task1.findFinalScore(4.0, 12.0));
        System.out.println("Введите оценку студента и общую оценку теста через пробел:");
        System.out.println("Percent= " + task1.findPercentage(in.nextInt(), in.nextInt()));

    }
}