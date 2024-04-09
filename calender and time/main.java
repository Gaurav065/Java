import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// import java.time.format.DateTimeFormatterBuilder;
public class main {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("Current Date: "+ ld);
        int year = ld.getYear();
        int month  = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        System.out.println("year: "+year);
        System.out.println("month: "+month);
        System.out.println("day :"+day);
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("MM-dd-yyy");
        String formated_date = ld.format(dtf);
        System.out.println("Formated date :"+ formated_date);

        LocalDate ld2 = LocalDate.of(2024, 07, 03);
        System.out.println("Special Day :"+ ld2);
        LocalDate nm = ld.plusMonths(1);
        System.out.println("manipulated data :"+ nm);
    }
}
