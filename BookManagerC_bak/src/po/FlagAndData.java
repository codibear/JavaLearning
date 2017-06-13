package po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 29185 on 2017/6/12.
 */
public class FlagAndData implements Serializable{
    private int flag;
    //这个要写成Object类型，因为传递的数据不知一个类型
    private List<Object> ArrayList = new ArrayList();

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public List<Object> getArrayList() {
        return ArrayList;
    }

    public void setArrayList(List<Object> arrayList) {
        ArrayList = arrayList;
    }
}
