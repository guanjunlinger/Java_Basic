package language.bytecode;

import com.language.bytecode.cglib.PersonService;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.*;
import org.testng.annotations.Test;

public class CglibTest {


    @Test
    public void testFixedValueCallback() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        enhancer.setCallback((FixedValue) () -> "Hello Tom!");
        PersonService proxy = (PersonService) enhancer.create();
        System.out.println(proxy.sayHello(null));
    }

    @Test
    public void testMethodInterceptor() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
                System.out.println("111");
                return proxy.invokeSuper(obj, args);
        });

        PersonService proxy = (PersonService) enhancer.create();
        System.out.println(proxy.sayWorld("222"));


    }

    @Test
    public void testCallBackFilter() {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, getClass().getResource("").getPath());
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        Callback[] callbacks = new Callback[2];
        callbacks[0] = (FixedValue) () -> "Hello Tom!";
        callbacks[1] = (MethodInterceptor) (obj, method, args, proxy) -> {
            if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
                return "Hello World!";
            } else {
                return proxy.invokeSuper(obj, args);
            }
        };
        enhancer.setCallbacks(callbacks);
        CallbackFilter callbackFilter = (method) -> {
            String name = method.getName();
            if (name.equals("sayHello"))
                return 0;
            if (name.equals("sayWorld"))
                return 1;
            return 0;
        };
        enhancer.setCallbackFilter(callbackFilter);
        PersonService proxy = (PersonService) enhancer.create();
        System.out.println(proxy.sayHello("123"));
        System.out.println(proxy.sayWorld("111"));
    }

}
