package io.serializable.protostuff;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.DefaultIdStrategy;
import io.protostuff.runtime.IdStrategy;
import io.protostuff.runtime.RuntimeSchema;
import lombok.Data;
import org.testng.annotations.Test;

public class ProtoStuffTest {

    @Data
    public static class Foo {
        String name;
        int id;

        public Foo(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }

    @Test
    public void test() {
        final DefaultIdStrategy STRATEGY = new DefaultIdStrategy(IdStrategy.DEFAULT_FLAGS
                | IdStrategy.MORPH_COLLECTION_INTERFACES
                | IdStrategy.MORPH_MAP_INTERFACES
                | IdStrategy.MORPH_NON_FINAL_POJOS);
        Foo foo = new Foo("foo", 1);
        Schema<Foo> schema = RuntimeSchema.getSchema(Foo.class, STRATEGY);
        LinkedBuffer buffer = LinkedBuffer.allocate(512);

        final byte[] protostuff;
        try {
            protostuff = ProtostuffIOUtil.toByteArray(foo, schema, buffer);
        } finally {
            buffer.clear();
        }
        Foo fooParsed = schema.newMessage();
        ProtostuffIOUtil.mergeFrom(protostuff, fooParsed, schema);
        System.out.println("反序列化结果:" + fooParsed);
    }

}
