package ph.springframework.spring6di.controller;

import ph.springframework.spring6di.Service.sayGreetingService;

public class SetterController {
    private sayGreetingService service;;

    public void setGreetingService(sayGreetingService service) {
        this.service = service;
    }

    public String sayHello() {
       return service.sayGreeting();
    }
}
