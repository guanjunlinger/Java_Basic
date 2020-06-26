package com.chain.filter.plugin;


import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecondInvocationHandler implements ProxyInvocationHandler {

    private Executor executor;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(getClass().getSimpleName());
        return method.invoke(executor, args);
    }

    @Override
    public Executor wrap(Executor executor) {
        this.executor = executor;
        return (Executor) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Executor.class}, this);


    }
}
