package com.servlet;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.AsyncContext;
import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component("/async")
public class AsyncController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        AsyncContext asyncContext = httpServletRequest.startAsync();
        ServletInputStream servletInputStream = httpServletRequest.getInputStream();
        new Thread(()->servletInputStream.setReadListener(new MyReadListener(asyncContext, servletInputStream))).start();
        System.out.println("ThreadName:" + Thread.currentThread().getName());
        return null;
    }

    private class MyReadListener implements ReadListener {
        private AsyncContext asyncContext;
        private ServletInputStream servletInputStream;
        private int bytes;

        public MyReadListener(AsyncContext asyncContext, ServletInputStream servletInputStream) {
            this.asyncContext = asyncContext;
            this.servletInputStream = servletInputStream;
        }

        @Override
        public void onDataAvailable() throws IOException {
            while (!servletInputStream.isFinished()) {
                byte buffer[] = new byte[10];
                int length = servletInputStream.read(buffer);
                if (length == -1) {
                    return;
                }
                bytes += length;
                System.out.println("ThreadName:" + Thread.currentThread().getName() + ",Read Bytes:" + bytes);
            }
        }

        @Override
        public void onAllDataRead() throws IOException {
            System.out.println(222);
            System.out.println("ThreadName:" + Thread.currentThread().getName());
            asyncContext.complete();
        }

        @Override
        public void onError(Throwable throwable) {
            System.out.println(111);
        }
    }
}
