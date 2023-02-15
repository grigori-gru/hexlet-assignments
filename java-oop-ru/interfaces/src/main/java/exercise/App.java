package exercise;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> buildings, int n) {
        Collections.sort(buildings, (a, b) -> a.compareTo(b));

        return buildings.stream().map(el -> el.toString()).limit(n).collect(Collectors.toList());
    }
}
// END
