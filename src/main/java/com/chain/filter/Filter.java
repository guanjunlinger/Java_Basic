package com.chain.filter;

public interface Filter {

    void dofilter(FilterContext filterContext,FilterChain filterChain);
}
