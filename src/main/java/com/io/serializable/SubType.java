package com.io.serializable;

import lombok.Data;

import java.io.IOException;
import java.io.Serializable;

@Data
public class SubType extends SuperType implements Serializable {

    private Integer age;

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeUTF(getAddress());
        out.writeUTF(getName());

    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        setAddress(in.readUTF());
        setName(in.readUTF());


    }

}
