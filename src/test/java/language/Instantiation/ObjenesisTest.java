package language.Instantiation;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;
import org.objenesis.instantiator.ObjectInstantiator;
import org.testng.annotations.Test;

import java.util.Objects;

public class ObjenesisTest {

    @Test
    public void testObjenesisStd() {
        Objenesis objenesis = new ObjenesisStd();
        ObjectInstantiator objectInstantiator = objenesis.getInstantiatorOf(MyObject.class);
        MyObject myObject = (MyObject) objectInstantiator.newInstance();
        System.out.println(Objects.isNull(myObject.getList()));

    }
}
