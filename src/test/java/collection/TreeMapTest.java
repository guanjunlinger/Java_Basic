package collection;

import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {

    /**
     * Comparable接口禁止比较对象为null
     */
    @Test
    public void testComparableNull() {
        TreeMap treeMap = new TreeMap();
        treeMap.put("112", null);
        System.out.println(treeMap.get("112"));
        treeMap.put(null, 11);

    }

    /**
     * 与对NULL key的比较方式相关
     */
    @Test
    public void testComparatorNull() {
        Comparator<String> comparator = (a, b) -> {
            if (a == null) {
                if (b == null) {
                    return 0;
                } else {
                    return -1;
                }

            } else {
                if (b == null) {
                    return 1;
                }
                return a.compareTo(b);
            }
        };
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.put(null, 11);
        System.out.println(treeMap.get(null));

    }


}
