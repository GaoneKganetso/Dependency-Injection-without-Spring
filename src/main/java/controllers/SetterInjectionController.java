package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import services.GreetingService;
@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    /**
     * @autowire tells spring framework that we want a service injected into th
     */
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
