package Strumienie;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Daniel","Salazar","Agnieszka","Oskar","Robespiere","Angela","Dżesika","Leonardo","Aleksandra","Agnieszka");

        names.stream()  //strumien obiektowy
                .filter(s -> s.endsWith("a"))   //filtruje facetow
                .map(s -> s.toUpperCase())      //zmienia strumien na uppercase
//                .map(s -> s.substring(s.length()-1))        //zwraca ostatni element stringa
                .distinct()                     //usuwa wszystkie duplikaty
//                .limit(5)                       //limituje ilosc danych strumienia
//                .max((s,s1) -> Integer.compare(s.length(),s1.length()))   //wyszukuje maksymalna wg podanej logiki
                .reduce((s,s1) -> s + " " + s1)  //redukuje wyniki zaleznia od podanej logiki
//               .forEach(s -> System.out.println(s));       //drukuje
                .ifPresent( s -> System.out.println(s));


        System.out.println(names.stream()  //strumien liczbowy
                .filter(s -> s.endsWith("a"))
                .distinct()
                .mapToInt(s -> s.length())      //konwersja na strumien liczbowy
                .sum());

        System.out.println(names);

        //Strumien liczbowy
    }
}
