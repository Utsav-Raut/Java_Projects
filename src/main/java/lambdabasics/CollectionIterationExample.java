package lambdabasics;

import assignment1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        System.out.println("Using For Loop");
        for(int i=0; i<people.size(); i++)
            System.out.println(people.get(i));

        System.out.println("Using For In Loop");
        for(Person p : people)
            System.out.println(p);

//        The method of iteration in the above two cases is called external iteration since we are specifying the
//        condition of iteration.
//        Next we see internal iteration because now we are going to give the control of iteration to somebody else

        System.out.println("Using plain lambdas");
        people.forEach(p-> System.out.println(p));

        System.out.println("Using lambda method reference");
        people.forEach(System.out::println);
    }
}
