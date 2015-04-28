package io.github.vdubois.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by vdubois on 25/04/15.
 */
public class LambdasExample {

    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "green", "blue", "black", "grey");
        List<Person> persons = Arrays.asList(
                new Person("Frodon", "Sacquet"),
                new Person("Bilbon", "Sacquet"),
                new Person("Sam", "Gamegie"),
                new Person("Peregrin", "Touque"),
                new Person("Meriadoc", "Brandebouc"));
        Map<String, List<Person>> mapGroupedByLastName =
                persons.stream().filter(person -> "Sacquet".equals(person.getLastName()))
                        .collect(Collectors.groupingBy(Person::getLastName));
        System.out.println(mapGroupedByLastName);
        List<String> uppercasedColors = 
                colors.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercasedColors);
        List<String> sortedColors = uppercasedColors.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedColors);
    }
}
class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
