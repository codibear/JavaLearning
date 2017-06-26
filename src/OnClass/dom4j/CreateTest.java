package OnClass.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 29185 on 2017/6/20.
 * <books>
     <book type="励志">
         <name>追风筝的人</name>
         <bookNum xmlns="10010"/>
     </book>
     <book type="百味">
         <name>从百草堂到三味书屋</name>
         <bookNum xmlns="1001011"/>
     </book>
 </books>
 */
public class CreateTest {
    public static void main(String[] args) {
        //创建一个文件对象
        Document document = DocumentHelper.createDocument();
        //创建根节点
        Element root = document.addElement("books");
        Element child = root.addElement("book");
        child.addAttribute("type","励志");

        //孙子节点
        //方法1：两步去赋值
        Element childChild1 = child.addElement("name");
        childChild1.addText("追风筝的人");
        //方法2：一步就赋值,<bookNum xmlns="1001011"/> 并不是想要的效果
        child.addElement("bookNum","10010");

        Element book1 = root.addElement("book");
        book1.addAttribute("type","百味");
        Element name =book1.addElement("name");
        name.addText("从百草堂到三味书屋");
        book1.addElement("bookNum","1001011");

        //写到本地

        //防止乱码
        OutputFormat format = new OutputFormat();
        format.setEncoding("UTF-8");
        File file = new File("E://dom4j.xml");
        try {
            FileWriter  fileWriter = new FileWriter(file);
            XMLWriter xmlWriter = new XMLWriter(fileWriter,format);
            xmlWriter.write(document);
            xmlWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
