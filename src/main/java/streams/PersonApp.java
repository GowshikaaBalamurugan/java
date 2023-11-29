package streams;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonApp {
    public static void main(String[] args) {
        List<Person> persons= List.of(new Person("Sarat",30,"Indian"),new Person("Gowshikaa",28,"Indian"),new Person("Angel",16,"US"),new Person("Nemo",45,"African"),new Person("Rose",60,"Australian"));
        System.out.println(getKidNames(persons));
        System.out.println(getOldestPerson(persons));

    }
    public static Set<String> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        kids=people.stream().filter(p->p.getAge()>18).map(person->person.getName()).collect(Collectors.toSet());
        return kids;
    }
    public static String getOldestPerson(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        oldestPerson=people.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getAge))).stream().collect(Collectors.toList()).get(0);
        return oldestPerson.getName();
    }
}
