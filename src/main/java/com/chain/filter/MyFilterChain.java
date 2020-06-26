package com.chain.filter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MyFilterChain implements FilterChain {

    private List<Filter> filters;
    private int index = -1;

    public MyFilterChain(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public void doFilter(FilterContext filterContext) {
        if (index < filters.size() - 1) {
            Filter filter = filters.get(++index);
            filter.dofilter(filterContext, this);
        } else {
            System.out.println("真正的处理器逻辑");
        }

    }

    public static void main(String[] args) {
        List<Filter> filters=new ArrayList<>(4);
        filters.add(new MyHelloFilter());
        filters.add(new MyTypeFilter());

        MyFilterChain myFilterChain=new MyFilterChain(filters);
        FilterContext filterContext=new MyFilterContext();
        System.gc();
        myFilterChain.doFilter(filterContext);

    }

}
