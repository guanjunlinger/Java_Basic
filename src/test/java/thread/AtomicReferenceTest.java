package thread;

import lombok.Builder;
import lombok.Data;
import org.testng.annotations.Test;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {

    @Test
    public void test() throws InterruptedException {
        Student student = new Student("gua", 21);
        AtomicReference<Student> atomicReference = new AtomicReference<>(student);
        Thread thread1 = new Thread(() -> {
            atomicReference.compareAndSet(atomicReference.get(), Student.builder().age(22).name("jun").build());
            System.out.println("thread1:" + atomicReference.get());
        });

        Thread thread2 = new Thread(() -> {
            atomicReference.compareAndSet(atomicReference.get(), Student.builder().age(23).name("jung").build());
            System.out.println("thread2:" + atomicReference.get());
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("main class:" + atomicReference.get());


    }

    @Builder
    @Data
    static final class Student {
        private String name;
        private Integer age;

    }
}
