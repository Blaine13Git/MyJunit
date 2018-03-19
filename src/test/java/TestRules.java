import org.junit.Assert;
import org.junit.Test;

public class TestRules extends CaseBase {

    @Test
    public void case_01() {
        Assert.assertTrue("成功的秘诀", true);
    }

    @Test
    public void case_02() {
        Assert.assertTrue(false);
    }
}
