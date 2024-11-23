package ass4;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;
        
        while (true) {
            System.out.print("Enter month (full name, abbreviation, or number): ");
            monthInput = scanner.nextLine().trim();
            
            System.out.print("Enter year (non-negative 4-digit number): ");
            year = scanner.nextInt();
            scanner.nextLine(); 
            
            if (isValidYear(year) && isValidMonth(monthInput)) {
                int days = getDaysInMonth(monthInput, year);
                System.out.println("Month " + monthInput + " in year " + year + " has " + days + " days.");
                break;
            } else {
                System.out.println("Invalid input. Please enter again.");
            }
        }

        scanner.close();
    }

    public static boolean isValidMonth(String month) {
        return getMonthNumber(month) != -1;
    }

    public static boolean isValidYear(int year) {
        return year >= 0 && Integer.toString(year).length() == 4;
    }

    public static int getDaysInMonth(String month, int year) {
        int monthNumber = getMonthNumber(month);
        
        int[] daysInCommonYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] daysInLeapYear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (isLeapYear(year)) {
            return daysInLeapYear[monthNumber - 1];
        } else {
            return daysInCommonYear[monthNumber - 1];
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getMonthNumber(String month) {
        switch (month.toLowerCase()) {
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            case "march": case "mar.": case "mar": case "3": return 3;
            case "april": case "apr.": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun.": case "jun": case "6": return 6;
            case "july": case "jul.": case "jul": case "7": return 7;
            case "august": case "aug.": case "aug": case "8": return 8;
            case "september": case "sept.": case "sep": case "9": return 9;
            case "october": case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return -1; 
        }
    }
}
