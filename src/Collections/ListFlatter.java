package Collections;

import java.util.List;
import java.util.stream.Collectors;

public class ListFlatter {
    public List<Integer> flattenList(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
