package com.gaoxinjie.xmltest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class XmlDemo01 {
    public static void main(String[] args) {
        SAXReader saxReader =new SAXReader();
        try {
            Document document = saxReader.read("day04/student.xml");
            Element rootElement = document.getRootElement();
            List<Element> elements = rootElement.elements();
            for (Element element : elements) {
                String id = element.elementText("age");
                System.out.println(id);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}

