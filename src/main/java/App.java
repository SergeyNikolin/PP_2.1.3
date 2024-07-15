import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hw1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld hw2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat c1 = (Cat) applicationContext.getBean("cat");
        Cat c2 = (Cat) applicationContext.getBean("cat");
        System.out.println("hw1 == hw2: " + (hw1 == hw2));
        System.out.println("c1 == c2: " + (c1 == c2));
    }
}