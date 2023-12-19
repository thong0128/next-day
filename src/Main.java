import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static String getNextDate(String curDate) {
        final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
        final Date date;
        try {
            date = format.parse(curDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        return format.format(calendar.getTime());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month, year;
        String input;
        System.out.print("Enter day: ");
        day = scanner.nextInt();
        System.out.print("Enter month: ");
        month = scanner.nextInt();
        System.out.print("Enter year: ");
        year = scanner.nextInt();

        input = day + "/" + month + "/" + year;
        System.out.println(getNextDate(input));

    }
}