package com.my;

import org.junit.Test;

public class EasyTest {

    private String name = "tom";

    @Test
    public void case_01() {
        System.out.println("case_01:" + name);
    }

    @Test
    public void case_02() {
        System.out.println("case_02:" + name);
    }
}
