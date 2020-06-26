package com.io.cloneable;

import lombok.Data;

@Data
public class SubType extends SuperType implements Cloneable {
    private String address;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
