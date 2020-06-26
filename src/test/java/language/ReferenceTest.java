package language;

import com.language.CustomFinalize;
import org.testng.annotations.Test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceTest {
    @Test
    public void testWeakReference() throws InterruptedException {
        ReferenceQueue<CustomFinalize> queue = new ReferenceQueue<>();
        WeakReference<CustomFinalize> weakReference = new WeakReference(new CustomFinalize(), queue);
        Runtime.getRuntime().gc();
        System.out.println(queue.remove().get());


    }

    @Test
    public void testSoftReference() throws InterruptedException {
        ReferenceQueue<CustomFinalize> queue = new ReferenceQueue<>();
        SoftReference<CustomFinalize> softReference = new SoftReference(new CustomFinalize(), queue);
        Runtime.getRuntime().gc();
        System.out.println(queue.remove().get());
    }

    @Test
    public void testPhantomReference() throws InterruptedException {
        ReferenceQueue<CustomFinalize> queue = new ReferenceQueue<>();
        PhantomReference<CustomFinalize> phantomReference = new PhantomReference(new CustomFinalize(), queue);
        Runtime.getRuntime().gc();
        System.out.println(queue.remove().get());
    }

}
