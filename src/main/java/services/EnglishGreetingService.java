package services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
How to set default profile
@Profile ({"EN","default"})
remove active profile in the application properties
 */

@Profile("EN")
@Service("GreetingService")
public class EnglishGreetingService  implements  GreetingService{
    @Override
    public String sayGreeting(){
        return  "Hello world- EN";
    }


}
