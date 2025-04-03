package ph.springframework.spring6di.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ph.springframework.spring6di.Service.sayGreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorControllerTest {

    ConstructorController constructorController;


    @BeforeEach
    void setUp() {
         constructorController = new ConstructorController(new sayGreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(constructorController.sayHello());
    }
}