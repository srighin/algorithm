package java8;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparePerson {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Sriman"));
        personList.add(new Person(5, "Rithika"));
        personList.add(new Person(5, "Avani"));
        personList.add(new Person(2, "Shilpi"));

        Comparator<Person> personComparator = Comparator.comparing(Person::getId)
                .thenComparing(Person::getName);

        Collections.sort(personList, personComparator);

        personList.stream().forEach(System.out:: print);
    }
}


class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
