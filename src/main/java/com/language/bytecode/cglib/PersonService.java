package com.language.bytecode.cglib;

public class PersonService {
    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String sayWorld(String name) {
        return sayHello(name);
    }

}
