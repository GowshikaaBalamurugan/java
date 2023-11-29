// {
package streams;

import java.util.*;
import java.util.stream.Collectors;

public class UnderAge {
// }

    public static Set<String> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        kids=people.stream().filter(p->p.getAge()>18).map(person->person.getName()).collect(Collectors.toSet());
        return kids;
    }

// {
}
// }
