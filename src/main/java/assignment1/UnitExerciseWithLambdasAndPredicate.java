package assignment1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class UnitExerciseWithLambdasAndPredicate {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

//        Step 1: Sort list by last name

        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        System.out.println("Printing all names");
//        Step 2: Create a method that prints all elements in the list
        printConditionally(people, p -> true);
        System.out.println();
//        Step 3: Create a method that prints all people that have the last name beginning with C
        System.out.println("Printing names that start with C");
        printConditionally(people, p -> p.getFirstName().startsWith("C"));

        System.out.println("Printing names that end with C");
        printConditionally(people, p -> p.getLastName().startsWith("C"));

    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p : people){
            if(predicate.test(p))
                System.out.println(p);
        }
    }

}

