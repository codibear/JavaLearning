package OnClass.XmlTest;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by 29185 on 2017/6/19.
 */
public class CreateXml {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.newDocument();//读取的时候相当于root

            Element root = document.createElement("books");
            Element book = document.createElement("book");
            Attr attr = document.createAttribute("id");
            attr.setValue("001");
            book.setAttributeNode(attr);
            root.appendChild(book);

            //子节点
            Element name = document.createElement("name");
            //1.直接set
            name.setTextContent("小熊维尼");
            //2.appendchild添加
            Element type = document.createElement("type");
            Text text = document.createTextNode("童话");
            type.appendChild(text);

            book.appendChild(name);
            book.appendChild(type);

            TransformerFactory ttf = TransformerFactory.newInstance();
            Transformer tf= ttf.newTransformer();

            File file = new File("E://book.xml");
            FileOutputStream fos = new FileOutputStream(file);
            StreamResult sr = new StreamResult(fos);

            DOMSource domSource = new DOMSource(root);

            tf.transform(domSource,sr);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }catch (TransformerConfigurationException e){
            e.printStackTrace();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (TransformerException e ){

        }
    }
}
