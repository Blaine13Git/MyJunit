package com.my;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 回归测试
 */
@RunWith(Categories.class)
@Suite.SuiteClasses({TestCase_001.class,TestCase_002.class})
public class RegressionTest {

}
