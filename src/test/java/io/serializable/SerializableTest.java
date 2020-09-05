package io.serializable;

import com.io.serializable.jdk.SubType;
import org.testng.annotations.Test;


import java.io.*;

public class SerializableTest {

    @Test
    public void test() throws IOException, ClassNotFoundException {
        SubType subType = new SubType();
        subType.setAddress("beijing");
        subType.setName("asd");
        subType.setAge(111);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(subType);

        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        SubType subType1 = (SubType) objectInputStream.readObject();
        System.out.println(subType1.getAddress());
    }
}
