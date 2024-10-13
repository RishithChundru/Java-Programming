/*import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.temporal.*;
public class DateDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input first date
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String date1 = scanner.nextLine();
        
        // Input second date
        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String date2 = scanner.nextLine();
        
        scanner.close();
        
        // Parsing the input strings to LocalDate objects
        LocalDate ld1 = LocalDate.parse(date1);
        LocalDate ld2 = LocalDate.parse(date2);
        
        // Calculating the difference in days between the two dates
        long daysDiff = ChronoUnit.DAYS.between(ld1, ld2);
        
        // Calculating the difference in months between the two dates
        long monthsDiff = ChronoUnit.MONTHS.between(ld1, ld2);
        
        // Calculating the difference in years between the two dates
        long yearsDiff = ChronoUnit.YEARS.between(ld1, ld2);
        
        // Outputting the results
        System.out.println("Days difference between two dates: " + Math.abs(daysDiff));
        System.out.println("Months difference between two dates: " + Math.abs(monthsDiff));
        System.out.println("Years difference between two dates: " + Math.abs(yearsDiff));
    }
}
*/
import java.time.DayOfWeek;
import java.time.*;
import java.util.*;
import java.time.format.*;

public class DateDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input first date
        // System.out.print("Enter the first date (YYYY-MM-DD): ");
        String date1 = scanner.nextLine();
        
        // Input second date
        // System.out.print("Enter the second date (YYYY-MM-DD): ");
        String date2 = scanner.nextLine();

        // Parsing the input strings to LocalDate objects
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate ld1 = LocalDate.parse(date1,df);
        LocalDate ld2 = LocalDate.parse(date2,df);
        
        // Calculating the difference in days between the two dates
        // long daysDiff = ChronoUnit.DAYS.between(ld1, ld2);
        
        // // Calculating the difference in months between the two dates
        // long monthsDiff = ChronoUnit.MONTHS.between(ld1, ld2);
        
        // // Calculating the difference in years between the two dates
        // long yearsDiff = ChronoUnit.YEARS.between(ld1, ld2);
        
        // Counting the number of Sundays between the two dates
        // long sundaysCount = 0;
        // for (LocalDate date = ld1; !date.isAfter(ld2); date = date.plusDays(1)) {
        //     if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
        //         sundaysCount++;
        //     }
        // }
        int count=0;
        while(ld1.isBefore(ld2)){
            if(ld1.getDayOfWeek()==DayOfWeek.SATURDAY){
                count++;
            }
            ld1.plusDays(1);
        }
        // Outputting the results
        // System.out.println("Days difference between two dates: " + daysDiff);
        // System.out.println("Months difference between two dates: " + monthsDiff);
        // System.out.println("Years difference between two dates: " + yearsDiff);
        System.out.println("Number of Saturdays between two dates: " + count);
    }
}
