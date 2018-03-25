package com.my;

import org.junit.Assert;
import org.junit.Test;

public class EasyCase {

    private String name = "tom";

    @Test
    public void case01() {
        System.out.println("I am just case01 >" + name);
        Assert.assertTrue(false);
    }
}
