package ph.springframework.spring6di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ph.springframework.spring6di.controller.MyController;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {

      ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("Tổng chính");

        System.out.println(controller.sayHello());
    }

}
