package com.language;

public class CustomFinalize {

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this);
    }
}
