package io.externalizable;

import com.io.externalizable.CustomSerializable;
import org.testng.annotations.Test;

import java.io.*;

public class CustomExternalizableTest {

    @Test
    public void test() throws IOException, ClassNotFoundException {
        CustomSerializable customSerializable = new CustomSerializable();
        customSerializable.setName("beijing");
        customSerializable.setAge(111);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(customSerializable);

        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        CustomSerializable customSerializable1 = (CustomSerializable) objectInputStream.readObject();
        System.out.println(customSerializable1.getName());
    }

}
