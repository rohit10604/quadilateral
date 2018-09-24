package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {


    public static void main(String args[]){
       // just fetch test.DrawingService from Spring context and call drawShape method.

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        /*applicationContext = new AnnotationConfigApplicationContext("test.Config");*/
        Drawing d = (Drawing) applicationContext.getBean("draw");

        d.drawShape();



    }
}
