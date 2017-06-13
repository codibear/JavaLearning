package Quiz3.test3.serviceimpl;

import Quiz3.test3.po.CustomList;
import Quiz3.test3.po.Goods;
import Quiz3.test3.service.IBuyService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/9.
 */
public class BuyServiceImpl implements IBuyService{
    static double sum=0;
    @Override
    public ArrayList<CustomList> buy(ArrayList<Goods> goods) {
        //存放购买信息
        ArrayList<CustomList> customLists= new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("有下列产品：");
        System.out.println("商品编号\t商品名称\t商品单价\t所有数量\t");
        //打印出所有的商品信息
        for (Object a:goods) {
            Goods goods1= (Goods)a;
            System.out.println(goods1.getId()+"\t\t\t"+goods1.getName()+"\t\t\t"+goods1.getPrice()+"\t\t\t"+goods1.getNum());
        }
        boolean check = true;
        while(check) {
            System.out.println("请输入要买的商品编号");
            int id = scanner.nextInt();
            System.out.println("请输入要买的商品数量：");
            int num = scanner.nextInt();
            int flag = 0;
            for (Object a : goods) {
                Goods goods1 = (Goods) a;
                //如果有这个商品
                if (id == goods1.getId()) {
                    //在购买范围
                    if (num <= goods1.getNum()) {
                        goods1.setNum(goods1.getNum() - num);
                        sum += num * goods1.getPrice();
                        System.out.println("购买成功！");
                        //存入账单列表
                        CustomList customList = new CustomList();
                        customList.setName(goods1.getName());
                        customList.setNum(num);
                        customList.setPrice(goods1.getPrice());
                        customLists.add(customList);
                    }else {
                        System.out.println("供不应求！");
                    }
                    flag = 1;
                }

            }
            if (flag == 0) {
                System.out.println("没有您输入的信息内容！");
            }
            System.out.println("是否继续购买？Y/N");
            String again = scanner.next();
            if(again.equalsIgnoreCase("n")){
                check=false;
            }
        }
        return customLists;
    }
    public void output(ArrayList<CustomList> customLists){
        System.out.println("以下为您的购买信息：");
        System.out.println("商品名称\t商品单价\t购买数量");
        for (Object o: customLists) {
            CustomList c=(CustomList)o;
            System.out.println(c.getName()+"\t\t\t"+c.getPrice()+"\t\t\t"+c.getNum());
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println("合计："+sum);
        System.out.println("打印日期："+calendar.get(Calendar.YEAR)+"年"+(calendar.get(Calendar.MONTH)+1)+"月"
                +calendar.get(Calendar.DAY_OF_MONTH)+"日"+calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
    }
}
