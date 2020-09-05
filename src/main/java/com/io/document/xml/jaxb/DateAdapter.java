package com.io.document.xml.jaxb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {
    private static final DateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public Date unmarshal(String date) throws Exception {
        return SDF.parse(date);
    }

    @Override
    public String marshal(Date date) {
        return SDF.format(date);
    }
}
