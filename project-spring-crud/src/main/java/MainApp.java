import com.example.config.AppConfig;
import com.example.contoller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserController controller = context.getBean(UserController.class);
        controller.createUser("Dhiraj");
        controller.createUser("Niraj");
        controller.createUser("Bishal");
        controller.listUser();
    }
}
