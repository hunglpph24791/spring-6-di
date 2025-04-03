package ph.springframework.spring6di.controller;

import ph.springframework.spring6di.Service.sayGreetingService;

public class PropertyInjectedController {

    sayGreetingService gettingService;

    public String sayHello() {
       return gettingService.sayGreeting();
    }
}
