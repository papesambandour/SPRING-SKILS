package presentation;

import metier.IMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationBySpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"config.xml"});
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println(metier.calcule());
    }
}
