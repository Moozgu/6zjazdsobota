package DateTimeFOrmatter;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("Podaj date ");
        String textDate = scanner.nextLine();


        LocalDateTime time = LocalDateTime.parse(textDate, dateTimeFormatter);
        System.out.println(time);
        Timestamp date = Timestamp.valueOf(time);


        System.out.println(date);
    }
}
