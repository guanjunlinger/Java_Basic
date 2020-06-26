package language.bytecode;

import com.language.bytecode.jdk.IUserService;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class JdkProxy {

    @Test
    public void testProxy() {
        InvocationHandler invocationHandler = ((proxy, method, args) -> {
            String name = method.getName();
            System.out.println(name + ":" + args[0]);
            return null;
        });
        IUserService userService = (IUserService) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{IUserService.class}, invocationHandler);
        userService.sayHello("1111");
    }
}
