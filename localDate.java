import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class localDate {
    public static void main(String[] args){
        LocalDate obj=LocalDate.now();
        System.out.println(obj);
        LocalTime obj1=LocalTime.now();
        System.out.println(obj1);
        LocalDateTime obj2=LocalDateTime.now();
        System.out.println(obj2);
    }
}
/*public class localDate{
    public static void main(String[] args) {
        LocalDateTime obj=LocalDateTime.now();
        System.out.println("Before formatting: "+obj);
        DateTimeFormatter obj1=DateTimeFormatter.ofPattern("dd-mm-yyyy hh-mm-ss-ns");
        String formatedData=obj.format(obj1);
        System.out.println("After formatting: "+formatedData);
      }
}*/