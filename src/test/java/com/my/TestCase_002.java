package com.my;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCase_002 {

    @Category(SmokeTest.class)
    @Test
    public void case01() {
        System.out.println("002_case01");
    }

    @Category(RegressionTest.class)
    @Test
    public void case02() {
        System.out.println("002_case02");
    }

    @Test
    public void case03() {
        System.out.println("002_case03");
    }
}
