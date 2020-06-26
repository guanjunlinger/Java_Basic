package com.language;

public enum MyEnum {
    FIRST(1) {
        @Override
        public void print() {
            System.out.println("first");
        }

    },
    SECOND(2) {
        @Override
        public void print() {
            System.out.println("second");
        }

    };

    private int code;

    MyEnum(int code) {
        this.code = code;
    }

    abstract public void print();

}
