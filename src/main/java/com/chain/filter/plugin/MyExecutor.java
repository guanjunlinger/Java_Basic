package com.chain.filter.plugin;

public class MyExecutor implements Executor {
    @Override
    public void executor(String name) {
        System.out.println("original executor");
    }
}
