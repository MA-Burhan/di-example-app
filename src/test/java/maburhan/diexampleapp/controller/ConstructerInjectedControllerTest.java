package maburhan.diexampleapp.controller;

import maburhan.diexampleapp.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructerInjectedControllerTest {

    ConstructerInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstructerInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}