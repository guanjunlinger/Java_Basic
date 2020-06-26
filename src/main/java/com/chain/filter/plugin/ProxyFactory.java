package com.chain.filter.plugin;

import java.util.ArrayList;
import java.util.List;

public class ProxyFactory {


    public static Executor getProxy(Executor executor, List<ProxyInvocationHandler> list) {
        Executor exe = executor;
        for (ProxyInvocationHandler proxyInvocationHandler : list) {
            exe = proxyInvocationHandler.wrap(exe);
        }
        return exe;
    }

    public static void main(String[] args) {
        Executor executor=new MyExecutor();
        List<ProxyInvocationHandler> list=new ArrayList<>(16);
        list.add(new FirstInvocationHandler());
        list.add(new SecondInvocationHandler());
        executor=ProxyFactory.getProxy(executor,list);
        executor.executor("proxy");

    }

}
