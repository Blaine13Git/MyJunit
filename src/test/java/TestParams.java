import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestParams {

    @Parameterized.Parameter
    public JSONObject jsonObject;

    @Parameters
    public static Collection getData() throws Exception {
        return ParamsTool.getCaseData();
    }

    @Test
    public void case_01() {
        System.out.println("age:" + jsonObject.get("age"));
    }


}
