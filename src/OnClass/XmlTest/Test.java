package OnClass.XmlTest;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by 29185 on 2017/6/19.
 */
public class Test {
    public static void main(String[] args) {
        //1.创建工厂类 DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            //2.创建 DocumentBuilder
            DocumentBuilder db = dbf.newDocumentBuilder();
            //3.创建 Document 导入文件路径
            File file = new File("E:/student.xml");
            Document d = db.parse(file);
            //获得根路径
            Element root = d.getDocumentElement();
            System.out.println("根节点名称："+root.getNodeName()+"值："+root.getNodeValue());

            //方法1.直接获得子节点，但是他也会解析中间的空格，所以不推荐
            NodeList nodeListType1=root.getChildNodes();
            //循环得到每个子节点
            for(int i = 0;i<nodeListType1.getLength();i++){
                System.out.println(nodeListType1.item(i));
                System.out.println("--------直接获得子节点---------");
                System.out.println("子节点名称："+nodeListType1.item(i).getNodeName()+"值："+nodeListType1.item(i).getNodeValue());
            }

            //方法2.通过标签名称，获得节点的相应值
            NodeList nodeListType2 = root.getElementsByTagName("student");
            for(int i = 0;i<nodeListType2.getLength();i++){
                System.out.println(nodeListType2.item(i));
                System.out.println("-------通过标签获得--发现没有text了（空格）--------");
                System.out.println("子节点名称："+nodeListType2.item(i).getNodeName()+"值："+nodeListType2.item(i).getNodeValue());
                //获得孙子节点

                //------------------会读取空格
                NodeList nodeListSunzi = nodeListType2.item(i).getChildNodes();

                //student标签中的属性
                System.out.println("=================获取属性==================");
                NamedNodeMap nnm = nodeListType2.item(i).getAttributes();
                for(int j = 0 ;j<nnm.getLength();j++){
                    System.out.println("**************Student标签上的属性************");
                    System.out.println("属性名称："+nnm.item(j).getNodeName()+"值："+nnm.item(j).getNodeValue());

                    //孙子节点的属性输出
                    System.out.println("**************Student标签下的属性（孙子节点）************");

                    //NamedNodeMap nnmSunzi = nodeListSunzi.item(j).getAttributes();  //这样写不行，因为最后的是文本文件
                    //System.out.println("属性名称："+nnmSunzi.item(j).getNodeName()+"值："+nnmSunzi.item(j).getNodeValue());

                    for(int z=0;z<nodeListSunzi.getLength();z++){

                        String value = nodeListSunzi.item(z).getTextContent();
                        if(!value.equals("")) {
                            System.out.println("值：" + value);
                        }
                    }
                }
            }


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }catch (IOException e ){
            e.printStackTrace();
        }catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
