package CoreBook.finalkey;

import CoreBook.Inheritance.EAM.People;

/**
 * Created by 29185 on 2017/6/11.
 * final修饰的方法没法重写，能被重载么？
 */
public class FinalKeyUse extends People {
    People people = new People();
    //不成功people.id
    public void getName(String name){

    }

}
