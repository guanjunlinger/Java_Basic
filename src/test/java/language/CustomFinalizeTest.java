package language;

import com.language.CustomFinalize;
import org.testng.annotations.Test;

public class CustomFinalizeTest {
    @Test
    public void test() {
        while (true) {
            CustomFinalize customFinalize = new CustomFinalize();
            customFinalize = null;
        }

    }
}
