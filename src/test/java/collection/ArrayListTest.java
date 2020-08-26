package collection;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

    /**
     * OutOfMemoryError: Requested array size exceeds VM limit
     */
    @Test
    public void testCapacity() {
        new ArrayList(Integer.MAX_VALUE);

    }

    /**
     * 创建迭代器之后,修改List结构
     */
    @Test
    public void testFastFail() {
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        Iterator<String> iterator = list.iterator();
        list.remove("111");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
