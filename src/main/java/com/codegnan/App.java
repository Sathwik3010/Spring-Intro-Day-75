package com.codegnan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codegnan.beans.Employee10;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        BeanFactory factory=new XmlBeanFactory
//        		(new ClassPathResource("spring.xml"));
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

//        Employee10 employee=(Employee10)factory.getBean("employee10");
        Employee10 employee=context.getBean(Employee10.class,"employee10");

        employee.DisplayEmpDetails();
    }
}
