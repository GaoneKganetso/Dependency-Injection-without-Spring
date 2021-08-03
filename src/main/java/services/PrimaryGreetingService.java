package services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*
Setting up a primary bean
 */

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting(){
        return  "hello -primary bean";
    }
}
