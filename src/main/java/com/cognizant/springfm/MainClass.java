package com.cognizant.springfm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MainClass {
    public static void main(String[] args) {
        BeanFactory beanFactory=
                new XmlBeanFactory(new FileSystemResource("springpgm.xml"));
        StudentInfo studentInfo=(StudentInfo) beanFactory.getBean("student");
        studentInfo.printCollege();


    }
}
