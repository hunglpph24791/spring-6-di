package ph.springframework.spring6di.controller;

import ph.springframework.spring6di.Service.sayGreetingService;

public class ConstructorController {
    private final sayGreetingService service;

    public ConstructorController(sayGreetingService service) {
        this.service = service;
    }

    public String sayHello() {
        return service.sayGreeting();
    }
}
