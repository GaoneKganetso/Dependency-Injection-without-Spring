package controllers;

import org.springframework.stereotype.Controller;
import services.GreetingService;

@Controller
public class MyController {

     /*
     greetingService comes from  primaryGreetinbgService class which is set
     as a primary bean.
     Use it to create a constructor
      */
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        /*System.out.println("Hello World");
        return "Hi Folks";
         */

        return  greetingService.sayGreeting();
    }
}
