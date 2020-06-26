package com.chain.filter;

public class MyHelloFilter implements Filter {
    @Override
    public void dofilter(FilterContext filterContext, FilterChain filterChain) {
        System.out.println("Hello");
        filterChain.doFilter(filterContext);
    }
}
