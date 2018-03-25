package com.my;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Vector;

public class _004_01_TestRules {

    @Rule
    public Retry times = new Retry(2);

    @Test
    public void case_01() {
        Assert.assertTrue("case_01", true);
    }

    int count = 0;

    @Test
    public void case_02() {
        System.out.println(count++);
        Assert.assertTrue("case_02", false);
    }
}
