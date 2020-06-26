package language;


import com.language.MyEnum;
import org.testng.annotations.Test;

public class EnumTest {
    @Test
    public void testEnumClass() {
        //枚举类型与枚举实例
        Class<? extends MyEnum> clazz = MyEnum.FIRST.getClass();
        System.out.println(clazz.isAnonymousClass());
        System.out.println(clazz.isEnum());
        System.out.println(Enum.class.isAssignableFrom(clazz));
        System.out.println(clazz.getSuperclass());
        System.out.println(MyEnum.class.isEnum());
    }
}
