package com.chain.filter;

public interface FilterContext {
    String getAttribute(String key);

    String addAttribute(String key, String value);

    String removeAttribute(String key);
}
