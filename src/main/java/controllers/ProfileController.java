package controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import services.GreetingService;

@Controller
public class ProfileController {

    private  final GreetingService greetingService;


    public ProfileController(@Qualifier("") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String sayHello(){
        greetingService.sayGreeting();
        return  null;

    }



}
