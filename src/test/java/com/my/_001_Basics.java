package com.my;

import org.junit.*;

public class _001_Basics {

    @BeforeClass
    public static void setUp_BeforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void tearDown_AfterClass() {
        System.out.println("AfterClass");
    }

    @Before
    public void setUp_before() {
        System.out.println("Before");
    }

    @After
    public void tearDown_After() {
        System.out.println("After");
    }

    @Test
    public void case_01() {
        System.out.println("case_01");
    }

    @Test
    public void case_02() {
        System.out.println("case_02");
    }

    @Test
    @Ignore
    public void case_03() {
        System.out.println("case_03");
    }
}
