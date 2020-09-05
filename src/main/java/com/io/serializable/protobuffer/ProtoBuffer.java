package com.io.serializable.protobuffer;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.runtime.RuntimeSchema;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ProtoBuffer {
    static RuntimeSchema<Po> poSchema = RuntimeSchema.createFrom(Po.class);

    private static byte[] decode(Po po) {
        return ProtostuffIOUtil.toByteArray(po, poSchema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
    }

    public static void main(String[] args) {
        InnerPo innerPo = new InnerPo(1, "InnerPo1");
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Po po = new Po(1, "Song", "备注", 24, new int[]{1, 2, 3, 4}, innerPo, list);
        byte[] bytes = decode(po);
        System.out.println("ProtoBuffer encode Size:" + bytes.length);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(bos)) {
            objectOutputStream.writeObject(po);
            System.out.println("jdk序列化Size:" + bos.size());

        } catch (IOException e) {
            System.err.println(e);

        }
    }

}
