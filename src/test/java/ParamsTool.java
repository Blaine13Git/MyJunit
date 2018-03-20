import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;

public class ParamsTool {

    public static Collection<Object[]> getCaseData() throws Exception {
        ArrayList<Object[]> data = new ArrayList();
        JSONReader jsonReader = new JSONReader(new FileReader(System.getProperty("user.dir") + "\\caseData.json"));
        JSONObject object = (JSONObject) jsonReader.readObject();
        Object[] keys = object.keySet().toArray();
        for (Object key : keys) {
            JSONObject jsonObject = (JSONObject) object.get(key);
            data.add(new Object[]{jsonObject});
        }
        return data;
    }

}
