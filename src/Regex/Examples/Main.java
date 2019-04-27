package Regex.Examples;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "(m[abcA-Z]){1,5}p?.";
        String word = "mzmbmAmDmCp4";

        System.out.println("Dopasowanie " + Pattern.matches(regex, word));
    }
}
