package com.io.document.json.jsonb;

import lombok.Data;

import javax.json.bind.annotation.JsonbDateFormat;
import java.util.Date;

@Data
public class Book {
    private String id;
    private String title;
    private String author;
    @JsonbDateFormat(value = "yyyy-MM-dd")
    private Date date;
}
