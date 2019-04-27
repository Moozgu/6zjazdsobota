package Regex.Tasks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*numer telefonu
        String regex = "[0-9]{3}-[0-9]{3}-[0-9]{3}";
        System.out.println("Podaj numer telefonu  w formacie xxx-xxx-xxx");
        String number = scanner.nextLine();

        System.out.println("Dopasowanie " + Pattern.matches(regex,number));
*/
        /*kod pocztowy

        String regex = "[0-9]{2}-[0-9]{3}";
        System.out.println("Podaj kod pocztowy  w formacie xx-xxx");
        String number = scanner.nextLine();

        System.out.println("Dopasowanie " + Pattern.matches(regex,number));
*/
        /*email(prosta wersja)

        String regex = ".{1,999}@.{1,999}\\..{1,999}";
        System.out.println("Podaj email  w formacie x@x.x");
        String number = scanner.nextLine();

        System.out.println("Dopasowanie " + Pattern.matches(regex,number));
*/
        /*data w formacie (2000-12-30 pon)

        String regex = "[0-9]{4}-[0-1][0-9]-[0-3][0-9] [a-z]{2,3}";
        System.out.println("Podaj data w formacie (2000-12-30 pon)");
        String number = scanner.nextLine();

        System.out.println("Dopasowanie " + Pattern.matches(regex,number));
*/
        /*kod kraju i rozwiniecie np pl-Poland, en - England
        String regex = "[a-z]{2}-[A-Z][a-z]{1,200}";
        System.out.println("Podaj kod kraju i rozwiniecie np pl-Poland, en-England");
        String number = scanner.nextLine();

        System.out.println("Dopasowanie " + Pattern.matches(regex,number));

         */

        /*adres IP np 192.168.0.1*/
        String regex = "([0-9]{3}\\.){2}[0-9]{1,3}\\.[0-9]{1,3}";
        System.out.println("Podaj adres ip");
        String number = scanner.nextLine();

        System.out.println("Dopasowanie " + Pattern.matches(regex,number));
    }
}
