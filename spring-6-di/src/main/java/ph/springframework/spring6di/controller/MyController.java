package ph.springframework.spring6di.controller;

import org.springframework.stereotype.Controller;
import ph.springframework.spring6di.Service.GettingService;
import ph.springframework.spring6di.Service.GettingServiceImpl;

@Controller
public class MyController {

   private final GettingService gettingService;

   public MyController() {
       this.gettingService = new GettingServiceImpl();
   }

   public String sayHello() {
       System.out.println("Tôi là Hùng");
        return "Tôi là trân";
    }

}
