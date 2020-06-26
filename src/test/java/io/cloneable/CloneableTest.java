package io.cloneable;

import com.io.cloneable.SubType;
import org.testng.annotations.Test;

public class CloneableTest {

    @Test
    public void test() throws CloneNotSupportedException {
        SubType subType = new SubType();
        subType.setAddress("111");
        subType.setAge(11);
        subType.setName("123213e");

        SubType clone = (SubType) subType.clone();
        System.out.println(clone.getAge() == subType.getAge());
    }

}
