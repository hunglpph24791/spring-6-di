package ph.springframework.spring6di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import ph.springframework.spring6di.controller.MyController;

@SpringBootTest
class Spring6DiApplicationTests {
    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    MyController myController;


    @Test
    void AutowierdController() {
        System.out.println(myController.sayHello());
    }

    @Test
    void testGetControllerFrom(){
        MyController controller = applicationContext.getBean(MyController.class);

        System.out.println(controller.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
