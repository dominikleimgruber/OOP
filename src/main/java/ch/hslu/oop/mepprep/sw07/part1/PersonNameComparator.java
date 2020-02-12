package ch.hslu.oop.mepprep.sw07.part1;

import java.util.Comparator;
import java.util.Objects;

public final class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int compare = p1.getLastname().compareTo(p2.getLastname());
        if(compare == 0){
            compare = p1.getFirstname().compareTo(p2.getFirstname());
        }
        return  compare;
    }

    @Override
    public final boolean equals(Object o) {
        return o instanceof PersonNameComparator;
    }

    @Override
    public String toString() {
        return "PersonNameComparator";
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.toString());
    }
}
