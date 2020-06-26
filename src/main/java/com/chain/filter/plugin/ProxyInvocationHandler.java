package com.chain.filter.plugin;

import java.lang.reflect.InvocationHandler;

public interface ProxyInvocationHandler extends InvocationHandler {
    Executor wrap(Executor executor);
}
