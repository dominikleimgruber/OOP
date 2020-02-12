package ch.hslu.oop.mepprep.sw12.part1;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private final long id;
    private final String firstname;
    private String lastname;

    public Person(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Person[Firstname=" + firstname + ",Lastname=" + lastname + "]";
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return this.id == person.id;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Person o) {
        if(o == null){
            return 1;
        }
        return Long.compare(this.id, o.id);
    }
}
