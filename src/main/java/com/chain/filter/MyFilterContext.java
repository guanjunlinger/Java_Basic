package com.chain.filter;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class MyFilterContext implements FilterContext {

    private Map<String, String> properties = new HashMap<>(16);

    @Override
    public String getAttribute(String key) {
        return properties.get(key);
    }

    @Override
    public String addAttribute(String key, String value) {
        return properties.put(key, value);
    }

    @Override
    public String removeAttribute(String key) {
        return properties.remove(key);
    }
}
