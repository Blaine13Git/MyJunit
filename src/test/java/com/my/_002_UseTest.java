package com.my;

import org.junit.*;

import java.util.ArrayList;

public class _002_UseTest {

    @Test(timeout = 3000)
    public void case_01() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("case_01");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void case_02() {
        ArrayList<String> data = new ArrayList();
        System.out.println(data.get(1));
        System.out.println("case_02");
    }
}
