import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Vector;

@RunWith(JUnit4.class)
public class TestRules extends CaseBase {

    @Test
    public void case_01() {
        Assert.assertTrue("成功的秘诀", true);
    }

    @Test
    public void case_02() {
        Vector vt = new Vector();
        Assert.assertTrue("成功的秘诀", false);
    }
}
