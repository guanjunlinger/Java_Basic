package com.chain.filter;

public class MyTypeFilter implements Filter{
    @Override
    public void dofilter(FilterContext filterContext, FilterChain filterChain) {
     System.out.println(getClass().getSimpleName());
     filterChain.doFilter(filterContext);
    }
}
