package com.my;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class _004_02_TestRules extends CaseBase {

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
