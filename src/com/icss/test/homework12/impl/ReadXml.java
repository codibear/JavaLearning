package com.icss.test.homework12.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
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
public class ReadXml {
    public static void main(String[] args) {
        System.out.println(getDriver());
    }
    public static Element accessXml(){
        Element root=null;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db= dbf.newDocumentBuilder();

            //Document d = db.parse(new File("E:\\javaApp\\TestJava\\src\\com\\icss\\test\\homework12\\xml\\SourceXml.xml"));//不算url？
            //Document d =db.parse(new File(ReadXml.class.getClassLoader().getResource("SourceXml.xml").getFile()));
            Document d = db.parse(new File("../xml/SourceXml.xml"));
            root = d.getDocumentElement();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
      }catch (SAXException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return root;
    }

    public static String getDriver(){
        Element root = accessXml();
        NodeList nodeList = root.getElementsByTagName("classforname");
        String value = nodeList.item(0).getTextContent();//用这个才能得到标签外的文本内容
        //value = nodeList.item(0).getNodeValue();
        //System.out.println(nodeList.item(0).getNodeValue());//这个只能得到标签内的属性
       return value;
    }
    public static String getPasswd(){
        Element root = accessXml();
        NodeList nodeList = root.getElementsByTagName("password");
        String value = nodeList.item(0).getTextContent();//用这个才能得到标签外的文本内容
        //value = nodeList.item(0).getNodeValue();
        //System.out.println(nodeList.item(0).getNodeValue());//这个只能得到标签内的属性
        return value;
    }
    public static String getConnection(){
        Element root = accessXml();
        NodeList nodeList = root.getElementsByTagName("connection");
        String value = nodeList.item(0).getTextContent();//用这个才能得到标签外的文本内容
        //value = nodeList.item(0).getNodeValue();
        //System.out.println(nodeList.item(0).getNodeValue());//这个只能得到标签内的属性
        return value;
    }
    public static String getAccount(){
        Element root = accessXml();
        NodeList nodeList = root.getElementsByTagName("account");
        String value = nodeList.item(0).getTextContent();//用这个才能得到标签外的文本内容
        //value = nodeList.item(0).getNodeValue();
        //System.out.println(nodeList.item(0).getNodeValue());//这个只能得到标签内的属性
        return value;
    }

}
