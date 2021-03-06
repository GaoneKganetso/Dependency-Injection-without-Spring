package guruspringframework.sfgdi;

import controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		ProfileController profileController = (ProfileController)  ctx.getBean("profileController");
		System.out.println(profileController.sayHello());


		MyController myController = (MyController) ctx.getBean("myController");

		// String greeting =controller2.sayHello();
		//System.out.println(greeting);

		System.out.println("    ----Primary Bean");
		System.out.println(myController.sayHello());


		/**
		 * gives error if you do not annotate the property injected controller class
		 */

		System.out.println("  ---PROPERTY    ");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)  ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("  ---SETTER   ");
		SetterInjectionController setterInjectionController = (SetterInjectionController)  ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("  ---Constructor    ");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)  ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
