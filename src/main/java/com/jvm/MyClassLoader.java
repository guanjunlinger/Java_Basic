package com.jvm;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author guanjun
 */
public class MyClassLoader extends ClassLoader {
    public MyClassLoader() {

    }

    public MyClassLoader(ClassLoader classLoader) {
        super(classLoader);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> clazz = null;
        String path = name.replace('.', '/').concat(".class");
        String dir = "/Users/guanjun/gitrepository/dp/target/classes/";
        File classFile = new File(dir + path);
        if (classFile.exists()) {
            try {
                byte[] b = Files.readAllBytes(classFile.toPath());
                clazz = defineClass(name, b, 0, b.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (null == clazz) {
            throw new ClassNotFoundException(name);
        }
        return clazz;

    }

    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoader myClassLoader1 = new MyClassLoader();
        Class<?> clazz1 = myClassLoader1.loadClass("com.Solution");
        System.out.println(clazz1.getClassLoader());

        MyClassLoader myClassLoader2 = new MyClassLoader(null);
        Class<?> clazz2 = myClassLoader2.loadClass("com.Solution");
        System.out.println(clazz2.getClassLoader());
    }
}
