package services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("GreetingService")
public class SpanishGreetingService implements GreetingService {
    @Override

    public  String sayGreeting(){
        return "Hola Mundo - ES";
    }

}
