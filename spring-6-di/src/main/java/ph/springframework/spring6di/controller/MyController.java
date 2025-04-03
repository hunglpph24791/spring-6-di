package ph.springframework.spring6di.controller;

import org.springframework.stereotype.Controller;
import ph.springframework.spring6di.Service.sayGreetingService;
import ph.springframework.spring6di.Service.sayGreetingServiceImpl;

@Controller
public class MyController {

   private final sayGreetingService gettingService;

   public MyController() {
       this.gettingService = new sayGreetingServiceImpl();
   }

   public String sayHello() {
       System.out.println("Tôi là Hùng");
        return gettingService.sayGreeting();
    }

}
