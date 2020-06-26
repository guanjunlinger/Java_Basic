package methodhandle;

import org.testng.annotations.Test;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandleTest {

    @Test
    public void test() throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType mt = MethodType.methodType(String.class, char.class, char.class);
        MethodHandle mh = lookup.findVirtual(String.class, "replace", mt);
        System.out.println(mh.invoke("daddy", 'd', 'n'));
    }
}
