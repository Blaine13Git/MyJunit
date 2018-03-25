package com.my;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class BaseRules {

    @Rule
    public Retry retry = new Retry(3);

    @Rule
    public TestRule listen = new TestWatcher() {
        @Override
        protected void succeeded(Description description) {
            super.succeeded(description);
            System.out.println("成功：" + description.getMethodName());
        }

        @Override
        protected void failed(Throwable e, Description description) {
            super.failed(e, description);
            System.out.println("失败：" + description.getMethodName());
        }
    };
}
