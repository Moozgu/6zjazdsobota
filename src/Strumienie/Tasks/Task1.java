package Strumienie.Tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person (76,"Aleksandra", "Scholz"));
        people.add(new Person (13,"Lukasz", "Gilga"));
        people.add(new Person (25,"Oskar", "Polak"));
        people.add(new Person (13,"Nina", "Zdrzenicka"));
        people.add(new Person (44,"Jarek", "Soli"));
        people.add(new Person (38,"Melisandre", "Tarth"));
        people.add(new Person (29,"Salazar", "Wizard"));
        people.add(new Person (38,"Melisandre", "Tarth"));

        //Task2
        people.stream()
                .mapToInt(s -> s.getAge())
                .average()
                .ifPresent(s -> System.out.println(s));
        //Task5
        List<Integer> peopleAge;
        peopleAge = people.stream()
                .map(s -> s.getAge())
                .collect(Collectors.toList());

        System.out.println(peopleAge);
        //Task8
        System.out.println(people.stream()
                .distinct().count());

        //Task6
        people.stream()
                .forEach(s -> {
                    int age = s.getAge();
                    int sumAge = 0;
                    while (age > 0) {
                        sumAge = sumAge + age % 10;
                        age = age / 10;
                    }
                    if (s.getName().length() == sumAge) {
                        System.out.println(s);
                    }

                });

        //Task9
        List<Animal> animals = new ArrayList<>();
        people.stream()
                .forEach(s -> animals.add(new Animal(s.getAge(),(s.getName()+s.getSurname()))));
        System.out.println(animals);
        //Task7

        people.stream()
                .sorted((s,s1) -> Integer.compare(s.getAge(),s1.getAge()))
                .forEach(s -> System.out.println(s));

        //Przerob to wszystko na osobne metody ciolku




    }
}
