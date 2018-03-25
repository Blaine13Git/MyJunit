package com.my;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class _003_01_ParamsTest {

    String name;
    String address;

    @Parameterized.Parameters
    public static Collection getData() {
        return Arrays.asList(new Object[][]{
                {"tom", "beijing"},
                {"jack", "shanghai"},
                {"bob", "guangzhou"}
        });
    }

    public _003_01_ParamsTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Test
    public void case_01() {
        System.out.println(name);
    }

    @Test
    public void case_02() {
        System.out.println(address);
    }
}
