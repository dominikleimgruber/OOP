package ch.hslu.oop.mepprep.sw12.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonCompare {


    public static void main(String[] args) {


        Person person1 = new Person(1, "Dominik", "Test");
        Person person2 = new Person(2, "Fernando", "Alonso");
        Person person3 = new Person(3, "Avi", "Mustermann");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

         Comparator<Person> nameComp = (p1, p2) -> p1.getLastname().compareTo(p2.getLastname());
         Comparator<Person> firstnameComp = (p1, p2) -> p1.getFirstname().compareTo(p2.getFirstname());

        Collections.sort(personList, firstnameComp.reversed());
        personList.stream().forEach(System.out::println);

        System.out.println();

        Collections.sort(personList, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));
        personList.stream().forEach(System.out::println);

        System.out.println();


    }

}
