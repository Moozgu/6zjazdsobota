package Strumienie.Tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person (6,"Aleksandra", "Scholz"));
        people.add(new Person (13,"Lukasz", "Gilga"));
        people.add(new Person (25,"Oskar", "Polak"));
        people.add(new Person (13,"Nina", "Zdrzenicka"));
        people.add(new Person (44,"Jarek", "Soli"));
        people.add(new Person (38,"Melisandre", "Tarth"));
        people.add(new Person (29,"Salazar", "Wizard"));
        people.add(new Person (38,"Melisandre", "Melisandre"));
//        task2(people);
//        task5(people);
//        task8(people);
//        task6(people);
//        task9(people);
//        task7(people);
//        task11(people);
//        task11proper(people);
//        task10(people);
//        task3(people);
        task3proper(people);
//        task4(people);
//        task1(people);

    }
    private static void task1(List<Person> people){
        Map<Integer, List<Person>> grouped = people
                .stream()
                .collect(Collectors.groupingBy(s->s.getSurname().length()));
        System.out.println(grouped);

    }
    private static void task2(List<Person> people ){
        people.stream()
                .mapToInt(s -> s.getAge())
                .average()
                .ifPresent(s -> System.out.println(s));

    }
    private static void task3(List<Person> people){
        System.out.println(people.stream()
                .max(Comparator.comparingInt(Person::getAge)));


    }
    private static void task3proper(List<Person> people){
        people.stream()
                .max(((s,s1) -> Integer.compare(s.getAge(),s1.getAge())*-1))
                .map(s -> new Person(s.getAge(),s.getName(),s.getSurname()))
                .ifPresent((s -> System.out.println("Medrzec " + s)));
    }

    private static void task4 (List<Person> people){

        people.stream()
                .map(s -> new Person (s.getAge(),s.getName().substring(s.getName().length()-1),s.getSurname().substring(s.getSurname().length()-1)))
                .reduce ((s,s1) -> new Person((s.getAge()+s1.getAge()),
                        (s.getName()
                                +s1.getName().substring(s1.getName().length()-1)),
                        (s.getSurname()
                                +s1.getSurname().substring(s1.getSurname().length()-1))
                        ))
                .ifPresent(s -> System.out.println(s));


    }
    private static void task5(List<Person> people){
        List<Integer> peopleAge;
        peopleAge = people.stream()
                .map(s -> s.getAge())
                .collect(Collectors.toList());

        System.out.println(peopleAge);

    }

    private static void task6(List<Person> people){
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
    }
    private static void task7(List<Person> people){
        people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(s -> System.out.println(s));

    }
    private static void task8(List<Person> people){
        List<Person> morePeople = new ArrayList<>();
        people.stream()
                .distinct()
                .forEach(s -> morePeople.add(new Person(s.getAge(),s.getName(),s.getSurname())));

        System.out.println("Powtarzalo sie " + (people.size()-morePeople.size()) + " osob");

    }
    private static void task9(List<Person> people){
        List<Animal> animals = new ArrayList<>();
        people.stream()
                .forEach(s -> animals.add(new Animal(s.getAge()/10,(s.getName()+s.getSurname()))));
        System.out.println(animals);
    }
    private static void task10(List<Person> people){
        people.stream()
                .forEach(s -> {
                    int dogAge = s.getAge()*6-2;
                    if(dogAge>=50){
                        System.out.println(s);
                    }
                });
    }
    private static void task11(List<Person> people){
        List<Person> equalNameSurnamePeople = new ArrayList<>();
        people.stream()
                .forEach(s -> {
                    if (s.getName().length()==s.getSurname().length()){
                        equalNameSurnamePeople.add(s);
                    }
                });
        System.out.println(equalNameSurnamePeople);
    }
    private static void task11proper(List<Person> people){

        Map<Integer, List<Person>> grouped = people
            .stream()
                .collect(Collectors.groupingBy(s -> s.getName().length()+s.getSurname().length()));
        System.out.println(grouped);

    }


}
