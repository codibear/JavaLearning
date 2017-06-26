package OnClass.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

/**
 * Created by 29185 on 2017/6/20.
 */
public class ReadTest {
    public static void main(String[] args) {
        //创建dom4j的读取文件对象
        SAXReader saxReader = new SAXReader();
        File file = new File("E://dom4j.xml");
        try {
            //进入文件
            Document document = saxReader.read(file);
            //根节点
            Element root = document.getRootElement();
            System.out.println("根节点："+root.getStringValue());
            //迭代所得到的内容
            Iterator<Element> eIt = root.elementIterator();
            //获得其中的一个标签的循环-----------并没有管用
            Iterator<Element> book1=root.elementIterator("追风筝的人");
            while (book1.hasNext()){
                Element firstAttr=book1.next();
                System.out.println("根节点的第一个book节点"+firstAttr.getStringValue());
                //标签内的属性必须通过迭代器
                Iterator<Attribute> attrIn  = firstAttr.attributeIterator();
                while (attrIn.hasNext()){
                    System.out.println("book节点中的属性："+attrIn.next().getValue());
                }
                //标签的字标签（属性）
                Iterator<Element> bookField = firstAttr.elementIterator();
                while (bookField.hasNext()){
                    System.out.println("真正的内部属性"+bookField.next().getText());
                }
                firstAttr.elementIterator();
            }


            System.out.println("-----------------------------------------");
            System.out.println("根节点迭代器："+eIt);
            while (eIt.hasNext()){
                Element book = eIt.next();
                System.out.println(book);
                //获得标签上的属性
                System.out.println("父标签");
                Iterator<Attribute> attr=book.attributeIterator();
                while (attr.hasNext()){
                    Attribute attrValue = attr.next();
                    System.out.println("标签属性："+attrValue.getValue());
                }

                //获得子节点的子节点
                Iterator<Element> files= book.elementIterator();
                while (files.hasNext()){
                    Element shuxing =  files.next();
                    System.out.println("子属性："+shuxing);
                    System.out.println("属性值："+shuxing.getText());
                }
            }


        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
