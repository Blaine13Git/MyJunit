package com.my;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = {TestCase_001.class, TestCase_002.class})
public class SmokeTest {
}
