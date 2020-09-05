package com.io.document.json.jsonb;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("jun");
        book.setId("1111");
        book.setTitle("software");
        book.setDate(new Date());
        Jsonb jsonb = JsonbBuilder.create();
        System.out.println(jsonb.toJson(book));
    }
}
