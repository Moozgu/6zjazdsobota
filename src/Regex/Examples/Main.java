package Regex.Examples;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "map";
        String word = "";

        System.out.println("Dopasowanie " + Pattern.matches(regex, word));
    }
}
