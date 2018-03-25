package com.my;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SmokeTest.class)
@Suite.SuiteClasses(value = {TestCase_001.class, TestCase_002.class})
public class _006_01_TestCategory {
}
