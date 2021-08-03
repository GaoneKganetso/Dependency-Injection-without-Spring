package controllers;

import org.springframework.stereotype.Controller;
import services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private  final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    //public String getGreetingService() {
        //return greetingService.sayGreeting();
    //}

    //trial
    public String getGreeting(){
       return greetingService.sayGreeting();
    }

}
