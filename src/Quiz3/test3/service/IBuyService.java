package Quiz3.test3.service;

import Quiz3.test3.po.CustomList;
import Quiz3.test3.po.Goods;

import java.util.ArrayList;

/**
 * Created by 29185 on 2017/6/9.
 */
public interface IBuyService {
    ArrayList<CustomList> buy(ArrayList<Goods> goods);
}
