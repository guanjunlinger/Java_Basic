package generic;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    @Test
    public void boundedWildcardTest() {
        List<Number> list = new ArrayList<>();
        addNumbers(list);
    }

    public static void addNumbers(List<? super Number> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
